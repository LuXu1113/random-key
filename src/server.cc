#include "include/server.h"

#include <stdlib.h>
#include <memory.h>
#include <arpa/inet.h>     // inet_ntoa
#include <sys/socket.h>    // socket
#include <netinet/in.h>    // sockaddr_in
#include <glog/logging.h>
#include <vector>
#include <string>
#include "absl/strings/string_view.h"
#include "absl/strings/str_split.h"
#include "absl/strings/numbers.h"
#include "absl/random/random.h"
#include "include/base64.h"

namespace random_key {

Server::Server() :
  port_(-1),
  host_socket_fd_(-1),
  host_addr_(),
  thread_pool_(NULL) {
}

Server::~Server() {
}

int Server::start(const int port, const struct ServerOptions& options) {
  int ret = 0;

  do {
    port_ = port;
    host_socket_fd_ = socket(AF_INET, SOCK_STREAM, 0);
    if (host_socket_fd_ < 0) {
      LOG(ERROR) << "fail to create socket, ret = " << host_socket_fd_ << ".";
      ret = 1;
      break;
    }

    struct sockaddr_in host_addr_;
    bzero(&host_addr_, sizeof(host_addr_));
    host_addr_.sin_family = AF_INET;
    host_addr_.sin_addr.s_addr = INADDR_ANY;
    host_addr_.sin_port = htons(port);
    ret = bind(host_socket_fd_, (struct sockaddr*)&host_addr_, sizeof(host_addr_));
    if (0 != ret) {
      LOG(ERROR) << "fail to bind socket.";
      ret = 2;
      break;
    }

    ret = listen(host_socket_fd_, 5);
    if (0 != ret) {
      LOG(ERROR) << "fail to listen.";
      ret = 3;
      break;
    }

    thread_pool_ = new ThreadPool(options.maximum_working_threads_);
    for (;;) {
      struct sockaddr_in remote_addr;
      socklen_t remote_socket_len = sizeof(remote_addr);
      int remote_socket_fd = accept(host_socket_fd_, (struct sockaddr *)&remote_addr, &remote_socket_len);

      if (0 > remote_socket_fd) {
        LOG(ERROR) << "fail to accept request from " << inet_ntoa(remote_addr.sin_addr) << ".";
      } else {
        LOG(INFO) << "accept request from " << inet_ntoa(remote_addr.sin_addr) << ".";

        thread_pool_->add_job([remote_socket_fd, remote_addr] {
          char *buf = (char *)malloc(BUFSIZ + 1);
          int len = recv(remote_socket_fd, buf, BUFSIZ, 0);
          if (len > 0) {
            buf[len] = '\0';

            do {
              std::vector<std::string> lines = absl::StrSplit(buf, absl::MaxSplits('\n', 1));
              if (lines.size() < 1) {
                LOG(ERROR) << "fail to decode request, buf = " << buf;
                break;
              }

              std::vector<std::string> fields = absl::StrSplit(lines[0], ' ');
              if (fields.size() != 3 || fields[0] != "GET") {
                LOG(ERROR) << "fail to decode request, buf = " << buf;
                break;
              }

              std::vector<std::string> tokens = absl::StrSplit(fields[1], '/');
              if (tokens.size() != 3 || tokens[1] != "key") {
                LOG(ERROR) << "fail to decode request, buf = " << buf;
                break;
              }

              int key_len = 0;
              if ((!absl::SimpleAtoi(tokens[2], &key_len)) || (!(key_len > 0))) {
                LOG(ERROR) << "fail to decode request, buf = " << buf;
                break;
              }

              std::string key;
              key.reserve(key_len);
              absl::BitGen gen;
              for (int i = 0; i < key_len; ++i) {
                key.push_back(absl::uniform_int_distribution<char>(-128, 127)(gen));
              }

              std::string encode_str = base64_encode(key, false);
              encode_str.push_back('\n');

              // socklen_t sendbuflen = 0;
              // setsockopt(remote_socket_fd, SOL_SOCKET, SO_SNDBUF, (void*)&sendbuflen, len2);
              // getsockopt(remote_socket_fd, SOL_SOCKET, SO_SNDBUF, (void*)&sendbuflen, &len2);
              // LOG(INFO) << "now, sendbuf: " << sendbuflen;

              if (send(remote_socket_fd, encode_str.c_str(), encode_str.length(), 0) < 0) {
                LOG(ERROR) << "fail to send response to " << inet_ntoa(remote_addr.sin_addr) << ".";
              }
            } while (0);
          }

          free(buf);
          close(remote_socket_fd);
        });
      }
    }
  } while (0);

  if (0 != ret && 0 <= host_socket_fd_) {
    close(host_socket_fd_);
  }
  
  return ret;
}

// int Server::stop() {
//   LOG(FATAL) << "not support yet.";
//   return 0;
// }
// 
// int Server::join() {
//   LOG(FATAL) << "not support yet.";
//   return 0;
// }
// 
// void Server::run_until_asked_to_quit() {
// }

} // namespace random_key


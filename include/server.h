#ifndef RANDOM_KEY_INCLUDE_SERVER_
#define RANDOM_KEY_INCLUDE_SERVER_

#include "include/thread_pool.h"

namespace random_key {

struct ServerOptions {
  int maximum_working_threads_;
};

class Server {
 public:
  Server(const Server&) = delete;
  Server();
  ~Server();

  int start(const int port, const struct ServerOptions& options);
//   int stop();
//   int join();
//   void run_until_asked_to_quit();

 private:
  int port_;
  int host_socket_fd_;
  int host_addr_;
  ThreadPool *thread_pool_;
};

} // namespace random_key

#endif // RANDOM_KEY_INCLUDE_SERVER_

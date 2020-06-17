
#include <gflags/gflags.h>
#include <glog/logging.h>
#include "include/server.h"

DEFINE_int32(port, 1234, "listening port.");
DEFINE_int32(maximum_working_threads, 1, "maximum number of working threads.");

int main(int argc, char **argv) {
  GFLAGS_NAMESPACE::ParseCommandLineFlags(&argc, &argv, true);

  google::InitGoogleLogging(argv[0]);
  FLAGS_max_log_size = 100000;
  FLAGS_logbufsecs = 0;
  FLAGS_minloglevel = google::INFO;
  FLAGS_stderrthreshold = google::ERROR;
  google::InstallFailureSignalHandler();

  LOG(INFO) << "Step-1: starting random-key server ...";
  struct random_key::ServerOptions options;
  random_key::Server server;
  if (0 != server.start(FLAGS_port, options)) {
    LOG(FATAL) << "Step-1: failed.";
    return 1;
  }

  return 0;
}



cc_library(
  name = "server",
  srcs = [
    "include/thread_pool.h",
    "src/thread_pool.cc",
    "include/base64.h",
    "src/base64.cc",
    "include/server.h",
    "src/server.cc",
  ],
  includes = [
    "include",
  ],
  deps = [
    "@com_github_gflags_gflags//:gflags",
    "@com_github_google_glog//:glog",
    "@com_google_absl//absl/strings:strings",
    "@com_google_absl//absl/random:random",
  ],
  copts = [
    "--std=c++11",
    "-Wno-unused-parameter",
    "-fno-omit-frame-pointer",
    "-fPIC",
  ],
  visibility = ["//visibility:public"],
)

cc_binary(
  name = "random-key",
  srcs = [
    "src/random-key.cc",
  ],
  deps = [
    "@com_github_gflags_gflags//:gflags",
    "@com_github_google_glog//:glog",
    ":server",
  ],
  copts = [
    "--std=c++11",
    "-Wno-unused-parameter",
    "-fno-omit-frame-pointer",
    "-fPIC",
  ],
)


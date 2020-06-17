random-key
=================

By [Lu Xu](https://github.com/LuXu1113).

Contents
--------
1. [Introduction](#introduction)
1. [Usage](#usage)
1. [Documentation](#documentation)

---

### Usage

1. setup building tools (install python3 and bazel): sh set_env.sh
1. build: sh build.sh
1. output file: bazel-out/bin/random-key

### Documentation

1. Puppet deployment manifest is in directory: puppet/modules/random-key
1. Nagios health check script is in directory: nagios
1. Dockerfile is in directory: docker
1. Kubernetes deployment manifest (including resources statement and health check) is in directory: kubernetes

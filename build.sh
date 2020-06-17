#!/bin/bash

#-----------------------------   global config   -----------------------------#
source /etc/bashrc
source ~/.bashrc
source ~/.bash_profile

#----------------------------- working directory -----------------------------#
REAL_FILE=$(readlink -f $0)
SCRIPT_NAME=${REAL_FILE##*/}
SCRIPT_DIR=$(cd "$(dirname "${REAL_FILE}")"; pwd)

#-----------------------------  trap debug info ------------------------------#
function debug_info() {
  cmd=`sed -n $2p $1`
  echo "$(date +"%Y/%m/%d %H:%M:%S")][$1:$2][INFO] execute command \"${cmd}\" ..."
}
function error_info() {
  cmd=`sed -n $2p $1`
  echo "$(date +"%Y/%m/%d %H:%M:%S")][$1:$2][ERROR] \"${cmd}\" exit with status $3"
  exit $3
}

# trap 'debug_info ${SCRIPT_NAME} ${LINENO}' DEBUG
trap 'error_info ${SCRIPT_NAME} ${LINENO} $?' ERR

#-----------------------------   prepare bazel   -----------------------------#
export JAVA_HOME=${SCRIPT_DIR}/build_tools/jdk
export PATH=${SCRIPT_DIR}/build_tools/python3/bin:${SCRIPT_DIR}/build_tools/bazel/output:${PATH}

#-----------------------------   make clean   --------------------------------#
# bazel clean --async

#---------------------------------   worker   --------------------------------#
bazel build //:random-key --compilation_mode opt --copt=-maes --define with_glog=true --incompatible_disable_deprecated_attr_params=false --verbose_failures

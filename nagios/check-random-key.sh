#!/bin/bash

prog_path=/usr/bin
prog_name=random-key
prog_port=1234

# check if process is running and only one process is running
num_process=`lsof ${prog_path}/{prog_name} | grep "^${prog_name:0:9}" | wc -l`
if [[ "${num_process}" != "1" ]]; then
  exit 1
fi

# get pid
pid=`lsof ${prog_path}/{prog_name} | grep "${prog_name:0:9}" | awk '{ print $2 }'`

# check process state
state=`cat /proc/${pid}/status | grep State | awk '{ print $2 }'`
if [[ "${state}" == "Z" || "${state}" == "T" ]]; then
  exit 2
fi

# check memory state
vmrss=`cat /proc/${pid}/status | grep VmRSS | awk '{ print $2 }'`
if [[ ${vmrss} -ge 500000 ]]; then
  exit 3
fi

# check listening port
num_port=`netstat -nltp | grep ${pid} | grep tcp | grep ${prog_port} | wc -l`
if [[ "${num_port}" != "1" ]]; then
  exit 4
fi

exit 0

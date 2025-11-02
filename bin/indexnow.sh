#!/bin/bash

cd /home/ntate/.local/src/coralberryfairy
env WATCH=false \
  GENERATE_NOW=true \
  VARS_PATH=/home/ntate/.local/src/coralberryfairy/vars.yaml \
  COMPUTATE_SRC=/home/ntate/.local/src/computate \
  COMPUTATE_VERTX_SRC=/home/ntate/.local/src/computate-vertx \
  SITE_LANG=enUS \
  /home/ntate/.local/src/computate/bin/enUS/index.sh

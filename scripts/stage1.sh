#!/bin/bash

source ./.venv/bin/activate

python scripts/build_projectdb.py

scripts/import2hdfs.sh
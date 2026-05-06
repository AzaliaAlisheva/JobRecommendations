#!/bin/bash

rm -f data/*

mkdir -p ~/.kaggle
mv kaggle.json ~/.kaggle/kaggle.json
chmod 600 ~/.kaggle/kaggle.json

kaggle competitions download -c job-recommendation -p data

unzip data/job-recommendation.zip -d data/ 

unzip data/jobs.zip -d data/

rm -r ~/.kaggle
rm data/*.zip
rm data/popular_jobs.py
rm data/popular_jobs.csv
rm data/test_users.tsv

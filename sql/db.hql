DROP DATABASE IF EXISTS team17_projectdb CASCADE;

CREATE DATABASE team17_projectdb LOCATION "project/hive/warehouse";
USE team17_projectdb;

DROP TABLE IF EXISTS window_dates_raw;
CREATE EXTERNAL TABLE window_dates_raw (
    windowid INT,
    trainstart BIGINT,
    teststart BIGINT,
    testend BIGINT
)
STORED AS PARQUET
LOCATION 'project/warehouse/window_dates'
TBLPROPERTIES ('parquet.compression' = 'GZIP');

-- 2. users_raw
DROP TABLE IF EXISTS users_raw;
CREATE EXTERNAL TABLE users_raw (
    userid INT,
    windowid INT,
    split STRING,
    city STRING,
    state STRING,
    country STRING,
    zipcode STRING,
    degree STRING,
    major STRING,
    graddate BIGINT,
    jobcnt INT,
    yearsexp INT,
    employed BOOLEAN,
    managerexp BOOLEAN,
    emplcnt INT
)
STORED AS PARQUET
LOCATION 'project/warehouse/users'
TBLPROPERTIES ('parquet.compression' = 'GZIP');

-- 3. user_history (no timestamps - use as is)
CREATE EXTERNAL TABLE user_history (
    userid INT,
    windowid INT,
    split STRING,
    sequence INT,
    jobtitle STRING
)
STORED AS PARQUET
LOCATION 'project/warehouse/user_history'
TBLPROPERTIES ('parquet.compression' = 'GZIP');

-- 4. jobs_raw
DROP TABLE IF EXISTS jobs_raw;
CREATE EXTERNAL TABLE jobs_raw (
    jobid INT,
    windowid INT,
    title STRING,
    description STRING,
    requirements STRING,
    city STRING,
    state STRING,
    country STRING,
    zipcode STRING,
    `start` BIGINT,
    `finish` BIGINT
)
STORED AS PARQUET
LOCATION 'project/warehouse/jobs'
TBLPROPERTIES ('parquet.compression' = 'GZIP');

-- 5. apps_raw
DROP TABLE IF EXISTS apps_raw;
CREATE EXTERNAL TABLE apps_raw (
    appid INT,
    userid INT,
    windowid INT,
    split STRING,
    `date` BIGINT,
    jobid INT
)
STORED AS PARQUET
LOCATION 'project/warehouse/apps'
TBLPROPERTIES ('parquet.compression' = 'GZIP');


-- 1. window_dates view
CREATE OR REPLACE VIEW window_dates AS
SELECT 
    windowid,
    FROM_UNIXTIME(CAST(trainstart / 1000 AS BIGINT)) AS trainstart,
    FROM_UNIXTIME(CAST(teststart / 1000 AS BIGINT)) AS teststart,
    FROM_UNIXTIME(CAST(testend / 1000 AS BIGINT)) AS testend
FROM window_dates_raw;

-- 2. users view
CREATE OR REPLACE VIEW users AS
SELECT 
    userid,
    windowid,
    split,
    city,
    state,
    country,
    zipcode,
    degree,
    major,
    FROM_UNIXTIME(CAST(graddate / 1000 AS BIGINT)) AS graddate,
    jobcnt,
    yearsexp,
    employed,
    managerexp,
    emplcnt
FROM users_raw;

-- 4. jobs view
CREATE OR REPLACE VIEW jobs AS
SELECT 
    jobid,
    windowid,
    title,
    description,
    requirements,
    city,
    state,
    country,
    zipcode,
    FROM_UNIXTIME(CAST(`start` / 1000 AS BIGINT)) AS start_time,
    FROM_UNIXTIME(CAST(`finish` / 1000 AS BIGINT)) AS finish_time
FROM jobs_raw;

-- 5. apps view
CREATE OR REPLACE VIEW apps AS
SELECT 
    appid,
    userid,
    windowid,
    split,
    FROM_UNIXTIME(CAST(`date` / 1000 AS BIGINT)) AS application_date,
    jobid
FROM apps_raw;


SELECT * FROM window_dates LIMIT 10;
SELECT * FROM users LIMIT 10;
SELECT * FROM user_history LIMIT 10;
SELECT * FROM jobs LIMIT 10;
SELECT * FROM apps LIMIT 10;
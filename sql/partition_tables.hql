SET hive.exec.dynamic.partition=true;
SET hive.exec.dynamic.partition.mode=nonstrict;

USE team17_projectdb;


DROP TABLE IF EXISTS users_part;
CREATE EXTERNAL TABLE users_part(
    userid INT,
    city STRING,
    state STRING,
    country STRING,
    zipcode STRING,
    degree STRING,
    major STRING,
    graddate TIMESTAMP,
    jobcnt INT,
    yearsexp INT,
    employed BOOLEAN,
    managerexp BOOLEAN,
    emplcnt INT
) 
PARTITIONED BY (split STRING, windowid INT)
CLUSTERED BY (city) into 7 buckets
STORED AS PARQUET
LOCATION 'project/hive/warehouse/users_part'
TBLPROPERTIES ('parquet.compression' = 'GZIP');

INSERT overwrite TABLE users_part
PARTITION (split,windowid)
SELECT
    userid,
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
    emplcnt,
    split,
    windowid
FROM users_raw;


DROP TABLE IF EXISTS user_history_part;
CREATE EXTERNAL TABLE user_history_part(
    userid INT,
    sequence INT,
    jobtitle STRING
) 
PARTITIONED BY (split STRING, windowid INT)
CLUSTERED BY (userid) into 7 buckets
STORED AS PARQUET
LOCATION 'project/hive/warehouse/user_history_part'
TBLPROPERTIES ('parquet.compression' = 'GZIP');

INSERT overwrite TABLE user_history_part
PARTITION (split,windowid)
SELECT 
    userid,
    sequence,
    jobtitle,
    split,
    windowid
FROM user_history;


DROP TABLE IF EXISTS jobs_part;
CREATE EXTERNAL TABLE jobs_part (
    jobid INT,
    title STRING,
    description STRING,
    requirements STRING,
    city STRING,
    state STRING,
    country STRING,
    zipcode STRING,
    `start` TIMESTAMP,
    `finish` TIMESTAMP
)
PARTITIONED BY (windowid INT)
CLUSTERED BY (city) into 7 buckets
STORED AS PARQUET
LOCATION 'project/hive/warehouse/jobs_part'
TBLPROPERTIES ('parquet.compression' = 'GZIP');

INSERT overwrite TABLE jobs_part
PARTITION (windowid)
SELECT 
    jobid,
    title,
    description,
    requirements,
    city,
    state,
    country,
    zipcode,
    FROM_UNIXTIME(CAST(`start` / 1000 AS BIGINT)) AS start_time,
    FROM_UNIXTIME(CAST(`finish` / 1000 AS BIGINT)) AS finish_time,
    windowid
FROM jobs_raw;


DROP TABLE IF EXISTS apps_part;
CREATE EXTERNAL TABLE apps_part(
    appid INT,
    userid INT,
    `date` TIMESTAMP,
    jobid INT
) 
PARTITIONED BY (split STRING, windowid INT)
CLUSTERED BY (userid) into 7 buckets
STORED AS PARQUET
LOCATION 'project/hive/warehouse/apps_part'
TBLPROPERTIES ('parquet.compression' = 'GZIP');

INSERT overwrite TABLE apps_part
PARTITION (split,windowid)
SELECT
    appid,
    userid,
    FROM_UNIXTIME(CAST(`date` / 1000 AS BIGINT)) AS application_date,
    jobid,
    split,
    windowid
FROM apps_raw;

SHOW PARTITIONS users_part;
SELECT * FROM users_part LIMIT 10;

SHOW PARTITIONS user_history_part;
SELECT * FROM user_history_part LIMIT 10;

SHOW PARTITIONS jobs_part;
SELECT * FROM jobs_part LIMIT 10;

SHOW PARTITIONS apps_part;
SELECT * FROM apps_part LIMIT 10;
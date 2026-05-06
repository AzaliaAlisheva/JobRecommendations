START TRANSACTION;

DROP TABLE IF EXISTS window_dates CASCADE;
DROP TABLE IF EXISTS users CASCADE;
DROP TABLE IF EXISTS user_history CASCADE;
DROP TABLE IF EXISTS jobs CASCADE;
DROP TABLE IF EXISTS apps CASCADE;
DROP TABLE IF EXISTS popular_jobs CASCADE;


CREATE TABLE IF NOT EXISTS window_dates (
    windowid integer NOT NULL PRIMARY KEY,
    trainstart TIMESTAMP NOT NULL,
    teststart TIMESTAMP NOT NULL,
    testend TIMESTAMP NOT NULL
);

CREATE TABLE IF NOT EXISTS users(
    userid integer NOT NULL PRIMARY KEY,
    windowid integer NOT NULL,
    split TEXT,
    city TEXT,
    state TEXT,
    country TEXT,
    zipcode TEXT,
    degree TEXT,
    major TEXT,
    graddate TIMESTAMP,
    jobcnt integer,
    yearsexp integer,
    employed BOOL,
    managerexp BOOL,
    emplcnt integer
);

CREATE TABLE IF NOT EXISTS user_history (
    userid integer NOT NULL,
    windowid integer NOT NULL,
    split TEXT,
    sequence integer NOT NULL,
    jobtitle TEXT,
    PRIMARY KEY (userid, windowid, sequence)
);

CREATE TABLE IF NOT EXISTS jobs (
    jobid integer NOT NULL PRIMARY KEY,
    windowid integer NOT NULL,
    title TEXT,
    description TEXT,
    requirements TEXT,
    city TEXT,
    state TEXT,
    country CHAR ( 2 ),
    zipcode TEXT,
    start TIMESTAMP,
    finish TIMESTAMP
);

CREATE TABLE IF NOT EXISTS apps (
    appid SERIAL PRIMARY KEY,
    userid integer NOT NULL,
    windowid integer NOT NULL,
    split TEXT,
    date TIMESTAMP,
    jobid integer NOT NULL
);

-- FKs
-- Add to users table
ALTER TABLE users 
ADD CONSTRAINT fk_users_windowid 
FOREIGN KEY (windowid) REFERENCES window_dates(windowid);

-- Add to user_history table
ALTER TABLE user_history 
ADD CONSTRAINT fk_userhistory_userid 
FOREIGN KEY (userid) REFERENCES users(userid),
ADD CONSTRAINT fk_userhistory_windowid 
FOREIGN KEY (windowid) REFERENCES window_dates(windowid);

-- Add to jobs table
ALTER TABLE jobs 
ADD CONSTRAINT fk_jobs_windowid 
FOREIGN KEY (windowid) REFERENCES window_dates(windowid);

-- Add to apps table
ALTER TABLE apps 
ADD CONSTRAINT fk_apps_userid 
FOREIGN KEY (userid) REFERENCES users(userid),
ADD CONSTRAINT fk_apps_windowid 
FOREIGN KEY (windowid) REFERENCES window_dates(windowid),
ADD CONSTRAINT fk_apps_jobid 
FOREIGN KEY (jobid) REFERENCES jobs(jobid);

-- This is related to how the date types are stored in my dataset
ALTER DATABASE team17_projectdb SET datestyle TO iso, ymd;

COMMIT;
#---Using partitions
#---1. Create temp table to store data
CREATE EXTERNAL TABLE DOWJONES(quarter INT, stock STRING, dj_date STRING, open DOUBLE, high DOUBLE, low DOUBLE, close DOUBLE, volume BIGINT, percent_change_price DOUBLE, percent_change_volume_over_last_wk DOUBLE, previous_weeks_volume DOUBLE, next_weeks_open DOUBLE, next_weeks_close DOUBLE, percent_change_next_weeks_price DOUBLE, days_to_next_dividend DOUBLE, percent_return_next_dividend DOUBLE) ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n' STORED AS TEXTFILE LOCATION '/user/rashmi/dowjones';

#---2. Create partition table with no data being loaded
CREATE EXTERNAL TABLE dowjones_partitioned(stock STRING, dj_date STRING, open DOUBLE, high DOUBLE, low DOUBLE, close DOUBLE, volume BIGINT, percent_change_price DOUBLE, percent_change_volume_over_last_wk DOUBLE, previous_weeks_volume DOUBLE, next_weeks_open DOUBLE, next_weeks_close DOUBLE, percent_change_next_weeks_price DOUBLE, days_to_next_dividend DOUBLE, percent_return_next_dividend DOUBLE) COMMENT 'This is dowjones_clustered table'  PARTITIONED BY(quarter INT) ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n' STORED AS TEXTFILE;

#---3. Alter table & add partitions
ALTER TABLE dowjones_partitioned ADD PARTITION(quarter=1);
ALTER TABLE dowjones_partitioned ADD PARTITION(quarter=2);
ALTER TABLE dowjones_partitioned ADD PARTITION(quarter=3);
ALTER TABLE dowjones_partitioned ADD PARTITION(quarter=4);

#---4. set parameters to enable dynamic partitions
set hive.exec.dynamic.partition=true;
set hive.exec.dynamic.partition.mode=nonstrict;

#---5. Select data from temp table and load the data into partition table DISTRIBUTED BY quarter
INSERT OVERWRITE TABLE dowjones_partitioned PARTITION(quarter)
SELECT stock, dj_date, open, high, low, close, volume, percent_change_price, 
percent_change_volume_over_last_wk, previous_weeks_volume, next_weeks_open, 
next_weeks_close, percent_change_next_weeks_price, days_to_next_dividend, 
percent_return_next_dividend,quarter from dowjones
DISTRIBUTE BY quarter;


#---Using Clustering 
#---1. Create temp table to store data
CREATE EXTERNAL TABLE DOWJONES(quarter INT, stock STRING, dj_date STRING, open DOUBLE, high DOUBLE, low DOUBLE, close DOUBLE, volume BIGINT, percent_change_price DOUBLE, percent_change_volume_over_last_wk DOUBLE, previous_weeks_volume DOUBLE, next_weeks_open DOUBLE, next_weeks_close DOUBLE, percent_change_next_weeks_price DOUBLE, days_to_next_dividend DOUBLE, percent_return_next_dividend DOUBLE) ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n' STORED AS TEXTFILE LOCATION '/user/rashmi/dowjones';

#---2. Create Clustered table with no data being loaded
CREATE EXTERNAL TABLE dowjones_clustering(stock STRING, dj_date STRING, open DOUBLE, high DOUBLE, low DOUBLE, close DOUBLE, volume BIGINT, percent_change_price DOUBLE, percent_change_volume_over_last_wk DOUBLE, previous_weeks_volume DOUBLE, next_weeks_open DOUBLE, next_weeks_close DOUBLE, percent_change_next_weeks_price DOUBLE, days_to_next_dividend DOUBLE, percent_return_next_dividend DOUBLE) COMMENT 'This is dowjones_clustered table'  PARTITIONED BY(quarter INT) clustered by (stock) INTO 10 buckets  ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n' STORED AS TEXTFILE;

#---3. Alter table & add partitions
ALTER TABLE dowjones_clustering ADD PARTITION(quarter=1);
ALTER TABLE dowjones_clustering ADD PARTITION(quarter=2);
ALTER TABLE dowjones_clustering ADD PARTITION(quarter=3);
ALTER TABLE dowjones_clustering ADD PARTITION(quarter=4);

#---4. set parameters to enable dynamic partitions & clustering
set hive.exec.dynamic.partition=true;
set hive.exec.dynamic.partition.mode=nonstrict;
set hive.enforce.bucketing=true;

#---5. Select data from temp table and load the data into partition table DISTRIBUTED BY quarter
INSERT OVERWRITE TABLE dowjones_clustering PARTITION(quarter)
SELECT stock, dj_date, open, high, low, close, volume, percent_change_price, 
percent_change_volume_over_last_wk, previous_weeks_volume, next_weeks_open, 
next_weeks_close, percent_change_next_weeks_price, days_to_next_dividend, 
percent_return_next_dividend,quarter from dowjones
DISTRIBUTE BY quarter;


select * from dowjones_clustering TABLESAMPLE(BUCKET 1 OUT OF 10);

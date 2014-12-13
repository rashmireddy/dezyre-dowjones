#Create Hive External Table and load the data from HDFS
CREATE EXTERNAL TABLE DOWJONES(quarter INT, stock STRING, dj_date DATE, open DOUBLE, high DOUBLE, low DOUBLE, close DOUBLE, volume BIGINT, percent_change_price DOUBLE, percent_change_volume_over_last_wk DOUBLE, previous_weeks_volume DOUBLE, next_weeks_open DOUBLE, next_weeks_close DOUBLE, percent_change_next_weeks_price DOUBLE, days_to_next_dividend DOUBLE, percent_return_next_dividend DOUBLE) ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n' STORED AS TEXTFILE LOCATION '/user/rashmi/dowjones';


#Hive Query to get the Total volume of each stock in each quarter
select quarter, stock, SUM(volume) from dowjones GROUP BY quarter, stock;


# Hive query output to HDFS file
#--------------------------------
# not working because of bug in hive https://issues.apache.org/jira/browse/HIVE-5672
INSERT OVERWRITE DIRECTORY '/user/rashmi/dowjones/output/dump' row format delimited FIELDS TERMINATED BY ':' select quarter, stock, SUM(volume) from dowjones GROUP BY quarter, stock;

#This is working and able to create output CSV file on local FS. However for scoop to export this data we need to copy this output file to HDFS and then execute scoop export on it.
INSERT OVERWRITE LOCAL DIRECTORY '/Users/rashmi/output' ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' select quarter, stock, SUM(volume) from dowjones GROUP BY quarter, stock;


# will work , but i need to find out the location of hive warehouse directory
CREATE TABLE OUTPUT row format delimited fields terminated by ',' STORED AS TEXTFILE AS select quarter, stock, SUM(volume) from dowjones GROUP BY quarter, stock;
show create table output;

# will not work because Hive cannot create external table
CREATE EXTERNAL TABLE OUTPUT row format delimited fields terminated by ',' STORED AS TEXTFILE location '/user/rashmi/dowjones/output/dump1' AS select quarter, stock, SUM(volume) from dowjones GROUP BY quarter, stock;

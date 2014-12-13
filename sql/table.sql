create database dowjones;

create table dowjones (quarter int(11),
stock varchar(35),
date varchar(35),
open double,
high double,
low double,
close double,
volume bigint(20),
percent_change_price double,
percent_change_volume_over_last_wk double,
previous_weeks_volume bigint(20),
next_weeks_open double,
next_weeks_close double,
percent_change_next_weeks_price double,
days_to_next_dividend int(11),
percent_return_next_dividend double
) engine=InnoDB;

create table quarter_stock_volumes(quarter int(11), stock varchar(35), volume bigint(20)) engine=InnoDB;
grant all privileges on dowjones.* to ''@localhost ;

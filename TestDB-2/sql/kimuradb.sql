drop database if exists  kimuradb;
create database kimuradb;
use kimuradb;

create table kimura_table(
id int,
name varchar(255),
age int

);

insert into kimura_table values(1,"tanaka",23);
insert into kimura_table values(2,"yamada",77);
insert into kimura_table values(3,"aaa",0);
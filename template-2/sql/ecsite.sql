set names utf8;
set foreign_key_checks=0;
drop database if exists ecsite;

create database if not exists ecsite;
use ecsite;

drop table if exists login;

create table login(
	id int not null primary key auto_increment,
	login_id varchar(16) unique,
	login_pass varchar(16),
	user_name varchar(50),
	insert_date datetime,
	updated_date datetime
);

drop table if exists item;

create table item(
	id int not null primary key auto_increment,
	item_name varchar(30),
	item_price int,
	item_stock int,
	insert_date datetime,
	update_date datetime
);

drop table if exists user_buy_item;

create table user_buy_item(
	id int not null primary key auto_increment,
	item_transaction_id int,
	total_price int,
	total_count int,
	user_master_id varchar(16),
	pay varchar(30),
	insert_date datetime,
	delete_date datetime
);

INSERT INTO item(item_name,item_price,item_stock)VALUES("華形ひかるディナーショーチケット",15000,100);

INSERT INTO login(login_id,login_pass,user_name)VALUES("kimura","kimura","kimura");

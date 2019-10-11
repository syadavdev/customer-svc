--Customer Table
drop table if exists `customer`;
create table `customer`(
	`id` integer primary key unique not null unique auto_increment,
	`first_name` varchar(50) not null,
	`last_name` varchar(50) not null,
	`customer_name` varchar(50) not null,
	`password` varchar(100) not null,
    `phone_number` varchar(15) not null unique,
    `email` varchar(20) not null unique,
    `country` varchar(20) not null,
    `created_on` datetime null,
    `updated_on` datetime null,
    `last_login` datetime null,
);

--Role Table
drop table if exists `role`;
create table `role`(
    `id` integer primary key unique not null unique auto_increment,
    `name` varchar(50) NOT NULL,
    ``
);

--Right Table
drop table if exists `role`;
create table `role`(
    `id` integer primary key unique not null unique auto_increment,
    `name` varchar(50) NOT NULL
);

--Role Right Table
drop table if exists `role`;
create table `role_right`(
    `id` integer primary key unique not null unique auto_increment,
);
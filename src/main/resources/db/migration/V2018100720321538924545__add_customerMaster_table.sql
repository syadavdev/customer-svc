--Role Table
drop table if exists `role`;
create table `role`(
    `role_id` int primary key unique not null unique auto_increment,
    `name` varchar(50) NOT NULL
);

--Right Table
drop table if exists `rights`;
create table `rights`(
    `right_id` int primary key unique not null unique auto_increment,
    `name` varchar(50) NOT NULL
);

--Role Right Table
drop table if exists `role_rights`;
create table `role_rights`(
    `role_id` int not null,
    `right_id` int not null,
    primary key (`role_id`, `right_id`),
    constraint `fk_role_rights_role_id` foreign key (`role_id`) references `role` (`role_id`),
    constraint `fk_role_rights_right_id` foreign key (`right_id`) references `rights` (`right_id`)
);

--Customer Table
drop table if exists `customer`;
create table `customer`(
	`customer_id` int primary key unique not null unique auto_increment,
	`first_name` varchar(50) not null,
	`last_name` varchar(50) not null,
	`customer_name` varchar(50) not null,
	`password` varchar(100) not null,
    `phone_number` varchar(15) not null unique,
    `email` varchar(20) not null unique,
    `country` varchar(20) not null,
    `created_on` datetime null,
    `updated_on` datetime null,
    `last_login` datetime null
);

--Customer Role Table
drop table if exists `customer_role`;
create table `customer_role`(
    `customer_id` int not null,
    `role_id` int not null,
    primary key(`customer_id`, `role_id`),
    constraint `fk_customer_role_customer_id` foreign key (`customer_id`) references `customer` (`customer_id`),
    constraint `fk_customer_role_role_id` foreign key (`role_id`) references `role` (`role_id`)
);
--Customer Table
drop table if exists `customermaster`;
create table `customermaster`(
	`id` integer primary key unique not null unique auto_increment,
	`customer_name` varchar(50) not null,
    `phone_number` varchar(15) not null unique,
    `email` varchar(20) not null unique,
    `country` varchar(20) not null unique
);
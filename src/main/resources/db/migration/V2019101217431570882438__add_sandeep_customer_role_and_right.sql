insert into `customer` (`customer_id`, `first_name`, `last_name`, `customer_name`, `password`, `phone_number`, `email`, `country`) values ( 1, 'Sandeep', 'Yadav', 'sandi', '$2a$04$wYagTuKZoKQyvAMlOwnlseVD.WiOOUROnjGCHm7xQhJrI5shv/9Du', '9729933490', 'sandi@gmail.com', 'india');

insert into `role` (`role_id`, `name`) values (1, 'super');

insert into `rights` (`right_id`, `name`) values (1, 'VIEW_CUSTOMER');
insert into `rights` (`right_id`, `name`) values (2, 'EDIT_CUSTOMER');

insert into `role_rights` (`role_id`, `right_id`) value (1, 1);
insert into `role_rights` (`role_id`, `right_id`) value (1, 2);

insert into `customer_role` (`customer_id`, `role_id`) values (1, 1);
/* 
 * This is a auto generated file from the model definition.
 */


# add table name entry in db/tables.txt file
drop table if exists expenses;
drop table if exists sub_categories;
drop table if exists categories;
drop table if exists users;

create table users(
  id bigint(19) not null auto_increment ,
  email varchar(70) not null,
  password varchar(60) null,
  validated boolean not null default 0,
  created_at timestamp null,
  updated_at timestamp not null DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  constraint primary key(id),
  constraint unique key (email)
)engine=innodb;


create table categories(
	id bigint(19) not null auto_increment,
	user_id bigint(19) not null,
	label varchar(30) not null,
	constraint primary key(id),
	constraint foreign key (user_id) references users(id) on delete cascade
)engine=innodb;

create table sub_categories(
		id bigint(19) not null auto_increment,
		category_id bigint(19) not null,
		label varchar(50),
		constraint primary key(id),
		constraint foreign key (category_id) references categories(id) on delete cascade
)engine=innodb;

create table expenses(
	id bigint(19) not null auto_increment,
	user_id bigint(19) not null,
	date timestamp,
	amount bigint,
	category_id bigint(19) not null,
	sub_category_id bigint(29),
	constraint primary key(id,user_id,category_id,sub_category_id),
	constraint foreign key (category_id) references categories(id) 
	constraint foreign key (sub_category_id) references sub_categories(id) 
)engine=innodb;


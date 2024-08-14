create table USER_DETAILS(
	id int primary key,
	birth_date date,
	name varchar(100)
);

create table POST(
	id int primary key,
	description varchar(100),
	user_id int
);
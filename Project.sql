create database stu4;

use stu4;

show databases;

create table login(username varchar(20), password varchar(20));

insert into login values('admin', '12345');

select * from login;

create table student (name varchar(20), fname varchar(20), dob varchar(30), religion varchar(20), address varchar(100), phone varchar(20), email varchar(40), bloodgroup varchar(20), nationality varchar(30), postcode varchar(25), studentId varchar(15));

select * from student;

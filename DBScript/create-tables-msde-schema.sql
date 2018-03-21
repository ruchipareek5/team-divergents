/* DROP schema */

drop database if exists msde;

/*  create schema */

create database if not exists msde;
use msde;
/* DROP tables */

drop table if exists user;
drop table if exists application;
drop table if exists applicationcomments;
drop table if exists 

/* create table for user */

CREATE TABLE if not exists user (
  organizationName varchar(200) unique key not null,
  sPOCName varchar(200),
 userId varchar(200) unique key not null,
  password varchar(30) not null,
  userRole varchar(20) not null,
  Id int(10) primary key AUTO_INCREMENT);

 /* create table for application */
 
create table if not exists application(
applicationId int(20) auto_increment Primary key not null,
applicationState varchar(20) not null,
isActive boolean,
dateOfSubmission datetime not null,
userId varchar(200) , 
foreign key (userId) references user(userId));

/* create table for applicationComments */

create table if not exists applicationComments(
commentId int(10) primary key auto_increment,
comment varchar(200) not null,
applicationId int(20) not null,
activeFlag boolean,
foreign key (applicationId) references application(applicationId));
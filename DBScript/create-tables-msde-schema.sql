/* DROP schema */

drop database if exists msde;

/*  create schema */

create database if not exists msde;
use msde;
/* DROP tables */

drop table if exists user;
drop table if exists application;
drop table if exists applicationcomments;
drop table if exists trainingPartner;
drop table if exists trainingPartnerQualificationPack;
drop table if exists trainingCenter;

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

/*create table trainingPartner */
create table if not exists trainingPartner(
trainingPartnerId int(10) primary key auto_increment,
organizationName varchar(200) unique key not null,
sPOCName varchar(200),
address varchar(200),
website varchar(200),
district varchar(200),
state varchar(200),
contactNumber bigint,
applicationId int,
undertakingPath varchar(200),
foreign key (applicationId) references application(applicationId));

/* create table trainingPartnerQualificationPack*/
create table if not exists trainingPartnerQualificationPack(
trainingPartnerQualificationPackId int(10) primary key auto_increment,
trainingPartnerId int(10),
qualificationPack varchar(200),
jobRole varchar(200),
scheme varchar(200),
isActive boolean,
foreign key (trainingPartnerId) references trainingPartner(trainingPartnerId));

/*create table training center*/
create table if not exists trainingCenter(
trainingCenterId int(10) primary key auto_increment,
centerName varchar(200),
address varchar(200),
district varchar(200),
state varchar(200),
contactNumber bigint,
trainingPartnerId int(10),
isActive boolean,
foreign key (trainingPartnerId) references trainingPartner(trainingPartnerId));
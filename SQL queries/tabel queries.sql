CREATE database TJS;
SELECT 1;
DROP database TJS;
show databases;
use TJS;
create table Student(

rollno int PRIMARY KEY,
stdname varchar(30),
stdphone bigint,
stdadd varchar(40)
);
DROP table Student;
show tables;
desc Student;
insert into Student values (001,'damon',9913664878,'shfa');
insert into Student values (002,'Stefan',9914464878,'sfa');
insert into Student values (003,'katherine',9912664878,'sha');
insert into Student values (004,'jenna',9912664778,'sa');
select * from Student;
select stdname from Student;
# solution if you get error:1175
SET SQL_SAFE_UPDATES = 0;
update Student set stdadd='qqq' WHERE stdname='jenna';
SET SQL_SAFE_UPDATES = 1;
update Student set stdname='Caroline' where stdname = 'jenna';
delete from Student where stdname = 'jenna';

-- second table --

create table project(
project_no int,
faculty_name varchar(30),
phone bigint,
project_name varchar(20),
foreign key(project_no) references Student(rollno)
);
insert into project values(01,'bean',9913465612,'cloudai');
insert into project values(02,'sasa',9713465612,'cloud9');
insert into project values(03,'debian',9913865612,'cloudCI');
insert into project values(03,'debo',9913865612,'cloudCI');
insert into project values(04,'haug',9913165612,'cloudCD');
insert into project values('haug',9913165612,'cloudCD');
SHOW ENGINE INNODB STATUS;
DROP table project;
show tables;
desc project;
select * from project;

-- default --
alter table project modify project_name varchar(20);
alter table project modify phone bigint not null;
alter table project modify project_name varchar(30) default 'no data';
insert into project(faculty_name,project_name) values('haug','katil');
insert into project(faculty_name,phone) values('haug',8899445566);

-- third table --
create table faculty(

faculty_id int unique KEY,
fac_name varchar(30),
fac_phone bigint,
fac_add varchar(40)
);

insert into faculty values (1,'damon',9913664878,'abad');
insert into faculty(fac_name,fac_phone,fac_add) values ('Stefan',9914464878,'srt');
insert into faculty values (3,'katherine',9912664878,'NCR');
insert into faculty values (4,'jenna',9912664778,'Mmb');
drop table faculty;
select * from faculty;
desc faculty;

-- alter--
alter table faculty add fac_dept varchar(20);  
alter table faculty drop fac_dept;
alter table faculty modify fac_name varchar(40);

-- not null--
alter table faculty modify fac_phone bigint not null; -- making a required field --
insert into faculty(fac_name,fac_add) values('Raka bhoi','python'); -- test query for above --

-- auto increament --
alter table faculty modify faculty_id int unique key auto_increment;
insert into faculty(faculty,project) values('Raka','python'); 
truncate table faculty;

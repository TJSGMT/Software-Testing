Create database operators;
use operators;

create table student(
stdroll int primary key,
stdname varchar(30),
stdphone bigint,
stdadd varchar(30),
stdmark int,
house varchar(30)
);

insert into student values(101,'Elena',7818982546,'mystic falls',77,'red');
insert into student values(102,'Bonnie',7878482546,'new orleans',67,'blue');
insert into student values(103,'Caroline',7878982546,'new orleans',47,'yellow');
insert into student values(104,'Jenna',7878984646,'mystic falls',79,'black');
insert into student values(105,'Lexi',7878977546,'padre',78,'burgundy');
insert into student values(109,'rose',8952461350,'compadre',55,'ron');
insert into student values(110,'damon',4565123285,'deliuoso',78,'red');
insert into student values (111,'stefan',855967613,'deluiso',75,'blue');

Desc Student;
select * from student;

-- operator --
Select * from student where stdname='Bonnie';
select stdname,stdmark from student where stdadd='new orleans';  -- particular data and columns --
select stdname from student where stdroll < 105;
select stdname from student where stdroll <= 103;
select stdname from student where stdroll > 104;
select stdname from student where stdroll >= 102;
select stdname from student where stdroll < 105;
select stdname,stdadd from student where stdroll <= 103;
select * from student where stdadd <> 'mystic falls'; -- not equals to --

-- logical operators --

select * from student where stdmark > 70 and stdadd <> 'new orleans';
select * from student where stdmark between 40 and 65;
select * from student where stdmark < 40 or stdadd = 'new orleans';
select * from student where stdmark in (75,55,65,12,78);
select * from student where stdname like 'b%'; -- starting with --
select * from student where stdname like '%a';-- ending with --
select * from student where stdname like '%o%';
select * from student where stdname like '_e%a';
select * from student where stdname not like '_e%a';
select * from student where stdphone is null;
select current_timestamp from student;
select * from student limit 3;
select * from student order by stdmark limit 2;
select * from student order by stdname desc;
select * from student where stdphone like '%6%' order by stdmark desc limit 3;
select * from student group by house ;

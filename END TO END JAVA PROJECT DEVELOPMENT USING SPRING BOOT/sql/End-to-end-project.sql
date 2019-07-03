create database projectdb;

use projectdb;

create table studenttab(
id int PRIMARY KEY AUTO_INCREMENT,
sname VARCHAR(20),
scourse VARCHAR(30),
sfee int);

select * from studenttab;

drop table studenttab;

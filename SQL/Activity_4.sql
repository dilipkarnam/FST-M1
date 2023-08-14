REM   Script: Activity_4
REM   ALTER/UPDATE

select * from Customers;

CREATE TABLE customers salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

CREATE TABLE customers salesman ( 
    salesman_id int, 
    salesman_name varchar(32), 
    salesman_city varchar(32), 
    commission int 
);

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar(32), 
    salesman_city varchar(32), 
    commission int 
);

drop table salesman;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar(32), 
    salesman_city varchar(32), 
    commission int 
);

drop table salesman;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar(32), 
    salesman_city varchar(32), 
    commission int 
);

describe salesman


drop table salesman;

CREATE TABLE salesman ( 
    salesman_id int primary key, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

describe salesman


drop table salesman;

CREATE TABLE salesman ( 
    salesman_id int primary key, 
    salesman_name varchar2(32) not null, 
    salesman_city varchar2(32), 
    commission int 
);

describe salesman


insert into salesman 
    values (5001,'James Hoog','New York',15), 
    values (5002,'Nail Knite','Paris',13), 
    values (5005,'Pit Alex','London',11), 
    values (5006,'McLyon','Paris',14), 
    values (5007,'Paul Adam','Rome',13), 
    values (5003,'Lauson Hen','San Jose',12) 
    select 1 from dual;

insert into salesman 
    values (5001,'James Hoog','New York',15), 
    values (5002,'Nail Knite','Paris',13), 
    values (5005,'Pit Alex','London',11), 
    values (5006,'McLyon','Paris',14), 
    values (5007,'Paul Adam','Rome',13), 
    values (5003,'Lauson Hen','San Jose',12);

select * from salesman;

insert into salesman 
    values (5001,'James Hoog','New York',15), 
    values (5002,'Nail Knite','Paris',13), 
    values (5005,'Pit Alex','London',11), 
    values (5006,'McLyon','Paris',14), 
    values (5007,'Paul Adam','Rome',13), 
    values (5003,'Lauson Hen','San Jose',12) 
select 1 from dual;

insert into salesman 
    values (5001,'James Hoog','New York',15) 
    values (5002,'Nail Knite','Paris',13) 
    values (5005,'Pit Alex','London',11) 
    values (5006,'McLyon','Paris',14) 
    values (5007,'Paul Adam','Rome',13) 
    values (5003,'Lauson Hen','San Jose',12) 
select 1 from dual;

insert all 
    into salesman values (5001,'James Hoog','New York',15) 
    into salesman values (5002,'Nail Knite','Paris',13) 
    into salesman values (5005,'Pit Alex','London',11) 
    into salesman values (5006,'McLyon','Paris',14) 
    into salesman values (5007,'Paul Adam','Rome',13) 
    into salesman values (5003,'Lauson Hen','San Jose',12) 
select 1 from dual;

select * from salesman;

select * from salesman where salesman_city like '% o';

select * from salesman where city like '%o';

select * from salesman where salesman_city like '%o';

select * from salesman where salesman_city like '%o';

select * from salesman where salesman_city like '% Yo';

select * from salesman where salesman_city like '% York';

select * from salesman where salesman_city like '%York';

select * from salesman where salesman_city like 'Ne%';

select * from salesman where salesman_city like 'Ne%';

select * from salesman where salesman_city like 'New%';

select * from salesman where salesman_city = 'Paris';

select * salesman;

select * from salesman;

select * from salesman;

describe salesman


alter table salesman 
add grade int;

describe salesman


//update table 


update table salesman grade = 100;

//display table 


select * from salesman;

update table salesman set grade = 100;

update salesman set grade = 100;

//display table 


select * from salesman;


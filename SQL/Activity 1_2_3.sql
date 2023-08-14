REM   Script: Activity 1_2_3
REM   Class Activity

create table salesman( 
    salesman_id int,  
    salesman_name varchar2(20),  
    salesman_city varchar2(20),  
    commision int 
);

create table salesman( 
    salesman_id int,  
    salesman_name varchar2(20),  
    salesman_city varchar2(20),  
    commision int 
);

create table salesman( 
    salesman_id int primary key,  
    salesman_name varchar2(20),  
    salesman_city varchar2(20),  
    commision int 
);

update talbe salesman( 
    salesman_id int primary key,  
    salesman_name varchar2(20),  
    salesman_city varchar2(20),  
    commision int 
);

drop table salesman;

describe salesman


create table salesman( 
    salesman_id int primary key,  
    salesman_name varchar2(32) UNIQUE NOT NULL,  
    salesman_city varchar2(32),  
    commision int 
);

describe salesman


insert into salesman 
values (5001,"James Hoog","New York",15) 
values (5002,"Nail Knite","Paris",13) 
values (5005,"Pit Alex","London",11) 
values (5006,"McLyon","Paris",14) 
values (5007,"Paul Adam","Rome",13) 
values (5003,"Lauson Hen","San Jose",12) 
;

insert into salesman 
values (5001,"James Hoog","New York",15) 
;

insert into salesman 
values (5001,"James Hoog","New York",15);

values (5002,"Nail Knite","Paris",13); 


values (5005,"Pit Alex","London",11); 


values (5006,"McLyon","Paris",14); 


values (5007,"Paul Adam","Rome",13); 


values (5003,"Lauson Hen","San Jose",12); 


insert into salesman 
values (5001,"James Hoog","New York",15);

insert all 
into salesman values (5001,"James Hoog","New York",15) 
into salesman values (5002,"Nail Knite","Paris",13) 
into salesman values (5005,"Pit Alex","London",11) 
into salesman values (5006,"McLyon","Paris",14) 
into salesman values (5007,"Paul Adam","Rome",13) 
into salesman values (5003,"Lauson Hen","San Jose",12) 
;

insert all 
into salesman values (5001,"James Hoog","New York",15) 
into salesman values (5002,"Nail Knite","Paris",13) 
into salesman values (5005,"Pit Alex","London",11) 
into salesman values (5006,"McLyon","Paris",14) 
into salesman values (5007,"Paul Adam","Rome",13) 
into salesman values (5003,"Lauson Hen","San Jose",12) 
;

insert all 
into salesman values (5001,'James Hoog','New York',15) 
into salesman values (5002,'Nail Knite','Paris',13) 
into salesman values (5005,'Pit Alex','London',11) 
into salesman values (5006,'McLyon','Paris',14) 
into salesman values (5007,'Paul Adam','Rome',13) 
into salesman values (5003,'Lauson Hen','San Jose',12) 
;

describe salesman


insert all 
into salesman values (5001,'James Hoog','New York',15) 
into salesman values (5002,'Nail Knite','Paris',13) 
into salesman values (5005,'Pit Alex','London',11) 
into salesman values (5006,'McLyon','Paris',14) 
into salesman values (5007,'Paul Adam','Rome',13) 
into salesman values (5003,'Lauson Hen','San Jose',12);

insert all 
into salesman values (5001,'James Hoog','New York',15) 
into salesman values (5002,'Nail Knite','Paris',13) 
into salesman values (5005,'Pit Alex','London',11) 
into salesman values (5006,'McLyon','Paris',14) 
into salesman values (5007,'Paul Adam','Rome',13) 
into salesman values (5003,'Lauson Hen','San Jose',12) 
select 1 from Dual;

select * from salesman;

select * from salesman where salesman_city like '%York';

select * from salesman where commission between 12 and 13;

select * from salesman where commision between 12 and 13;


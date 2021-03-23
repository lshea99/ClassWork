/*
*		Lane Shea
*		COSC 341  Assignment 3
*		create.sql
*
*/

create table employee (
	ssn number(9) primary key,
	fname varchar(25),
	lname varchar(25),
	sex char(1),
	salary number(7,2),
	super_ssn number(9),
	dno number(1)
	);

create table department (
	dnumber number(1) primary key,
	dname varchar(25),
	mgr_ssn number(9),
	mgr_start_date varchar(10)
	);
	
create table dept_locations (
	dnumber number(2),
	dlocation varchar(25)
	);

create table project (
	pnumber number(2) primary key,
	pname varchar(25),
	plocation varchar(10),
	dnum number(1)
	);
	
create table works_on (
	essn number(9),
	pno number(2),
	hours number(3,1)
	);

--employee	
insert into employee values( 123456789, 'John', 'Smith', 'M', 30000, 333445555, 5 ); 
insert into employee values( 333445555, 'Franklin', 'Wong', 'M', 40000, 888665555, 5 ); 
insert into employee values( 999887777, 'Alicia', 'Zelaya', 'F', 25000, 987654321, 4 ); 
insert into employee values( 987654321, 'Jennifer', 'Wallace', 'F', 43000, 888665555, 4 ); 
insert into employee values( 666884444, 'Ramesh', 'Narayan', 'M', 38000, 333445555, 5 ); 
insert into employee values( 453453453, 'Joyce', 'English', 'F', 25000, 333445555, 5 ); 
insert into employee values( 987987987, 'Ahmad', 'Jabbar', 'M', 25000, 987654321, 4 ); 
insert into employee values( 888665555, 'James', 'Borg', 'M', 55000, NULL, 1 ); 

--department
insert into department values( 5, 'Research', 333445555, '1988-05-22');
insert into department values( 4, 'Administration', 987654321, '1995-01-01');
insert into department values( 1, 'Headquarters', 888665555, '1981-06-19');

--dept_locations
insert into dept_locations values( 1, 'Houston');
insert into dept_locations values( 4, 'Stafford');
insert into dept_locations values( 5, 'Bellaire');
insert into dept_locations values( 5, 'Sugarland');
insert into dept_locations values( 5, 'Houston');

--project
insert into project values( 1, 'ProductX', 'Bellaire', 5);
insert into project values( 2, 'ProductY', 'Sugarland', 5);
insert into project values( 3, 'ProductZ', 'Houston', 5);
insert into project values( 10, 'Computerization', 'Stafford', 4);
insert into project values( 20, 'Reorganization', 'Houston', 1);
insert into project values( 30, 'Newbenefits', 'Stafford', 4);

--works_on
insert into works_on values( 123456789, 1, 32.5);
insert into works_on values(123456789, 2, 7.5);
insert into works_on values(666884444, 3, 40.0);
insert into works_on values(453453453, 1, 20.0);
insert into works_on values(453453453, 2, 20.0);
insert into works_on values(333445555, 2, 10.0);
insert into works_on values(333445555, 3, 10.0);
insert into works_on values(333445555, 10, 10.0);
insert into works_on values(333445555, 20, 10.0);
insert into works_on values(999887777, 30, 30.0);
insert into works_on values(999887777, 10, 10.0);
insert into works_on values(987987987, 10, 35.0);
insert into works_on values(987987987, 30, 5.0);
insert into works_on values(987654321, 30, 20.0);
insert into works_on values(987654321,20, 15.0);
insert into works_on values(888665555, 20, null);







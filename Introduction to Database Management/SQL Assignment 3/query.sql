/*
*		Lane Shea
*		COSC 341  Assignment 3
*		query.sql
*
*/

pause "Question 1";
select fname, lname
from employee
where dno = 5;

pause "Question 2";
select fname, lname, dname from employee, department
where employee.dno = department.dnumber;

pause "Question 3";
select fname, lname, dname
from (employee natural join department) 
where dno = dnumber
order by dname;

pause "Question 4";
select fname, lname
from employee, works_on, project
where dno = 5 and ssn = essn and pno = pnumber and pname = 'ProductX' and hours > 10;

pause "Question 5";
select e.fname, e.lname
from employee e, employee s 
where s.fname = 'Franklin' and s.lname = 'Wong' and e.super_ssn = s.ssn;

pause "Question 6";
select fname, lname 
from (employee natural join dept_locations)
where dno = 1 and dno = dnumber;

pause "Question 7";
select pname, to_char(sum(hours), '999.99') "Hours"
from (project natural join works_on) 
where pnumber = pno group by pname;

pause "Question 8";
select dname, to_char(avg(salary), '$99,999.99') "Salary" 
from (employee natural join department) 
where dno = dnumber 
group by dname;
**SQL**

sid varchar(6) references student(sid)- column level foreign key

foreign key(sid) references student(sid)- table level foreign key



age int check(age between 0 and 100)-column level

constraint k1 check(age between 1 and 100)- table level



alter table table\_name drop constraint constraint\_name- to drop constraint

alter table table\_name add constraint constraint\_name \[check|foreign key|primary key]- to add constraint



select \* from a1 natural join b1 natural join c1;

&nbsp; a. If there is common table present between tables a1, b1, c1 then it will be inner join

&nbsp; b. Otherwise it gives cartesian product 





select lpad(salary, 10, '\*') from table\_name;



Write a query to display all the names which has got % symbol in the column:

select name from table\_name where name like '%\\%%' escape '\\';



Create a function in sql to check a number is even or odd and call this function from the query:

delimiter //

create function function\_name(a in number default 10)

returns varchar(30)

begin

if mod(a, 2)=0 then

return 'even'

else

return 'odd'

end if

end //

delimiter ;



Ways of writing query to call function:

select function\_name(value);

select function\_name(value) from dual;

select function\_name(column\_name) from table\_name;



How many rows and colums dual table has got? When do we use dual?

Dual is a temporary table which has got one row and one column.



order of clause- where->group by->having->order by



Flashback Queries:

create table as select \* from table\_name as of timestamp(to\_timestamp('2025-08-21 12:30'), 'yyyy-MM-dd hh:mm');





**Core Java:**

Write a stream expression to show the employee details where it belongs to a particular department

students.stream().filter((x)->(x.department.equals("department\_name"))).forEach(System.out::println)
















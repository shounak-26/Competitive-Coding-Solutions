# Write your MySQL query statement below
SELECT e1.name AS Employee
FROM Employee e1
 JOIN Employee e2 ON e1.managerId = e2.id where e1.salary>e2.salary;

 /**
Basically we create another table with id for e2 for an example e1 is orignal table & e2 is a table in which we will be having mapped ids

e1.id  e1.name e1.salary e1.managerId e2.id e2.name e2.salary e2.managerId
1       Joe      70k        3          3      Sam     60k       null

And basis of we compare salaries so join is basically mapping ID's with respective id's here it is id & managerId.
 */


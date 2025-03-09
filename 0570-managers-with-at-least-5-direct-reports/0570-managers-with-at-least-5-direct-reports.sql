# Write your MySQL query statement below


-- SELECT name FROM () AS IDOFMANAGER WHERE ID = IDOFMANAGER;4
select name from employee where id IN (SELECT MANAGERID FROM EMPLOYEE GROUP BY MANAGERID HAVING COUNT(id) >= 5);
# Write your MySQL query statement below
-- SELECT DISTINCT NUM as ConsecutiveNums  FROM (SELECT NUM, 
-- LEAD(NUM,1) OVER(ORDER BY id) AS N1,
-- LEAD(NUM,2) OVER(ORDER BY id) AS N2
-- FROM LOGS
-- ) AS T
-- WHERE NUM = N1 AND NUM = N2;


SELECT DISTINCT L1.num AS ConsecutiveNums FROM Logs L1, Logs L2, Logs L3
WHERE L2.id = L1.id + 1 AND L3.id = L2.id + 1
AND L1.num = L2.num AND L2.num = L3.num;
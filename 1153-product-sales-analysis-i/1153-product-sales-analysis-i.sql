# Write your MySQL query statement below
SELECT p.product_name, year, PRICE FROM Sales as s , Product as p where s.product_id = p.product_id; 

-- SELECT 
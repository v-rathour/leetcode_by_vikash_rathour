# Write your MySQL query statement below


SELECT salesperson.name 
FROM salesperson 
WHERE sales_id NOT IN (SELECT sales_id 
FROM orders 
WHERE orders.com_id = (SELECT com_id FROM  company WHERE company.name = "RED"));
# Write your MySQL query statement below

SELECT e.name Employee
From Employee e join Employee b ON e.managerId = b.id
where e.salary>b.salary;
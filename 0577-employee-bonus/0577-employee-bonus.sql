# Write your MySQL query statement below

SELECT employee.name,Bonus.bonus
FROM Employee 
LEFT JOIN Bonus ON Employee.empID = Bonus.empId
WHERE Bonus.bonus IS NULL OR Bonus.bonus < 1000;

# SELECT Employee.name, Bonus.bonus
# FROM Employee
# LEFT JOIN Bonus ON Employee.empID = Bonus.empId
# WHERE Bonus.bonus IS NULL OR Bonus.bonus < 1000;

# Write your MySQL query statement below

# SELECT MIN(id) as id, email 
# FROM person
# GROUP BY email;

# SELECT email FROM person;

DELETE A FROM Person A, Person B
WHERE A.email = B.email
AND A.id > B.id
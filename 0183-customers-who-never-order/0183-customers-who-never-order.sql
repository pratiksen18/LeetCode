# Write your MySQL query statement below
SELECT name as Customers FROM customers
WHERE (SELECT COUNT(*) FROM orders WHERE customerId = customers.id) < 1;
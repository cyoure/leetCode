# Write your MySQL query statement below
select firstName, lastName, city, state from Person p LEFT JOIN address a on a.personId = p.personId
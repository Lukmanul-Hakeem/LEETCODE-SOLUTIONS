# Write your MySQL query statement below
select A.id
from Weather as E
join Weather as A
on E.recordDate+1=A.recordDate
where E.temperature < A.temperature;
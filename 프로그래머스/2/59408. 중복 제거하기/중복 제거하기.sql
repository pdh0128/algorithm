-- 코드를 입력하세요
SELECT Count(*) 
from (select distinct name from ANIMAL_INS) as n
where NAME is not null;
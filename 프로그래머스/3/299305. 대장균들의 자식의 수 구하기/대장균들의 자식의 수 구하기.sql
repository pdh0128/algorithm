-- 코드를 작성해주세요
select E1.ID, count(E2.ID) as CHILD_COUNT
from ECOLI_DATA AS E1
left join ECOLI_DATA as E2 on E1.ID = E2.PARENT_ID
group by ID
order by ID asc;
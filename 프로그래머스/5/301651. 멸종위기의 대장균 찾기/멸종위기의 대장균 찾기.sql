-- 코드를 작성해주세요
with recursive cte as (
select ID, PARENT_ID, 1 as GENERATION from ECOLI_DATA where PARENT_ID is NULL
    
union all
    
select e.id, e.PARENT_ID, 1 + cte.GENERATION as GENERATION from ECOLI_DATA e inner join cte on e.PARENT_ID = cte.ID
)


select count(*) COUNT, GENERATION 
from cte
where ID not in (select distinct PARENT_ID from ECOLI_DATA where PARENT_ID is not null)
group by GENERATION
order by GENERATION asc;
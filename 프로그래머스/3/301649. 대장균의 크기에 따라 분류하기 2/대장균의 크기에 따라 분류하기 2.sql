-- 코드를 작성해주세요
select ID, 
case when per < 0.25 then "CRITICAL"
when per < 0.50 then "HIGH"
when per < 0.75 then "MEDIUM"
else "LOW"
end as COLONY_NAME
from (SELECT ID, 
              SIZE_OF_COLONY, 
              PERCENT_RANK() OVER (ORDER BY SIZE_OF_COLONY DESC) AS per 
      FROM ECOLI_DATA) as a
order by ID asc;
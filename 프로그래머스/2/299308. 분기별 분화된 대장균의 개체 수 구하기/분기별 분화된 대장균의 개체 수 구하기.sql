-- 코드를 작성해주세요
select case when Month(DIFFERENTIATION_DATE) <= 3 then "1Q" when Month(DIFFERENTIATION_DATE) <= 6 then "2Q" when Month(DIFFERENTIATION_DATE) <= 9 then "3Q" when Month(DIFFERENTIATION_DATE) <= 12 then "4Q" end as
QUARTER,  count(*) ECOLI_COUNT from ECOLI_DATA group by QUARTER
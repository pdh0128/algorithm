-- 코드를 작성해주세요
select count(*) FISH_COUNT, DATE_FORMAT(TIME, "%c") + 0 MONTH from FISH_INFO group by MONTH order by MONTH asc;
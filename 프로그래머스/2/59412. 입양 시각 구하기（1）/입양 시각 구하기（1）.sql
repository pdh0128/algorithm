-- 코드를 입력하세요
SELECT DATE_FORMAT(DATETIME, "%H") HOUR, count(*) COUNT from ANIMAL_OUTS group by HOUR HAVING HOUR >= 9 and HOUR <= 19 order by HOUR asc;
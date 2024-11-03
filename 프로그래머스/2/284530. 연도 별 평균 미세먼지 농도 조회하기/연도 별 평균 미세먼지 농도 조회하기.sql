-- 코드를 작성해주세요
select YEAR(YM) YEAR, round(AVG(PM_VAL1), 2) as PM10, 
round(AVG(PM_VAL2), 2) as "PM2.5" 
from AIR_POLLUTION where LOCATION2 = "수원"
group by YEAR order by YEAR asc;
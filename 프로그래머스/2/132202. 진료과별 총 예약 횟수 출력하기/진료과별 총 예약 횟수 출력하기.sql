-- 코드를 입력하세요
SELECT MCDP_CD "진료과 코드", count(*) "5월예약건수" 
from APPOINTMENT 
where DATE_FORMAT(APNT_YMD, "%m") = 05 
group by MCDP_CD order by count(*) asc, MCDP_CD asc
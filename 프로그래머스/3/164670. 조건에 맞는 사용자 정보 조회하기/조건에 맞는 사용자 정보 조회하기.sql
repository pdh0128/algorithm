-- 코드를 입력하세요
SELECT a.USER_ID, a.NICKNAME, 
concat(CITY," " ,STREET_ADDRESS1, " " , STREET_ADDRESS2) 전체주소, 
concat( substring(TLNO, 1, 3),"-", substring(TLNO, 4, 4), "-", substring(TLNO, 8, 4) ) as "전화번호 "
from USED_GOODS_USER a inner join USED_GOODS_BOARD b on a.USER_ID = b.WRITER_ID
group by a.USER_ID Having count(BOARD_ID) >= 3
order by USER_ID desc;
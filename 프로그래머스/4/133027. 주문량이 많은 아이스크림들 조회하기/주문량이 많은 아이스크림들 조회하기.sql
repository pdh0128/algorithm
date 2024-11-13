-- 코드를 입력하세요
SELECT a.FLAVOR from FIRST_HALF a inner join JULY b on a.FLAVOR = b.FLAVOR group by a.FLAVOR, a.TOTAL_ORDER  order by a.TOTAL_ORDER + sum(b.TOTAL_ORDER) desc limit 3;
-- 코드를 입력하세요
SELECT b.INGREDIENT_TYPE, sum(a.TOTAL_ORDER) TOTAL_ORDER from FIRST_HALF a inner join ICECREAM_INFO b on a.FLAVOR = b.FLAVOR group by INGREDIENT_TYPE;
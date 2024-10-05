-- 코드를 입력하세요
SELECT CAR_TYPE, count(*) CARS from CAR_RENTAL_COMPANY_CAR where OPTIONS REGEXP "열선시트|가죽시트|통풍시트"
group by CAR_TYPE order by CAR_TYPE asc;
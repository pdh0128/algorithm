-- 코드를 입력하세요
SELECT Date_format(SALES_DATE, '%Y-%m-%d') SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT from ONLINE_SALE where Date_format(SALES_DATE, '%Y-%m') = '2022-03'

union all

SELECT Date_format(SALES_DATE, '%Y-%m-%d') SALES_DATE,PRODUCT_ID, NULL as USER_ID, SALES_AMOUNT from OFFLINE_SALE  where Date_format(SALES_DATE, '%Y-%m') = '2022-03' 

order by SALES_DATE asc, PRODUCT_ID asc, USER_ID asc;

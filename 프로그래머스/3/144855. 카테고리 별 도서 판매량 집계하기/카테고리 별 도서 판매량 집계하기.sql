-- 코드를 입력하세요
SELECT a.CATEGORY , sum(b.SALES) TOTAL_SALES from BOOK a inner join BOOK_SALES b
on a.BOOK_ID = b.BOOK_ID 
where DATE_FORMAT(SALES_DATE, "%Y-%m") = "2022-01"
group by a.CATEGORY order by a.CATEGORY asc;

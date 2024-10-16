-- 코드를 작성해주세요
select count(*) FISH_COUNT, DATE_FORMAT(TIME, "%c") + 0 MONTH from FISH_INFO group by MONTH order by MONTH asc;
-- sql에서 문자열에 + 0을 하면 정수로 인식한다는 것을 알게 되었다.

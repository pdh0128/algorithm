-- 코드를 작성해주세요
select distinct b.ID, b.EMAIL, b.FIRST_NAME, b.LAST_NAME from SKILLCODES a inner join DEVELOPERS b 
where b.SKILL_CODE & a.CODE = a.CODE and a.CATEGORY = "Front End"
order by b.ID asc;
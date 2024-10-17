-- 코드를 작성해주세요
select sum(c.SCORE) SCORE, b.EMP_NO, b.EMP_NAME, b.POSITION, b.EMAIL 
from HR_DEPARTMENT a inner join HR_EMPLOYEES b on a.DEPT_ID = b.DEPT_ID 
inner join HR_GRADE c on b.EMP_NO = c.EMP_NO group by EMP_NO order by SCORE desc limit 1;


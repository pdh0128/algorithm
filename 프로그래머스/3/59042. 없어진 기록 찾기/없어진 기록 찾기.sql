-- 코드를 입력하세요
SELECT a.ANIMAL_ID, a.NAME from ANIMAL_OUTS a 
where NOT EXISTS (select ANIMAL_ID from ANIMAL_INS where ANIMAL_ID = a.ANIMAL_ID) order by a.ANIMAL_ID asc;
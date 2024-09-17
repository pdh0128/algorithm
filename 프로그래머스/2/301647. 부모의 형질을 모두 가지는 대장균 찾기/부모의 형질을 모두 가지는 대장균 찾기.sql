-- 코드를 작성해주세요
select a.ID, a.GENOTYPE, b.GENOTYPE PARENT_GENOTYPE from ECOLI_DATA a inner join ECOLI_DATA b on b.ID = a.PARENT_ID where a.GENOTYPE & b.GENOTYPE = b.GENOTYPE order by a.ID asc;
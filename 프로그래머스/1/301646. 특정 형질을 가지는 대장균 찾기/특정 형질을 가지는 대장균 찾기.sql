
select count(*) count from ECOLI_DATA where GENOTYPE & 2 = 0 and (GENOTYPE & 4 or  GENOTYPE & 1);
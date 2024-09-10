-- 코드를 입력하세요
SELECT count(*) USERS from USER_INFO where date_format(JOINED, "%y") = 21 and (AGE >= 20 and AGE <= 29);
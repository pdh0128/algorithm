SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
FROM REST_INFO AS r
WHERE FAVORITES = (
    SELECT MAX(FAVORITES)
    FROM REST_INFO
    WHERE FOOD_TYPE = r.FOOD_TYPE
)
ORDER BY FOOD_TYPE DESC;

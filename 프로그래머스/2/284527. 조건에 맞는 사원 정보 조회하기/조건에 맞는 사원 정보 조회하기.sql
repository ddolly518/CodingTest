-- 코드를 작성해주세요
SELECT SUM(SCORE) AS SCORE, EMP_NO, EMP_NAME, POSITION, EMAIL
FROM HR_EMPLOYEES JOIN HR_GRADE USING (EMP_NO)
WHERE YEAR=2022
GROUP BY EMP_NO
ORDER BY SCORE DESC
LIMIT 1
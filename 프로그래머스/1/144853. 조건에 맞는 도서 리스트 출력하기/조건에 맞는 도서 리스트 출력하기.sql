-- 코드를 입력하세요 DATE TYPE은 LIKE 사용 불가
SELECT BOOK_ID, date_format(PUBLISHED_DATE, '%Y-%m-%d')
FROM BOOK
WHERE  YEAR(PUBLISHED_DATE)=2021 AND CATEGORY="인문"
ORDER BY PUBLISHED_DATE ASC
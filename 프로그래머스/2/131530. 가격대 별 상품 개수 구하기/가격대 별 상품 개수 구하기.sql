-- 코드를 입력하세요
SELECT (IFNULL((PRICE DIV 10000),0)*10000) AS PRICE_GROUP, COUNT(PRICE DIV 10000)AS PRODUCTS
FROM PRODUCT
GROUP BY (PRICE DIV 10000)
ORDER BY (PRICE DIV 10000)
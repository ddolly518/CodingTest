-- 코드를 입력하세요
SELECT ROUND(AVG(DAILY_FEE),0) AS AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE='SUV';

/* CAR_RENTAL_COMPANY_CAR
CAR_ID : 아이디
CAR_TYPE : 자동차 종류('세단', 'SUV', '승합차', '트럭', '리무진')
DAILY_FEE : 일일 대여 요금
OPTIONS : 옵션*/


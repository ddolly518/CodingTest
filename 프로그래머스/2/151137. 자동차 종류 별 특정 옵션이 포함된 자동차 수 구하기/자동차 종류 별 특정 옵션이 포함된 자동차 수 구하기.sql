-- 코드를 입력하세요
SELECT CAR_TYPE, COUNT(CAR_TYPE) AS CARS
FROM CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS LIKE '%통풍시트%' OR OPTIONS LIKE '%열선시트%' OR OPTIONS LIKE '%가죽시트%' 
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE

/*CAR_ID : 아이디
CAR_TYPE : 종류('세단', 'SUV', '승합차', '트럭', '리무진')
DAILY_FEE : 일일 대여 요금
OPTIONS : 옵션 리스트('주차감지센서', '스마트키', '네비게이션', '통풍시트', '열선시트', '후방카메라', '가죽시트')*/
-- 코드를 입력하세요
SELECT B.TITLE, B.BOARD_ID, R.REPLY_ID, R.WRITER_ID, R.CONTENTS, DATE_FORMAT(R.CREATED_DATE, '%Y-%m-%d')
FROM USED_GOODS_BOARD AS B JOIN USED_GOODS_REPLY AS R USING(BOARD_ID)
WHERE YEAR(B.CREATED_DATE)=2022 AND MONTH(B.CREATED_DATE)=10
ORDER BY R.CREATED_DATE ASC, B.TITLE ASC;

/* USED_GOODS_BOARD
BOARD_ID : 게시글 아이디
WRITER_ID : 작성자 아이디
TITLE : 게시글 제목
CONTENTS : 게시글 내용
PRICE : 가격
CREATED_DATE : 작성일
STATUS : 거래상태
VIEWS: 조회수

USED_GOODS_REPLY
REPLY_ID : 댓글 아이디
BOARD_ID : 게시글 아이디
WRITER_ID : 작성자 아이디
CONTENTS : 댓글 내용
CREATED_DATE : 작성일*/
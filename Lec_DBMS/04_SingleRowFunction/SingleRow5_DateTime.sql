-- 날짜 함수
SELECT SYSDATE FROM dual;

-- 기본적인 날짜 연산
SELECT sysdate "오늘", sysdate + 1 "내일(24h뒤)", sysdate - 2 "그저께", sysdate + 1/24 "한시간뒤" FROM dual;

-- 일자 차이 계산
SELECT sysdate "오늘", to_date('2020-03-16 09:00:00', 'yyyy-mm-dd hh:mi:ss') "시작한날",
sysdate - to_date('2020-03-16 09:00:00', 'yyyy-mm-dd hh:mi:ss') "경과" FROM dual;

--months_between : 날짜사이의 개월수
SELECT
months_between('2012-03-01', '2012-01-01') "양수값", 
months_between('2012-01-01', '2012-03-01') "음수값",
months_between('2012-02-29', '2012-02-01') "28/31",
months_between('2012-05-31', '2012-05-01') "30/31"
FROM dual;

-- #4501
SELECT NAME 이름, TO_char(SYSDATE, 'RRRR-MM-DD') 오늘, TO_char(HIREDATE, 'rrrr-mm-dd') 입사일, (trunc(sysdate) - hiredate)/365 근속연수--, 근속개월, 근속일
FROM T_PROFESSOR;

-- add_month() 개월추가
SELECT sysdate, last_day(sysdate) "이번달 마지막날", next_day(sysdate, '월') FROM dual;

-- 날짜의 ROUND() 함수  ,  하루의 반은 정오 12:00:00 이다. 이를 넘어서면 다음 날짜
-- 날짜의 TRUNC() 함수,  무조건 당일 출력.
-- 원서 접수나 상품 주문 등에서 오전까지 접수된 건은 당일 접수 처리. 오후접수는 익일 처리 등에서 사용.

SELECT sysdate, round(sysdate), trunc(sysdate) FROM dual;








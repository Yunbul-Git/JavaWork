SELECT * FROM T_PROFESSOR; 

-- null 값과의 모든 연산결과는 null;
SELECT NAME, pay, bonus, pay + BONUS FROM T_PROFESSOR;

-- 그룹함수에서는 동작
SELECT SUM(pay), sum(BONUS), sum(pay+BONUS), sum(pay)+sum(BONUS)  FROM T_PROFESSOR ;

-- nvl()
SELECT NAME, pay, bonus, PAY + BONUS, pay + NVL(BONUS, 0) 총지급액 FROM T_PROFESSOR;

-- #4201
SELECT NAME, PAY, NVL(BONUS, '0') BONUS, PAY * 12 + NVL(BONUS, 0) 연봉 FROM T_PROFESSOR WHERE DEPTNO = 101;

-- #4202
SELECT NAME, PAY, NVL2(BONUS, BONUS, '0') BONUS, NVL2(BONUS, PAY * 12 + BONUS, PAY * 12) 연봉 FROM T_PROFESSOR WHERE DEPTNO = 101;










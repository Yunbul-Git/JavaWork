-- SELECT 결과물중 맨 위의 5개만 출력해보고 싶으면 어케 해야 하나?
--   ex) 게시판.. 페이징

-- DBMS 마다 구현 방법 다름
--	MYSQL : LIMIT
-- 	MS SQL server : TOP
-- 	ORACLE : ROWNUM 

SELECT EMPNO, ENAME, SAL FROM T_EMP;


-- 자동적으로 오라클에서 붙여주는 행번호 객체 ROWNUM
SELECT ROWNUM, EMPNO, ENAME, SAL FROM T_EMP;

SELECT ROWNUM, EMPNO, ENAME, SAL FROM T_EMP ORDER BY EMPNO DESC;

-- 상위 5개만
SELECT ROWNUM, EMPNO, ENAME, SAL FROM T_EMP WHERE ROWNUM <= 5 ORDER BY EMPNO DESC;

-- select에 없어도 동작
SELECT EMPNO, ENAME, SAL FROM T_EMP WHERE ROWNUM <= 5 ORDER BY EMPNO DESC;

-- ROWNUM > 5 ???? 범위에 1이 포함 안되면 동작안함.
SELECT ROWNUM, EMPNO, ENAME, SAL FROM T_EMP WHERE ROWNUM >= 5 ORDER BY EMPNO DESC;

SELECT ROWNUM, EMPNO, ENAME, SAL FROM T_EMP WHERE ROWNUM >= 5 AND ROWNUM < 11 ORDER BY EMPNO DESC;

-- phonebook 뻥튀기
SELECT * FROM PHONEBOOK ;
INSERT INTO phonebook (SELECT * FROM PHONEBOOK);

INSERT INTO phonebook (SELECT phonebook_seq.nextval, PB_NAME, pb_phonenum, pb_memo, sysdate FROM phonebook);

-- ROWNUM rev.
FROM (SELECT pb_uid, pb_name, pb_phonenum FROM PHONEBOOK ORDER BY PB_UID DESC) T;

SELECT ROWNUM AS RNUM T.*
FROM (SELECT pb_uid, pb_name, pb_phonenum FROM PHONEBOOK ORDER BY PB_UID DESC) T;
SELECT * FROM 
(
SELECT ROWNUM AS RNUM, T.*
FROM (SELECT pb_uid, pb_name, pb_phonenum FROM PHONEBOOK ORDER BY PB_UID DESC) T
)
WHERE RNUM >= 6 AND RNUM < 6 + 5;







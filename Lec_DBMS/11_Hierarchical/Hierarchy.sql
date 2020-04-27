-- 계층형 쿼리(Hierarchical Query)

SELECT * FROM T_DEPT2; -- 서로의 계층관계 주목!

SELECT LPAD(dname, 10, '*') 부서명 FROM T_DEPT2 ;

-- level
SELECT DNAME, LEVEL FROM t_dept2 CONNECT BY PRIOR DCODE = PDEPT START WITH DCODE = 0001;

/* 해설
 * LEVEL 은 오라클에서 계속 사용할 수 있는 것으로
 * 해당 데이터가 몇번째 단계 이냐를 의미하는 것.
 * 
 * CONNECT BY PRIOR  :  각 row 들이 어떻게 연결되어야 하는지 조건 지정
 * PRIOR를 어느쪽에 주느냐가 중요!
 */

SELECT DNAME, LEVEL FROM t_dept2 CONNECT BY DCODE = PRIOR PDEPT START WITH DCODE = 0001;




SELECT DCODE, DNAME, PDEPT, LEVEL FROM t_dept2 CONNECT BY DCODE = PRIOR PDEPT START WITH DCODE = 1005; 

SELECT DCODE, DNAME, PDEPT, LEVEL FROM t_dept2 CONNECT BY DCODE = PRIOR PDEPT START WITH DCODE = 1011;


SELECT LPAD(DNAME, LEVEL * 6, '*') 부서명 FROM T_DEPT2 CONNECT BY PRIOR DCODE = PDEPT 
START WITH DCODE = 0001;

SELECT * FROM T_EMP2;

SELECT LPAD(e.NAME || ' ' || d.dname || ' ' || NVL(e.POST, '사원'), LEVEL * 22, '-') "이름과 직급" FROM T_EMP2 e, (SELECT DNAME, DCODE, PDEPT FROM T_DEPT2) d
WHERE e.DEPTNO = d.DCODE CONNECT BY PRIOR e.EMPNO = e.PEMPNO START WITH e.EMPNO = 20000101;

SELECT LEVEL - 1 FROM dual CONNECT BY LEVEL <= 24;


-- https://programmers.co.kr/learn/courses/30/lessons/59413?language=oracle
SELECT h.hr "HOUR", count(datetime) "COUNT"
from  (SELECT (LEVEL - 1) hr FROM dual CONNECT BY LEVEL <= 24) h left outer join animal_outs a 
on h.hr = to_number(to_char(a.datetime, 'hh24'))
group by h.hr order by 1;







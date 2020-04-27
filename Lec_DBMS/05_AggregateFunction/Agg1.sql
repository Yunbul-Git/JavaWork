SELECT * FROM T_PROFESSOR;
SELECT count(*), count(HPAGE) FROM T_PROFESSOR ; -- 그룹함수에서는 null 값은 계산에서 제외
SELECT count(bonus), sum(bonus), avg(bonus) FROM T_PROFESSOR ;
SELECT max(HIREDATE), min(HIREDATE) FROM T_EMP ;

-- null 허용 컬럼의 그룹함수 적용시
-- nvl, nvl2 사용해야 함
SELECT avg(bonus), avg(nvl(bonus, 0)) FROM T_PROFESSOR;

-- t_professor 테이블에서 ‘학과별’로 교수들의 평균 보너스를 출력하세요
-- select절에 group 함수와 group함수가 아닌 것은 같이 출력 불가.
SELECT DEPTNO, round(avg(nvl(bonus, 0)), 1) FROM T_PROFESSOR GROUP BY DEPTNO;

-- #5101
SELECT DEPTNO, "POSITION", avg(PAY) 평균급여 FROM T_PROFESSOR GROUP BY DEPTNO, "POSITION" ORDER BY DEPTNO ASC, "POSITION" ASC;

-- 부서별 평균급여를 출력하되, 평균급여가 450 보다 많은 학과만 출력
SELECT deptno, avg(pay) 평균급여 FROM T_PROFESSOR WHERE avg(pay) > 450, GROUP BY deptno; -- 그룹함수는 where 절에서 사용 불가 


SELECT deptno, avg(pay) 평균급여 FROM T_PROFESSOR GROUP BY deptno having avg(pay) > 450;


-- <select 쿼리문 순서>

-- SELECT
-- from
-- where
-- group by
-- having
-- order by 

-- #5102
SELECT MGR 매니저, count(EMPNO) 직원수, sum(SAL) 급여총액, trunc(avg(SAL)) 급여평균, avg(nvl(COMM, 0)) 교통비평균 FROM T_EMP WHERE JOB != 'PRESIDENT' GROUP BY mgr;

-- #5103
SELECT * FROM T_PROFESSOR ;
SELECT DEPTNO, count(DEPTNO) 총인원, round(avg(SYSDATE - HIREDATE), 1) 근속일평균, avg(PAY) 급여평균, avg(nvl(BONUS, 0)) 보너스평균 FROM T_PROFESSOR WHERE "POSITION" = '정교수' OR "POSITION" = '조교수' GROUP BY DEPTNO;

-- #5104
SELECT DEPTNO1 학과, max(WEIGHT) - min(WEIGHT) 최대최소몸무게차 FROM T_STUDENT GROUP BY DEPTNO1;

-- #5105
SELECT DEPTNO1 학과, max(WEIGHT) - min(WEIGHT) 최대최소몸무게차 FROM T_STUDENT GROUP BY DEPTNO1 having max(WEIGHT) - min(WEIGHT) >= 30;










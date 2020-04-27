-- JOIN

-- from 절에 테이블에도 별칭(alias)를 줄 수 있다.
-- 20 레코드
SELECT s.STUDNO, s.NAME, s.DEPTNO1 
FROM  T_STUDENT s;

-- 12 레코드
SELECT d.DEPTNO , d.DNAME 
FROM T_DEPARTMENT d;

-- 카티션곱 (Cartesian Product)
-- 두개의 테이블을 JOIN 하게 되면, 
-- 각 테이블의 레코드들의 모든 조합이 출력된다.
-- WHERE 나 ON 등으로 JOIN 조건이 주어지지 않으면 
-- 모든 카티션곱이 출력된다. 

-- 240 레코드
SELECT s.STUDNO , s.NAME , s.DEPTNO1,
	d.DEPTNO , d.DNAME
FROM T_STUDENT s, T_DEPARTMENT d; -- Oracle 방식

SELECT s.STUDNO , s.NAME , s.DEPTNO1,
	d.DEPTNO , d.DNAME
FROM T_STUDENT s CROSS JOIN T_DEPARTMENT d; -- ansi 방식
-- #6101
-- equi join (등가 join)
-- oracle join 방식
SELECT s.NAME "학생이름", s.DEPTNO1 "학과번호", d.DNAME "학과이름"
FROM t_student s, T_DEPARTMENT d
WHERE s.DEPTNO1 = d.DEPTNO ;

-- ansi join 방식
SELECT s.NAME "학생이름", s.DEPTNO1 "학과번호", d.DNAME "학과이름"
FROM t_student s JOIN T_DEPARTMENT d
ON  s.DEPTNO1 = d.DEPTNO ;

-- 제 2전공은? deptno2
SELECT s.NAME "학생이름", s.DEPTNO2 "학과번호", d.DNAME "학과이름"
FROM T_STUDENT s, T_DEPARTMENT d
WHERE s.DEPTNO2 = d.deptno;

-- #6102
-- oracle join
SELECT s.NAME 학생이름, s.PROFNO 지도교수, p.NAME 지도교수이름 
FROM T_STUDENT s, T_PROFESSOR p
WHERE s.PROFNO = p.PROFNO ;
-- ansi join
SELECT s.NAME 학생이름, s.PROFNO 지도교수, p.NAME 지도교수이름 
FROM T_STUDENT s join T_PROFESSOR p
on s.PROFNO = p.PROFNO;

-- #6103
-- oracle join
SELECT s.NAME 학생이름, d.DNAME 학과이름, p.NAME 교수이름
FROM t_student s, t_department d, t_professor p 
WHERE s.DEPTNO1 = d.DEPTNO AND s.PROFNO = p.PROFNO;
-- ansi join
SELECT s.NAME 학생이름, d.DNAME 학과이름, p.NAME 교수이름
FROM t_student s join t_department d on s.DEPTNO1 = d.DEPTNO 
join t_professor p on s.PROFNO = p.PROFNO; 

-- #6104
-- oracle join
SELECT e.NAME 사원이름, e.POST 현재, e.PAY 현재연봉, p.S_PAY 하한금액, p.E_PAY 상한금액
FROM t_emp2 e, t_post p
WHERE e.POST = p.POST ;
-- ansi join
SELECT e.NAME 사원이름, e.POST 현재, e.PAY 현재연봉, p.S_PAY 하한금액, p.E_PAY 상한금액
FROM t_emp2 e join t_post p
on e.POST = p.POST ;

-- #6105
-- oracle join
SELECT t.NAME 학생이름, p.NAME 교수이름
FROM T_STUDENT t, T_PROFESSOR p
WHERE t.PROFNO = p.PROFNO AND DEPTNO1 = 101;
-- ansi join
SELECT t.NAME 학생이름, p.NAME 교수이름
FROM T_STUDENT t join T_PROFESSOR p
on t.PROFNO = p.PROFNO AND DEPTNO1 = 101;




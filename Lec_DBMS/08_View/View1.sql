
-- #8101
CREATE VIEW v_prof
AS
SELECT profno, name, email, hpage
FROM T_PROFESSOR ;

SELECT * FROM v_prof;


SELECT tname FROM tab;

-- #8102
CREATE VIEW v_prof_dept
AS
SELECT p.PROFNO 교수번호, p.NAME 교수명, d.DNAME 소속학과명 
FROM T_PROFESSOR p, T_DEPARTMENT d WHERE p.DEPTNO = d.DEPTNO ;

SELECT * FROM v_prof_dept;

-- #8103
SELECT d.DNAME 학과명, s.max_height 최대키, s.max_weight 최대몸무게 
FROM (SELECT DEPTNO1 , MAX(HEIGHT) max_height, MAX(WEIGHT) max_weight
FROM T_STUDENT GROUP BY DEPTNO1) s, T_DEPARTMENT d
WHERE s.deptno1 = d.DEPTNO ;

-- #8104
SELECT d.DNAME 학과명, s1.max_height 최대키, s2.NAME 학생이름, s2.HEIGHT 키
FROM (SELECT DEPTNO1, max(HEIGHT) max_height FROM T_STUDENT GROUP BY DEPTNO1) s1, t_student s2, T_DEPARTMENT d
WHERE s1.DEPTNO1 = d.DEPTNO AND s2.DEPTNO1 = d.DEPTNO AND s1.max_height = s2.HEIGHT ;

-- #8105
SELECT s2.GRADE 학년, s2.NAME 이름, s2.HEIGHT 키, s1.avg_height 평균키
FROM (SELECT GRADE, AVG(HEIGHT) avg_height FROM T_STUDENT GROUP BY GRADE) s1, T_STUDENT s2
WHERE s1.grade = s2.GRADE AND s2.HEIGHT > s1.avg_height ORDER BY s1.GRADE ASC;




















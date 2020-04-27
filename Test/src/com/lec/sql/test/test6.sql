| 교수님 이름 | 소속 학과명 |   ← 이렇게 출력될수 있도록 SQL 문을 작성하세요

 

* 별칭 도 작성해 주세요


SELECT p.name "교수님이름", d.dname "소속 학과명" FROM t_professor p, t_department d
WHERE p.deptno = d.deptno;
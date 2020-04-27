	
이윤나 학생의 학과와 동일한 학과의 학생들의

 | 학생이름 | 학과명 |   이 출력될수 있도록 SQL 문을 작성하세요.

 

* 별칭 도 작성해주세요


SELECT s.name "학생이름", d.dame "학과명" FROM t_student s, t_department d
WHERE s.deptno = d.deptno AND s.name = '이윤나';


SELECT s.name "학생이름", d.dame "학과명" FROM (SELECT name FROM t_student WHERE ) s, t_department d
WHERE s.deptno = d.deptno AND s.name = '이윤나';	



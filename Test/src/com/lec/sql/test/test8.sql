	
다음을 조회하는 View 를 생성하는 SQL을 작성하세요

 

| 학생이름 | 학생학과명 | 담당교수님 이름 |      

 

View  이름:  v_stud_info 

 

View 출력컬럼명은 [ sname | dname | pname ]

CREATE VIEW v_stud_info 
AS 
SELECT s.name "sname", d.dname "dname", p.name "pname" FROM t_student s, t_professor p, t_department d
WHERE s.deptno = d.deptno AND s.profno = p.profno AND p.deptno = d.deptno;





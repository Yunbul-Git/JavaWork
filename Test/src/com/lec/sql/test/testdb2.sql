다음과 같은 제약조건을 가진 테이블을 생성하는 DDL 문을 작성하세요

테이블명 : T_MEMBER
컬럼명	타입	제약조건
mb_uid	숫자	PK
mb_name	문자(최대 20문자)	NN
mb_jumin	문자(13문자)	UK
mb_age	숫자	0보다 커야 한다
mb_dept	숫자	T_DEPT 테이블의 DCODE 참조


CREATE TABLE T_MEMBER (
mb_uid NUMBER PRIMARY KEY,
mb_name varchar2(20) NOT NULL,
mb_jumin varchar2(13) UNIQUE,
mb_age NUMBER CHECK(age > 0),
mb_dept NUMBER REFERENCES T_DEPT(DCODE)
);



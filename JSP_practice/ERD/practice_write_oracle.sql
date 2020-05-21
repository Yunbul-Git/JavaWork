
/* Drop Tables */

DROP TABLE practice_write CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE practice_write
(
	pwr_uid number NOT NULL,
	pwr_name varchar2(40) NOT NULL,
	pwr_subject varchar2(200) NOT NULL,
	pwr_content clob,
	pwr_viewCnt number default 0,
	pwr_regDate date default sysdate,
	PRIMARY KEY (pwr_uid)
);

CREATE SEQUENCE practice_write_seq;

SELECT * FROM PRACTICE_WRITE 


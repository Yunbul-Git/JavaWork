SELECT * FROM TEST_MEMBER ;

-- insert into 테이블이름
-- delete from 테이블이름
-- update 테이블 이름 set

INSERT INTO TEST_MEMBER values(10, '남윤주', sysdate);
SELECT * FROM TEST_MEMBER ;

INSERT INTO TEST_MEMBER values(22, '이승환', '1994-02-21');
INSERT INTO TEST_MEMBER values(17, '윤종섭', '2009-08-03');
INSERT INTO TEST_MEMBER values('', '윤종섭', ''); -- 비어있는 ''를 insert 하면 null값 처리
--INSERT INTO test_member values(10, '', sysdate);
INSERT INTO TEST_MEMBER VALUES(NULL, '문상현', '2017-01-01');


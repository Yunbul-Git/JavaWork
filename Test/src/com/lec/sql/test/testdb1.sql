	
1. 아래 계정을 생성하는 SQL 문을 작성하세요

아이디 : scott

비밀번호 : tiger 

2, 위 계정에 접속권한, 테이블을 생성할수 있는 권한을 부여하는 SQL 문을 작성하세요


1.
create user scott identified by tiger;

2.
GRANT CONNECT, resource TO scott;

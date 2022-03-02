/* SQL 파일에서 주석을 쓰는 방법
 * 실습용 테이블생성! 
 * create tabel 테이블명
 * 테이블명 : aimember
 * 컬럼 : id VARCHAR2(20)
 * 		 pw VARCHAR2(30)
 * 		 name VARCHAR2(15)
 * 		 age NUMBER(5)
 */
create table aimember(
	id varchar2(20),
	pw varchar2(30),
	name varchar2(15),
	age number(5)
)
select * from aimember
/*
 * 테이블에 데이터 추가하기
 * insert into 테이블명 values(데이터1, 데이터2, 데이터3, 데이터4)
 */
insert into AIMEMBER values('dnsql456','12345','김운비',20)















/* SQL ���Ͽ��� �ּ��� ���� ���
 * �ǽ��� ���̺����! 
 * create tabel ���̺��
 * ���̺�� : aimember
 * �÷� : id VARCHAR2(20)
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
 * ���̺� ������ �߰��ϱ�
 * insert into ���̺�� values(������1, ������2, ������3, ������4)
 */
insert into AIMEMBER values('dnsql456','12345','����',20)

create table member(
	id varchar2(20),
	pw varchar2(30) not null,
	nick varchar2(15) not null,
	score number(10) not null, 
	constraint member_score_ck check (score >= 0),
	constraint member_id_pk primary key (id)
)
drop table quiz

create table quiz(
	question varchar2(1000) not null,
	answer varchar2(100) not null,
	hint varchar2(300) not null,
	mp3 varchar2(300)
)

select * from MEMBER

insert into MEMBER
values('22','22','test',500)



select * from quiz

--insert into quiz













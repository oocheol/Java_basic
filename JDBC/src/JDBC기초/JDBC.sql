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

drop table member

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
values('11','11','test',50)



select * from quiz

insert into quiz

---------------------------------------------------------------
---------------------------------------------------------------

create table member(
	member_id number(10),
	last_name varchar2(25) not null,
	first_name varchar2(25) not null,
	address varchar2(100) not null,
	city varchar2(30),
	phone varchar(15),
	join_date date DEFAULT SYSDATE not null,
	constraint member_mid_pk primary key (member_id)
)

select * from member

create table title(
title_id number(10),
title varchar2(60) not null,
description varchar2(400) not null,
rating varchar2(4),
category varchar2(20),
release_date date,
constraint title_tid_pk primary key (title_id),
constraint title_rat_ck check (rating in ('G','PG','R','NC17','NR')),
constraint title_cat_ck check (category in ('DRAMA','COMEDY','ACTION','CHILD','SCIFL','DOCUMENTARY'))
)

select * from TITLE

CREATE TABLE TITLE_COPY(
COPY_ID NUMBER(10),
TITLE_ID NUMBER(10),
STATUS VARCHAR2(15) NOT NULL,
CONSTRAINT TICOPY_ID_PK PRIMARY KEY (COPY_ID, TITLE_ID),
CONSTRAINT TICOPY_TID_FK FOREIGN KEY (TITLE_ID)
REFERENCES TITLE (TITLE_ID),
CONSTRAINT TICOPY_ST_CK CHECK (STATUS IN ('AVAILABLE', 'DESTROYED', 'RENTED', 'RESERVED'))
)

CREATE TABLE RENTAL(
BOOK_DATE DATE DEFAULT SYSDATE,
MEMBER_ID NUMBER(10),
COPY_ID NUMBER(10),
ACT_TET_DATE DATE,
EXP_RET_DATE DATE DEFAULT SYSDATE + 2,
TITLE_ID NUMBER(10),
CONSTRAINT RENTAL_ID_PK PRIMARY KEY (BOOK_DATE, MEMBER_ID, COPY_ID, TITLE_ID),
CONSTRAINT RENTAL_MID_FK FOREIGN KEY (MEMBER_ID)
REFERENCES MEMBER (MEMBER_ID),
CONSTRAINT RENTAL_ID_FK FOREIGN KEY (COPY_ID, TITLE_ID)
REFERENCES TITLE_COPY (COPY_ID, TITLE_ID)
)


CREATE TABLE RESERVATION(
RES_DATE DATE,
MEMBER_ID NUMBER(10),
TITLE_ID NUMBER(10),
CONSTRAINT RES_ALL_PK PRIMARY KEY (RES_DATE, MEMBER_ID, TITLE_ID),
CONSTRAINT RES_MID_FK FOREIGN KEY (MEMBER_ID)
REFERENCES MEMBER (MEMBER_ID),
CONSTRAINT RES_TID_FK FOREIGN KEY (TITLE_ID)
REFERENCES TITLE (TITLE_ID)
)

--- ���� 3

-- a. member ȸ����ȣ ������(member_id_seq) 101���� ���� nocash, nocycle
-- b. title �����ȣ ������(title_id_seq) 92���� ���� nocash, nocycle 
-- c.������ ���� Ȯ�� (������ ��ųʸ�)


















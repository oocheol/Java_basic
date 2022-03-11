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

DROP TABLE RESERVATION;
DROP TABLE RENTAL;
DROP TABLE TITLE_COPY;

DROP TABLE TITLE;
drop table member;

create table member(
	member_id number(10),
	last_name varchar2(25) not null,
	first_name varchar2(25) not null,
	address varchar2(100) not null,
	city varchar2(30),
	phone varchar(15),
	join_date date DEFAULT SYSDATE not null,
	constraint member_mid_pk primary key (member_id)
);

create table title(
title_id number(10),
title varchar2(60) not null,
description varchar2(400) not null,
rating varchar2(4),
category varchar2(20),
release_date date,
constraint title_tid_pk primary key (title_id),
constraint title_rat_ck check (rating in ('G','PG','R','NC17','NR')),
constraint title_cat_ck check (category in ('DRAMA','COMEDY','ACTION','CHILD','SCIFI','DOCUMENTARY'))
);



CREATE TABLE TITLE_COPY(
COPY_ID NUMBER(10),
TITLE_ID NUMBER(10),
STATUS VARCHAR2(15) NOT NULL,
CONSTRAINT TICOPY_ID_PK PRIMARY KEY (COPY_ID, TITLE_ID),
CONSTRAINT TICOPY_TID_FK FOREIGN KEY (TITLE_ID)
REFERENCES TITLE (TITLE_ID),
CONSTRAINT TICOPY_ST_CK CHECK (STATUS IN ('AVAILABLE', 'DESTROYED', 'RENTED', 'RESERVED'))
);


CREATE TABLE RENTAL(
BOOK_DATE DATE DEFAULT SYSDATE,
MEMBER_ID NUMBER(10),
COPY_ID NUMBER(10),
ACT_RET_DATE DATE,
EXP_RET_DATE DATE DEFAULT SYSDATE + 2,
TITLE_ID NUMBER(10),
CONSTRAINT RENTAL_ID_PK PRIMARY KEY (BOOK_DATE, MEMBER_ID, COPY_ID, TITLE_ID),
CONSTRAINT RENTAL_MID_FK FOREIGN KEY (MEMBER_ID)
REFERENCES MEMBER (MEMBER_ID),
CONSTRAINT RENTAL_ID_FK FOREIGN KEY (COPY_ID, TITLE_ID)
REFERENCES TITLE_COPY (COPY_ID, TITLE_ID)
);



CREATE TABLE RESERVATION(
RES_DATE DATE,
MEMBER_ID NUMBER(10),
TITLE_ID NUMBER(10),
CONSTRAINT RES_ALL_PK PRIMARY KEY (RES_DATE, MEMBER_ID, TITLE_ID),
CONSTRAINT RES_MID_FK FOREIGN KEY (MEMBER_ID)
REFERENCES MEMBER (MEMBER_ID),
CONSTRAINT RES_TID_FK FOREIGN KEY (TITLE_ID)
REFERENCES TITLE (TITLE_ID)
);

--- 문제 3

-- a. member 회원번호 시퀀스(member_id_seq) 101부터 시작 nocache, nocycle
-- b. title 제목번호 시퀀스(title_id_seq) 92부터 시작 nocache, nocycle 
-- c.시퀀스 존재 확인 (데이터 딕셔너리)

drop SEQUENCE member_id_seq;

create sequence member_id_seq
increment by 1
start with 101
nocache;

drop sequence title_id_seq;

create sequence title_id_seq
increment by 1
start with 92
nocache;

select sequence_name, increment_by, last_number
from user_sequences
where sequence_name in ('MEMBER_ID_SEQ', 'TITLE_ID_SEQ');

--- 문제4
-- a

alter session set nls_date_format='DD-MON-YYYY';
alter session set nls_language='AMERICAN';


insert into title 
values ( title_id_seq.nextval, 'Willie and Christmas Too', 
	'All of Willie''s friends make a Christmas list for Santa, but Willie has yet to 
    add his own wish list.', 'G', 'CHILD', '05-OCT-1995');


insert into title 
values (title_id_seq.nextval, 'Alien Again', 
'Yet another installation of science fiction history. Can the heroine save the planet from 
the alien life form?', 'R', 'SCIFI', '19-MAY-1995');


insert into title
values (title_id_seq.nextval, 'The Glob', 'A meteor crashes near a small American town 
and unleashes carnivorous goo in this classic.', 'NR', 'SCIFI', '12-AUG-1995');


insert into title
values (title_id_seq.nextval, 'My Day Off', 'With a little luck and a lot of ingenuity, 
a teenager skips school for a day in New York.', 'PG', 'COMEDY', '12-JUL-1995');


insert into title values (title_id_seq.nextval, 'Miracles on Ice', 
'A six-year-old has doubts about Santa Claus, but she discovers that miracles
really do exist.', 'PG', 'DRAMA', '12-SEP-1995');


insert into title
values (title_id_seq.nextval, 'Soda Gang', 'After discovering a cache of drugs,
a young couple find themselves pitted against a vicious gang.',
'NR', 'ACTION', '01-JUN-1995');

-- b


insert into member
values(member_id_seq.nextval, 'Velasquez', 'Carmen', '283 King Street', 'Seattle', 
'206-899-6666', '08-MAR-1990');


insert into member
values(member_id_seq.nextval, 'Ngao', 'LaDoris', '5 Modrany', 'Bratislava', 
'586-355-8882', '08-MAR-1990');


insert into member
values(member_id_seq.nextval, 'Nagayama', 'Midori', '68 Via Centrale', 'Sao Paolo',
'254-852-5764', '17-JUN-1991');


insert into member
values(member_id_seq.nextval, 'Quick-to-See', 'Mark', '6921 King Way', 'Lagos',
'63-559-7777', '07-APR-1990');


insert into member
values(member_id_seq.nextval, 'Ropeburn', 'Audry', '86 Chu Street', 'Hong Kong', 
'41-559-87', '18-JAN-1991');


insert into member
values(member_id_seq.nextval, 'Urguhart', 'Molly', '3035 Laurier', 'Quebec', 
'418-542-9988', '18-JAN-1991');
 

-- c
-- 'AVAILABLE', 'DESTROYED', 'RENTED', 'RESERVED'

insert into title_copy
values(1, 92, 'AVAILABLE');

insert into title_copy
values(1, 93, 'AVAILABLE');

insert into title_copy
values(2, 93, 'RENTED');

insert into title_copy
values(1, 94, 'AVAILABLE');

insert into title_copy
values(1, 95, 'AVAILABLE');

insert into title_copy
values(2, 95, 'AVAILABLE');

insert into title_copy
values(3, 95, 'RENTED');

insert into title_copy
values(1, 96, 'AVAILABLE');

insert into title_copy
values(1, 97, 'AVAILABLE');



-- d

insert into rental
values(sysdate-3, 101, 1, sysdate-2, sysdate-1, 92);

insert into rental
values(sysdate-1, 101, 2, null, sysdate+1, 93);

insert into rental
values(sysdate-2, 102, 3, null, sysdate, 95);

insert into rental
values(sysdate-4, 106, 1, sysdate-2, sysdate-2, 97);


--- 문제 5번

SELECT * FROM TITLE;

drop view title_avail;

create view title_avail
as select t.title, c.copy_id, c.status, r.exp_ret_date
from title t, title_copy c, rental r
where t.title_id = c.title_id
and c.title_id = r.title_id(+)
and c.copy_id = r.copy_id(+);

select * from title_avail order by title, copy_id;

--- 6번
insert into title
values (title_id_seq.nextval, 'Interstellar Wals', 'Futuristic interstellar action movie. 
Can the rebels save the humans from the evil empire?', 
'PG', 'SCIFI', '07-JUL-1977');

insert into title_copy
values (1, 98, 'AVAILABLE');
insert into title_copy
values (2, 98, 'AVAILABLE');

insert into rental
values (sysdate, 101, 1, null, sysdate+2, 98);

update rental
set member_id =104,
act_ret_date = null,
exp_ret_date = sysdate+2
where title_id = 97
and copy_id = 1;

select * from rental;

insert into reservation
values(sysdate, 101, 98);

insert into reservation
values(sysdate, 104, 97);

select * from reservation;



delete from rental
where member_id=101
and act_ret_date is not null;

update title_copy
set status = 'RENTED'
where title_id = 98
and copy_id = 1;

select * from title_avail order by title, copy_id;


---- 7번

alter table title
add (price number(8,2));

desc title;

update title
set price = 25
where title_id = 92;
update title
set price = 29
where title_id = 98;
update title
set price = 30
where title_id = 96;
update title
set price = 35
where title_id in (93,94,95,97);

alter table title
add constraint title_title_nn check(title is not null);

alter table title
add constraint title_price_nn check(price is not null);

select constraint_name, search_condition, constraint_type, table_name
from user_constraints
where table_name = 'TITLE';



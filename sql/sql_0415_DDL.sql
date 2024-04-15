-- DDL (데이터 정의어)
-- create, alter, drop, truncate

/*문자형 데이터타입
  char 고정길이 255 자   -주로사용
  varchar 가변길이 65535   -대부분사용,소설책6권 정도
  tinytext 255
  text 65535
  mediumtext 16,777,215
  longtext 4,294,967,295
  json 1기가(GB) */

/*숫자형 데이터타입
 	tinyint 1byte
 	smallint 2byte
 	mediumint 3byte
 	int 4byte     -주로사용
 	bigint 8byte  -주로사용
 	
 	flat 4byte (소수점 아래 7자리)
 	double 8byte (소수점 아래 15자리)
 	decimal(전체자리수,소수점자릿수) */

/*
날짜 시간형 데이터타입
date YYYY-MM-DD
time HH:MI:SS
datetime YYYY-MM-DD HH:MI:SS
timestamp YYYY-MM-DD HH:MI:SS 
*/

/*
이진형(binary)데이터 타입 : 이미ㅣ지, 오디오, 비디오 등의 자료를 불러올수 있다. - 권장방식은 아니다.서버의 주소만 저장하는게 더 나은 방식일수 있다.
tinyblob 255byte
blob 65535byte  (binary large objecyt)
medium blob 16,777,215 byte
longblob 4,294,967,295 byte
*/



-- create 데이터베이스 생성
create database project1
	char set utf8mb4 collate utf8mb4_general_ci;

use project1;

-- 테이블 생성
create table 학과
(학과번호 char(2), -- 컬럼과 데이더베이스관에는 스페이스 한번 띄어주면된다.
학과명 varchar (20),
학과장명 varchar(20))

-- 데이터만들기
insert into 학과
values('AA', '컴퓨터공학과', '배경민'),
	('BB', '소프트웨어학과', '김남준'),
	('CC', '디자인융학학과', '박선영');
/*insert into 학과
values('AA', 'compuer', 'steve'),
	('BB', 'software', 'tom'),
	('CC', 'design', 'michael');*/

create table 학생
(학번 char(5),
이름 varchar(20),
생일 date,
연락처 varchar(20),
학과번호 char(2));

insert into 학생
values 
('S0001', '이', '2020-01-30','010333444', 'AA'),
('S0002', '김', '2021-02-23',null, 'AA'),
('S0003', '박', '2018-03-31', '01077778888' , 'DD');


-- alter 테이블명이나 컬럼명, 데이터타입을 변경하거나 컬럼 추가, 삭제  / alter :바꾸다 라는 의미
-- 컬럼추가
alter table 학생 add 성별 char(1);



-- 컬럼 데이터타입 변경
alter table 학생 modify column 성별 varchar(2);

-- 컬럼명 변경
alter table 학생 change column 연락처 핸드폰전화번호 varchar(20); -- 연락처를 핸드폰전화번호를 컬럼명을 변경 띄어쓰기를 인식못해서 따로 인줄안다. 띄어쓰기 해주고 싶음 _ 해주어야한다.

-- 컬럼삭제
alter table 학생 drop column 성별;

-- 테이블명 변경
alter table 학생 rename 재학생;



-- 3. dorp 데이터베이스 또는 테이블 삭제
create database temp;
drop database temp;

create table 휴학생
(학번 char(5),
이름 varchar(20),
생일 date,
연락처 varchar(20),
학과번호 char(2));

drop table 휴학생;


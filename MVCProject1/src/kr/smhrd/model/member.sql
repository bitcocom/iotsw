-- 회원 table --
create table member(
 num int primary key auto_increment, -- auto_increment(자동증가컬럼)
 id varchar(20) not null,
 pass varchar(20) not null,
 name varchar(30) not null,
 age int not null,
 email varchar(50) not null,
 phone varchar(50) not null,
 unique key(id)
);
insert into member(id, pass, name, age, email, phone)
values('admin','admin','관리자',38, 'bit@naver.com', '010-1111-1111');

select * from member;

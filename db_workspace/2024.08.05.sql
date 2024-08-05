-- 그룹함수

-- 소수점 잘래냄 
select deptno,sum(sal), trunc(avg(sal)) from emp group by deptno; 
-- 급여의 최대갑 , 최소값 
select deptno, max(sal), min(sal) from emp group by deptno;

-- 부서별로 전체 사원의 수와 커미션을 받는 사원의 수를 카운터 해라 
-- count : 행의 개수를 세는 함수 

-- 사원테이블에서 커미션을 받는 사원
select count(comm) from emp ;

-- 부서번호가 30번인 사원원중에서 커미션을 받는 사원 수 
select count(comm) from emp where deptno = 30;
-- 사원 테이블에서 직업의 종류 
select count(distinct job) from emp ; 
select count(*) from emp; --행 모두 출력 

--부서별 전체 인원중 커미션을 받는 사원 
select deptno, count(*), count(comm) from emp group by deptno;
-- 부서별 평균 연봉이 2000이상인 부서만 출력 // 소수점 제거 
select deptno, trunc(avg(sal)) from emp group by deptno having avg(sal) >= 2000; 
/*
TDL 
-- 테이블 구조를 변경하는 DDL로 테이블 생성, 변경, 삭제
- create table, alter table, drop table, renam, truncate

## creat table

- creat table 테이블명 ( 컬럼 자료형 컬럼의 크기,

컬럼 자료형 컬럼의 크
- creat table 테이블명(컬럼 자료형 컬럼의 크기,
                              컬럼 자료형 컬럼의 크리,
                              컬럼 자료형 컬럼의 크리,
);
자료형 
char(size)	고정길이 문자 데이터, varchar2와 동일한 형태의 자료를 저장
                 입력된 길이와는 상관없이 정해진 길이만큼 저장함.
                 최소 크기 1byte, 최대 크기는 2000byte
varchar2	    2000byte 가변길이 문자데이터, 실제로 입력된 문자열의 길이만큼 크기를 지정함. 최소크기 1byte, 최대크기 4000byte ★
number	    숫자형 데이터 최대 40자리까지 저장하며, 소수점의 부호는 포함하지 않는다. 
number(n)	    n자리까지의 최대자수를 의미함. 유효범위 : 38자리
number(n,d)	n은 전체 길이를 의미, d는 소수점 이하 자리수를 의미
data	        날짜를 저장하는 데이터형식
long	         가변길 문자 데이터를 저장. 최대크기 2gbyte
lob	    바이너리, 음악, 영화 
rowid   	db에 저장되어 있지 않으며 데이터도 아님 ( 행번호?)

*/

select *from emp;
desc emp;
/*
### 자료형 규칙

- 테이블명과 컬럼명을 지정하기 위한 규칙
1. 반드시 문자로 시작해야함
.2 1 ~ 30자까지 가능 
3. **`A ~ Z 까지 대소문자`** 
4. **`0 ~ 9까지의 숫자`** 
5. **`특수문자_ $ #`** 
6. **`예약어 사용불가`** 
7. **`공백 허용X`**
*/

-- 컬럼명 : 사원번호 사원명 급여로만 구성된 새로운 테이블을 생성하시오 

create table emp01(
empno number(10),
ename varchar2(10),
sal number(7, 2) 
);
select *from tab; -- tab = table 
desc emp01; -- 테이블 구조를 보는 명령어 
select * from emp;

-- 테이블 삭제 
drop table emp01;

-- 테이블 복사 
create table emp01
as select * from emp; --모든 데이터 복사 
select *from emp01;

select *from tab; 
PURGE table emp01; -- 휴지통 비우기

/*
    alter tavle : 테이블의 구조 변경 
                    컬럼 추가, 컬럼삭제, 자료형변경 , 자료형 크기 변경  
                            
*/
------------------------
alter table emp01
add(job varchar2(9));

alter table emp01
modify(job varchar2(30));

alter table emp01
drop column job;

desc emp01;
drop table emp01 purge; -- purge 쓰면 휴지통에 저장하지 않고 바로 지움 
select *from tab;

-- 휴지통에 있는애들 지우기 
PURGE RECYCLEBIN;

-- 복원 
FLASHBACK table emp01 to BEFORE drop;

-- emp01 생성 후 
-- 테이블 이름 변경하는 명령어 rename to 
rename emp01 to emp02;

/*
# DML

- 데이터 조작어
- 테이블에 내용을 추가, 수정, 삭제
- insert into, update(추가), delete from(삭제),

-- 컬럼에 데이터 추가
insert into 테이블명 ( 컬럼1, 컬럼2) values(값1,값2);
(값과 컬럼은 1:1임)

-- 모든 컬럼에 데이터 추가 
insert into 테이블명 values(값1,값2);

*/-- 테이블과 요소를 추가한것 
create table dept01(
deptno number(2),
dname varchar2(14),
location varchar2(13)
);
select * from dept01;


insert into dept01(deptno, dname, location) values(10, 'ACCOUNTING', 'NEW YORK');
insert into dept01 values (null, 'RESEARCH',' ');
insert into dept01 (deptno,dname) values (10,'ACCOUNTING');

/*
테이블의 내용을 수정 
update 테이블명 
set 컬럼명 1 = 값1, 컬럼명2 = 값2 where 조건 

update문은 기존의 행 데이터를 수정하는 것 
어떤 데이터를 수정하는지 where절을 이용하여 조건을 지정함 
where 절을 생략시에는 모든 행 데이터가 수정됨 

*/
create table dept01(
deptno number(2),
dname varchar2(14),
location varchar2(13)
);


select * from tab; -- 테이블 확인 
-- emp 테이블에 있는 자료를 emp01로 복사 
create table emp01
as select *from emp;
select *from emp01;

-- 모든 부서번호 30번으로바꿈
update emp01 set deptno = 30;
rollback;

-- 모든 사원의 급여를 10% 인상 
update emp01 set sal = sal*1.1;
rollback;
-- 모든 사원의 입사일을 오늘로 수정하시오 
select *from emp01; 

update emp01 set hiredate = sysdate;
-- 같음 update emp01 set hiredate = ('2024/08/05');

--급여가 3천이상인 사원만 급여를 10% 인상하시오 
update emp01 set sal = sal*1.1 where sal >=3000;

--emp01 테이블에서 입사일이 87년에 입사한 사원의 입사일을 오늘 수정 
select *from emp01; 
update emp01 set hiredate = sysdate where substr(hiredate,1,2)='87'; 

-- 사원의 이름이 scott의 부서번호를 10번, 직급을 매니저로 
select *from emp01; 
update emp01 set deptno =10, job = 'MANAGER' where ename = 'SCOTT';


--사원의 이름이 scott의 입사일을 오늘날짜로, 급여를 50, 커미션을 4000으로 변경 
update emp01 set hiredate = sysdate, sal = 50, comm =4000 where ename= 'SCOTT';
ROLLBACK; 

/*
불필요한 데이터를 삭제하기 위한 delete문 
delete from 테이블 명 where 조건;
*/

select * from tab;
select * from dept01;
-- 모든 데이터삭제 
delete from dept01; 
rollback;
-- 조건 데이터 삭제 
delete from dept01 where deptno= 10;

/*
다음 명세서를 참조하여 employee 테이블 생성하시오 
- 사원번호 숫자 4자리, 
사원 이름 문자 10자리, 
직급 문자 9자리, 
상관 숫자 4자리 
입사일 날짜
급여 숫자 (7,2)
커미션 숫자 (7,2)
부서번호 숫자(2)

위의 테이블을 새엉 후 데이터를 다음과 같이 추가하시오.
7369 smith cleak        7836 24/02/23   800        20 
7499 allen salseman   7369 25/07/15   650  300  30
7839 king  president                         2000  
*/

create table employee ( 
    empno number(4),
    ename varchar(10),
    job varchar(14),
    mgr number(4),
    hiredate date,
    sal number(7,2),
    comm number(7,2),
    deptno number(2)
    );
select *from employee;
 
insert into employee (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (7369, 'SMITH','CLEAK', 7836, '24/02/23',800, null, 20);
--조건이 없어서 바로 value로 가능 
--insert into employee values (7369, 'SMITH','CLEAK', 7836, '24/02/23',800, ' ', 20);

insert into employee (empno,  ename, job, mgr, hiredate, sal, comm, deptno)
values (7499, 'ALLEN','SALSEMAN', 7369, '24/07/15',650, 300, 30);
--insert into employee values (7499, 'ALLEN','SALSEMAN', 7369, '24/07/15',650, 300, 30);
--delete from employee where deptno = 30;

insert into employee (empno,  ename, job, mgr, hiredate, sal, comm, deptno)
values (7839, 'KING','PRESIDENT', null, null,2000, null, null);
--insert into employee values (7839, 'KING','PRESIDENT', null, null,2000, null, null);

/*
## 무결성 제약조건

- 무결성 : 데이터베이스 내에 데이터의 확장성을 유지하는 것을 의마한다.
- 바람직하지 못한 데이터가 저장되는 것을 방지

NOT NULL	NULL 값을 허용하지 않는다. 
UNIQUE 	중복된 값을 허용하지 않는다.
PRIMARY KEY ★★	NOT NULL과 UNIQUE 제약조건을 결합한 제약조건 개체 무결성 조건
FOREIGN KEY ★★	참조되는 테이블의 컬럼의 값이 존재하면 허용함 
CHECK	저장가능한 데이터 값의 범위나 조건을 지정하여 설정 한 값만 허용 
*/

select *from tab;

desc emp01;
drop table emp02;


create table emp01 (
empno number(4),
ename varchar2(10),
job varchar2(9),
deptno number(4)
);

desc emp01;
insert into emp01 values (NULL, NULL,'SALESEMAN',30);
select * from emp01;
-- 일단 널값은 존재하지만 들어가지 않으면 조회가 안됨

--사원번호, 사원명, 직급, 부서번호로 새로운 테이블 구성하되, 
-- 사원번호와 사원명은 null값을 허용하지 않음 
create table emp02 (
empno number(4) not null,
ename varchar2(10) not null,
job varchar2(9) not null,
deptno number(4) not null
);
desc emp02;

--insert into emp02 values(NULL, NULL, 'SALESMAN',30); -- NULL 값이 나와서 에러!
insert into emp02 values(7499, 'allen', 'SALESMAN',30); 
insert into emp02 values(7499, 'pkname', 'manager',30); 

select * from emp02;


-- 중복을 허용하지 않는다 - unique
create table emp03 (
empno number(4) UNIQUE,
ename varchar2(10) not null,
job varchar2(9) ,
deptno number(4) not null
);

insert into emp03 values(7499, 'allen', 'SALESMAN',30); 
insert into emp03 values(7499, 'pkname', 'manager',30); -- 무결성 제약조건 위배! / 중복 될시 오류!
insert into emp03 values(NULL, 'pkname', 'manager',30); -- 널값은 들어가짐!
-- 널값도 무결성제약도 충족할 키는 PRIMARY KEY 
select * from emp03;

--primary key 
create table emp04 (
empno number(4) PRIMARY KEY,
ename varchar2(10) not null,
job varchar2(9) ,
deptno number(4) not null
);

insert into emp04 values(7499, 'allen', 'SALESMAN',30); 
insert into emp04 values(7499, 'pkname', 'manager',30); 
insert into emp04 values(NULL, 'pkname', 'manager',30); 

select * from emp04;

-- 제약조건 
select constraint_name, constraint_type, table_name from user_constraints
where table_name = 'EMP03';

-- 타입은 4가지가 있음 
select constraint_name, constraint_type, table_name from user_constraints
where table_name = 'EMP03';
/*
## contraint_type

- 제약조건의 4가지 타입

Primary key
foreign key
unique key
check not null

*/
select *from user_cons_columns where table_name ='EMP03';

/*## 참조무결성

- 참조 무결성을 위한 **`FOREIGN KEY 제약조건`**
- 참조 무결성은 두 테이블 사이의 주종관계에서 성립
- 먼저 존재해야하는 테이블( 주 : 부모테이블)
- 이를 참조하는 테이블 ( 종 : 자식 테이블)


*/


select constraint_name, constraint_type, table_name from user_constraints
where table_name ='DEPT';

select * from user_cons_columns where table_name ='DEPT';

desc dept;
--select *from tab;

drop table dept01;

create table dept01(
deptno number(2) primary key,
dname varchar2(14),
loc varchar2(13));

select* from user_cons_columns where table_name = 'DEPT01';
select * from dept01;

insert into dept01 values(10, 'ACCOUNTING','NEW YORK');
insert into dept01 values(20, 'RESEARCH','DALLAS');
insert into dept01 values(30, 'SALES', 'CHICAGO');
insert into dept01 values(40, 'OPERATIONS','BOSTON');

-- 외래키로 테이블을 연결하는 방법 
select * from tab;

create table emp05(
empno number(4) primary key,
ename varchar2(10) not null,
job varchar2(9), 
deptno number(2) references dept01(deptno)); -- dept01이 부모테이블이 됨 // 여기만 참조 

drop table dept01;

select *from emp05;
insert into emp05 values (7499, 'allen','SALESMAN',30);
--보모테이블인dept 01에 40까지 추가되었기 때문에 50은 추가될 수 없음 
insert into emp05 values (7566, 'jones','MANAGER',50); 
select* from user_cons_columns where table_name = 'EMP05';
select constraint_name, constraint_type, table_name from user_constraints
where table_name = 'EMP05';


/*
## check 제약조건
- 입력값을 체크하여 설정된 값 이외의 값이 들어오면 
오류 메시지와 함께 명령이 수행되지 못하게 하는 것을 의미함

-- emp06 사원 테이블에 gender 컬럼을 추가하되 gender 컬럼에는 
    'M','F' 두 값만 저장할 수 있는 check 제약조건을 설정
*/

create table emp06(
empno number(4) primary key,
ename varchar2(10) not null,
gender varchar2(1) check(gender in('M','F'))
);

--insert into emp06 values (7566, 'jones','G'); -- G 일경우 체크 위약조건위반
insert into emp06 values (7566, 'jones','F'); 

/*
### 제약조건 명 지정하기

- 사용자가 의미있게 제약 조건명을 명시하여 제약 조건명만으로도 어떤 제약 조건을 위배 했는지 알 수 있게 지정하는 방법.

### 제약조건 명시법

- 컬럼명, 데이터 타입, 제약조건 제약조건 이름, 제약조건 타입

### 제약조건 규칙

- **테이블명_ 컬럼명_제약조건유형**
- **emp06_EMPNO_PK**
*/

create table emp07(
empno number(4) constraint EMP07_EMPNO_PK primary key,
ename varchar2(9) constraint EMP07_ENMAE_NN not null,
job varchar2(9) constraint EMP07_JOB_UK unique,
deptno number(4) constraint EMP07_DEPTNO_FK REFERENCEs DEPT01(DEPTNO)
);

insert into emp07 values (7499, 'allen','salesman',30);
insert into emp07 values (7450, 'allen','MANAGER',50);

SELECT constraint_name, constraint_type, table_name, r_constraint_name 
FROM user_constraints 
WHERE table_name = 'EMP07';

select* from user_cons_columns where table_name ='EMP07';


/*
제약조건변경 
테이블생성이 끝난 후에 제약조건을 추가하기
위해서는 alter table로 추가하면 됨 

alter table 테이블명
add 제약조건 제약조건명 제약조건유형(칼럼이름) 

*/

select *from tab;
-- emp01, dept01 
-- emp01 테이블의 empno 컬럼에 기본키를 설정하고 deptno컬럼에
-- 외래키를 설정 

alter table emp01
add primary key(empno);

delete from emp01;
-- alter 이용해서 제약조건변경한 것 
alter table emp01
add foreign key(deptno) references dept01(deptno);

select *from emp01;

-- 제약 조건 제거 
alter table emp07
drop constraint emp07_deptno_fk;

/*
cascade
- 제약조건 비활성화

 disable constraint
- 제약조건 일시적으로 비 활성화

 disable constraint
- 비 활성화된 제약조건을 재 활성화

*/

select * from tab;
drop table dapt01; 

SELECT constraint_name, constraint_type, table_name, r_constraint_name 
FROM user_constraints 
WHERE table_name = 'EMP02';



create table dept02(
deptno number(2) constraint dept02_deptno_pk primary key,
dname varchar2(14),
loc varchar2(14)
);
insert into dept02 values(10,'ACCOUNTING','NEW YORK');
insert into dept02 values(20,'RESEARCH','DALLAS');
select * from dept02;

drop table emp02;

create table emp02(
empno number(4)constraint emp_2_empno_pk primary key,
ename varchar2(10) constraint emp02_name_NN not null,
job varchar2(9),
deptno number (4) constraint emp02_dept_fk references dept02(deptno)
);

select * from emp02;
insert into emp02 values(7499,'allen', 'salesman',10);
insert into emp02 values(7369,'smith', 'clerk',20);

delete from dept02 where deptno =10; -- 참조하는게 있기 때문에 삭제가 안됨

rollback;

-- 비활성화 
alter table emp02
disable constraint emp02_dept_fk;


-- 재 활성화 
alter table emp02
enable constraint emp02_dept_fk;
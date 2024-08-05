-- �׷��Լ�

-- �Ҽ��� �߷��� 
select deptno,sum(sal), trunc(avg(sal)) from emp group by deptno; 
-- �޿��� �ִ방 , �ּҰ� 
select deptno, max(sal), min(sal) from emp group by deptno;

-- �μ����� ��ü ����� ���� Ŀ�̼��� �޴� ����� ���� ī���� �ض� 
-- count : ���� ������ ���� �Լ� 

-- ������̺��� Ŀ�̼��� �޴� ���
select count(comm) from emp ;

-- �μ���ȣ�� 30���� ������߿��� Ŀ�̼��� �޴� ��� �� 
select count(comm) from emp where deptno = 30;
-- ��� ���̺��� ������ ���� 
select count(distinct job) from emp ; 
select count(*) from emp; --�� ��� ��� 

--�μ��� ��ü �ο��� Ŀ�̼��� �޴� ��� 
select deptno, count(*), count(comm) from emp group by deptno;
-- �μ��� ��� ������ 2000�̻��� �μ��� ��� // �Ҽ��� ���� 
select deptno, trunc(avg(sal)) from emp group by deptno having avg(sal) >= 2000; 
/*
TDL 
-- ���̺� ������ �����ϴ� DDL�� ���̺� ����, ����, ����
- create table, alter table, drop table, renam, truncate

## creat table

- creat table ���̺�� ( �÷� �ڷ��� �÷��� ũ��,

�÷� �ڷ��� �÷��� ũ
- creat table ���̺��(�÷� �ڷ��� �÷��� ũ��,
                              �÷� �ڷ��� �÷��� ũ��,
                              �÷� �ڷ��� �÷��� ũ��,
);
�ڷ��� 
char(size)	�������� ���� ������, varchar2�� ������ ������ �ڷḦ ����
                 �Էµ� ���̿ʹ� ������� ������ ���̸�ŭ ������.
                 �ּ� ũ�� 1byte, �ִ� ũ��� 2000byte
varchar2	    2000byte �������� ���ڵ�����, ������ �Էµ� ���ڿ��� ���̸�ŭ ũ�⸦ ������. �ּ�ũ�� 1byte, �ִ�ũ�� 4000byte ��
number	    ������ ������ �ִ� 40�ڸ����� �����ϸ�, �Ҽ����� ��ȣ�� �������� �ʴ´�. 
number(n)	    n�ڸ������� �ִ��ڼ��� �ǹ���. ��ȿ���� : 38�ڸ�
number(n,d)	n�� ��ü ���̸� �ǹ�, d�� �Ҽ��� ���� �ڸ����� �ǹ�
data	        ��¥�� �����ϴ� ����������
long	         ������ ���� �����͸� ����. �ִ�ũ�� 2gbyte
lob	    ���̳ʸ�, ����, ��ȭ 
rowid   	db�� ����Ǿ� ���� ������ �����͵� �ƴ� ( ���ȣ?)

*/

select *from emp;
desc emp;
/*
### �ڷ��� ��Ģ

- ���̺��� �÷����� �����ϱ� ���� ��Ģ
1. �ݵ�� ���ڷ� �����ؾ���
.2 1 ~ 30�ڱ��� ���� 
3. **`A ~ Z ���� ��ҹ���`** 
4. **`0 ~ 9������ ����`** 
5. **`Ư������_ $ #`** 
6. **`����� ���Ұ�`** 
7. **`���� ���X`**
*/

-- �÷��� : �����ȣ ����� �޿��θ� ������ ���ο� ���̺��� �����Ͻÿ� 

create table emp01(
empno number(10),
ename varchar2(10),
sal number(7, 2) 
);
select *from tab; -- tab = table 
desc emp01; -- ���̺� ������ ���� ��ɾ� 
select * from emp;

-- ���̺� ���� 
drop table emp01;

-- ���̺� ���� 
create table emp01
as select * from emp; --��� ������ ���� 
select *from emp01;

select *from tab; 
PURGE table emp01; -- ������ ����

/*
    alter tavle : ���̺��� ���� ���� 
                    �÷� �߰�, �÷�����, �ڷ������� , �ڷ��� ũ�� ����  
                            
*/
------------------------
alter table emp01
add(job varchar2(9));

alter table emp01
modify(job varchar2(30));

alter table emp01
drop column job;

desc emp01;
drop table emp01 purge; -- purge ���� �����뿡 �������� �ʰ� �ٷ� ���� 
select *from tab;

-- �����뿡 �ִ¾ֵ� ����� 
PURGE RECYCLEBIN;

-- ���� 
FLASHBACK table emp01 to BEFORE drop;

-- emp01 ���� �� 
-- ���̺� �̸� �����ϴ� ��ɾ� rename to 
rename emp01 to emp02;

/*
# DML

- ������ ���۾�
- ���̺� ������ �߰�, ����, ����
- insert into, update(�߰�), delete from(����),

-- �÷��� ������ �߰�
insert into ���̺�� ( �÷�1, �÷�2) values(��1,��2);
(���� �÷��� 1:1��)

-- ��� �÷��� ������ �߰� 
insert into ���̺�� values(��1,��2);

*/-- ���̺�� ��Ҹ� �߰��Ѱ� 
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
���̺��� ������ ���� 
update ���̺�� 
set �÷��� 1 = ��1, �÷���2 = ��2 where ���� 

update���� ������ �� �����͸� �����ϴ� �� 
� �����͸� �����ϴ��� where���� �̿��Ͽ� ������ ������ 
where ���� �����ÿ��� ��� �� �����Ͱ� ������ 

*/
create table dept01(
deptno number(2),
dname varchar2(14),
location varchar2(13)
);


select * from tab; -- ���̺� Ȯ�� 
-- emp ���̺� �ִ� �ڷḦ emp01�� ���� 
create table emp01
as select *from emp;
select *from emp01;

-- ��� �μ���ȣ 30�����ιٲ�
update emp01 set deptno = 30;
rollback;

-- ��� ����� �޿��� 10% �λ� 
update emp01 set sal = sal*1.1;
rollback;
-- ��� ����� �Ի����� ���÷� �����Ͻÿ� 
select *from emp01; 

update emp01 set hiredate = sysdate;
-- ���� update emp01 set hiredate = ('2024/08/05');

--�޿��� 3õ�̻��� ����� �޿��� 10% �λ��Ͻÿ� 
update emp01 set sal = sal*1.1 where sal >=3000;

--emp01 ���̺��� �Ի����� 87�⿡ �Ի��� ����� �Ի����� ���� ���� 
select *from emp01; 
update emp01 set hiredate = sysdate where substr(hiredate,1,2)='87'; 

-- ����� �̸��� scott�� �μ���ȣ�� 10��, ������ �Ŵ����� 
select *from emp01; 
update emp01 set deptno =10, job = 'MANAGER' where ename = 'SCOTT';


--����� �̸��� scott�� �Ի����� ���ó�¥��, �޿��� 50, Ŀ�̼��� 4000���� ���� 
update emp01 set hiredate = sysdate, sal = 50, comm =4000 where ename= 'SCOTT';
ROLLBACK; 

/*
���ʿ��� �����͸� �����ϱ� ���� delete�� 
delete from ���̺� �� where ����;
*/

select * from tab;
select * from dept01;
-- ��� �����ͻ��� 
delete from dept01; 
rollback;
-- ���� ������ ���� 
delete from dept01 where deptno= 10;

/*
���� ������ �����Ͽ� employee ���̺� �����Ͻÿ� 
- �����ȣ ���� 4�ڸ�, 
��� �̸� ���� 10�ڸ�, 
���� ���� 9�ڸ�, 
��� ���� 4�ڸ� 
�Ի��� ��¥
�޿� ���� (7,2)
Ŀ�̼� ���� (7,2)
�μ���ȣ ����(2)

���� ���̺��� ���� �� �����͸� ������ ���� �߰��Ͻÿ�.
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
--������ ��� �ٷ� value�� ���� 
--insert into employee values (7369, 'SMITH','CLEAK', 7836, '24/02/23',800, ' ', 20);

insert into employee (empno,  ename, job, mgr, hiredate, sal, comm, deptno)
values (7499, 'ALLEN','SALSEMAN', 7369, '24/07/15',650, 300, 30);
--insert into employee values (7499, 'ALLEN','SALSEMAN', 7369, '24/07/15',650, 300, 30);
--delete from employee where deptno = 30;

insert into employee (empno,  ename, job, mgr, hiredate, sal, comm, deptno)
values (7839, 'KING','PRESIDENT', null, null,2000, null, null);
--insert into employee values (7839, 'KING','PRESIDENT', null, null,2000, null, null);

/*
## ���Ἲ ��������

- ���Ἲ : �����ͺ��̽� ���� �������� Ȯ�强�� �����ϴ� ���� �Ǹ��Ѵ�.
- �ٶ������� ���� �����Ͱ� ����Ǵ� ���� ����

NOT NULL	NULL ���� ������� �ʴ´�. 
UNIQUE 	�ߺ��� ���� ������� �ʴ´�.
PRIMARY KEY �ڡ�	NOT NULL�� UNIQUE ���������� ������ �������� ��ü ���Ἲ ����
FOREIGN KEY �ڡ�	�����Ǵ� ���̺��� �÷��� ���� �����ϸ� ����� 
CHECK	���尡���� ������ ���� ������ ������ �����Ͽ� ���� �� ���� ��� 
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
-- �ϴ� �ΰ��� ���������� ���� ������ ��ȸ�� �ȵ�

--�����ȣ, �����, ����, �μ���ȣ�� ���ο� ���̺� �����ϵ�, 
-- �����ȣ�� ������� null���� ������� ���� 
create table emp02 (
empno number(4) not null,
ename varchar2(10) not null,
job varchar2(9) not null,
deptno number(4) not null
);
desc emp02;

--insert into emp02 values(NULL, NULL, 'SALESMAN',30); -- NULL ���� ���ͼ� ����!
insert into emp02 values(7499, 'allen', 'SALESMAN',30); 
insert into emp02 values(7499, 'pkname', 'manager',30); 

select * from emp02;


-- �ߺ��� ������� �ʴ´� - unique
create table emp03 (
empno number(4) UNIQUE,
ename varchar2(10) not null,
job varchar2(9) ,
deptno number(4) not null
);

insert into emp03 values(7499, 'allen', 'SALESMAN',30); 
insert into emp03 values(7499, 'pkname', 'manager',30); -- ���Ἲ �������� ����! / �ߺ� �ɽ� ����!
insert into emp03 values(NULL, 'pkname', 'manager',30); -- �ΰ��� ����!
-- �ΰ��� ���Ἲ���൵ ������ Ű�� PRIMARY KEY 
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

-- �������� 
select constraint_name, constraint_type, table_name from user_constraints
where table_name = 'EMP03';

-- Ÿ���� 4������ ���� 
select constraint_name, constraint_type, table_name from user_constraints
where table_name = 'EMP03';
/*
## contraint_type

- ���������� 4���� Ÿ��

Primary key
foreign key
unique key
check not null

*/
select *from user_cons_columns where table_name ='EMP03';

/*## �������Ἲ

- ���� ���Ἲ�� ���� **`FOREIGN KEY ��������`**
- ���� ���Ἲ�� �� ���̺� ������ �������迡�� ����
- ���� �����ؾ��ϴ� ���̺�( �� : �θ����̺�)
- �̸� �����ϴ� ���̺� ( �� : �ڽ� ���̺�)


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

-- �ܷ�Ű�� ���̺��� �����ϴ� ��� 
select * from tab;

create table emp05(
empno number(4) primary key,
ename varchar2(10) not null,
job varchar2(9), 
deptno number(2) references dept01(deptno)); -- dept01�� �θ����̺��� �� // ���⸸ ���� 

drop table dept01;

select *from emp05;
insert into emp05 values (7499, 'allen','SALESMAN',30);
--�������̺���dept 01�� 40���� �߰��Ǿ��� ������ 50�� �߰��� �� ���� 
insert into emp05 values (7566, 'jones','MANAGER',50); 
select* from user_cons_columns where table_name = 'EMP05';
select constraint_name, constraint_type, table_name from user_constraints
where table_name = 'EMP05';


/*
## check ��������
- �Է°��� üũ�Ͽ� ������ �� �̿��� ���� ������ 
���� �޽����� �Բ� ����� ������� ���ϰ� �ϴ� ���� �ǹ���

-- emp06 ��� ���̺� gender �÷��� �߰��ϵ� gender �÷����� 
    'M','F' �� ���� ������ �� �ִ� check ���������� ����
*/

create table emp06(
empno number(4) primary key,
ename varchar2(10) not null,
gender varchar2(1) check(gender in('M','F'))
);

--insert into emp06 values (7566, 'jones','G'); -- G �ϰ�� üũ ������������
insert into emp06 values (7566, 'jones','F'); 

/*
### �������� �� �����ϱ�

- ����ڰ� �ǹ��ְ� ���� ���Ǹ��� ����Ͽ� ���� ���Ǹ����ε� � ���� ������ ���� �ߴ��� �� �� �ְ� �����ϴ� ���.

### �������� ��ù�

- �÷���, ������ Ÿ��, �������� �������� �̸�, �������� Ÿ��

### �������� ��Ģ

- **���̺��_ �÷���_������������**
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
�������Ǻ��� 
���̺������ ���� �Ŀ� ���������� �߰��ϱ�
���ؼ��� alter table�� �߰��ϸ� �� 

alter table ���̺��
add �������� �������Ǹ� ������������(Į���̸�) 

*/

select *from tab;
-- emp01, dept01 
-- emp01 ���̺��� empno �÷��� �⺻Ű�� �����ϰ� deptno�÷���
-- �ܷ�Ű�� ���� 

alter table emp01
add primary key(empno);

delete from emp01;
-- alter �̿��ؼ� �������Ǻ����� �� 
alter table emp01
add foreign key(deptno) references dept01(deptno);

select *from emp01;

-- ���� ���� ���� 
alter table emp07
drop constraint emp07_deptno_fk;

/*
cascade
- �������� ��Ȱ��ȭ

 disable constraint
- �������� �Ͻ������� �� Ȱ��ȭ

 disable constraint
- �� Ȱ��ȭ�� ���������� �� Ȱ��ȭ

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

delete from dept02 where deptno =10; -- �����ϴ°� �ֱ� ������ ������ �ȵ�

rollback;

-- ��Ȱ��ȭ 
alter table emp02
disable constraint emp02_dept_fk;


-- �� Ȱ��ȭ 
alter table emp02
enable constraint emp02_dept_fk;
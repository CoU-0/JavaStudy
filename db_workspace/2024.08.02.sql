/* 
select - �����˻� ��ɾ�� ���Ǻο��Ͽ� Ư���ุ ��ȸ 
    ���� 
    select - ��ȸ�ϴ� ��ɹ�
    * - ��� ���� 
    from - ���̺�� ��� 
select * from emp; 
    = ����Ʈ ���̺� emp������ ��� ����ض� 

*/
-- ����Ŭ �����ͺ��̽��� ���̺��� ��� ������ ����ض� ����ǹ� 
select * from tab;
-- �μ���ȣ�� 10�� �Ǵ� 20���� �μ��� ������ ����ض� 
desc dept; -- �������� 
select *from dept where deptno=10 or deptno=20 ;

show user ;

-- ���̺��� Ư���� �÷��� ��ȸ�Ҷ� 
-- select ������ �÷����� ����ϸ� �� 

select deptno, dname from dept;

--������̺��� �̸�, �޿�, �Ի��ϸ� ����Ͻÿ� 

select ename, sal, hiredate from emp;
select * from emp;


/*
�ķ��� ����� �� �ٷ� �ڿ� as ��� Ű���� �� �� ��Ī�� ����Ѵ� 
��Ī���� ���鹮��, $, _, # ���� ǥ���ϰ� �빮�ڸ� �����Ͽ� ����� 
as�� ����ϰ� �Ǵ� ��������("")�� ����ص� ��Ī ��� ���� 
*/
-- as Ȱ���ϴ� ��� 
select ename as ����̸�, sal as �޿�, hiredate as �Ի��� from emp;
-- "" �������͸� ����ϴ� ���
select ename "����̸�", sal "�޿�", hiredate "�Ի���" from emp;
-- Ư������ ��� ���� - > ���鹮��, $, _, # 
select deptno "$$$$" from dept;

select * from emp;

select DISTINCT job from emp;

/*

= > < >= <= <>(!=, ^=)

*/
-- �޿��� 3000�̻� �޴� ����� ����ϵ�, �����ȣ ����̸�, �޿��� ����Ͻÿ� 
-- where�� �����͸� �����Ҷ� ������ �ο��ϴ� ��ɾ��. 
select empno, ename, sal from emp where sal >= 3000;
select empno, ename, sal from emp where sal < 3000;

select * from emp where deptno = 10;

-- �޿��� 2000�̸� ���� ����� ��ȣ, �̸�, �޿��� ����Ͻÿ� 
select empno, ename, sal from emp where sal < 2000;

-- �޿��� 1250�� �޴� ����� ��ȣ, �̸�, �޿��� ���� ����Ͻÿ� 
select empno, ename, sal from emp where sal <> 1250;
select empno, ename, sal from emp where sal  != 1250;
select empno, ename, sal from emp where sal ^= 1250;

/*
���ڵ����� ��ȸ
 - ���� �����ʹ� �ݵ�� ���� ����ǥ(�̱����� ) �ȿ� ǥ���Ѵ� ��ҹ��� ����

*/
-- ����� �̸��� FORD�� ����� �����ȣ�� ����Ͻÿ� 

select empno from emp where ename ='FORD' ;
select empno from emp where ename ='SCOTT' ;

-- �̸��� SCOTT �� ����� ������ ����ض� 
select empno, ename, job from emp where ename='SCOTT';

-- �̸��� SCOTT �� ����� ��� ������ ����ض�
select * from emp where ename='MILLER';

/*
��¥ ������ ��ȸ
- �ݵ�� �̱� ���� �ȿ� ǥ���ؾ��Ѵ� 
- ���� : �� / �� / �� -> YY / MM /DD
*/
-- 1985�� ���Ŀ� �Ի��� ����� �̸��� �Ի����� ���
select ename, hiredate from emp where hiredate >= '1985/01/01';

/*
and ������ 
-���� ������ ��� ������ ��� ����ϴ� ������
*/
-- �μ���ȣ�� 10���̰� ������ MANAGER�� ����� �̸�, �����ȣ, ������ ����ض� 
select empno, ename, job from emp;
select empno, ename, job from emp where deptno= 10 and job = 'MANAGER' ;

-- �޿��� 1000���� 3000���̿� �ִ� ��� ����� ������ ����ض�

select *from emp where sal >=1000 and sal<=3000;

/*
or ������ 
- �ΰ��� ���� �߿� �ϳ��� �����ϴ��� �˻��� ���� 

*/
--   �μ���ȣ�� 10���̰ų� ������ MANAGER�� ����� �̸�, �����ȣ, ������ ����ض� 

select empno, ename, job, deptno from emp where deptno =10  or job ='MANAGER';

-- �����ȣ�� 7844 �̰ų� 7654�̰ų� 7521�� ����� ��� ������ ����ض� 
select * from emp where empno =7844 or empno = 7654 or empno = 7521;

-- not : �����Ǵ� �� ������ 
-- �μ���ȣ�� 10���� �ƴ� ��� ���� 
select * from emp where not deptno= 10;  

select * from emp where not job = 'MANAGER';  

/*


*/
-- �޿��� 100���� 3000���� �޴� ��� ��� ���
select *from emp where sal BETWEEN 1000 and 3000;
--�޿��� 1500�� 2500 ������ ����� ��ȣ, �̸� �޿��� ����Ͻÿ�,
--��, and �����ڿ� BETWEEN AND �����ڸ� Ȱ�� �Ͻÿ� 
select ename, empno, sal from emp where sal BETWEEN 1500 and 2500;
select ename, empno, sal from emp where sal >=1500 and sal <=2500;

-- in ������ 
-- ������ �÷��� �������� ���� �ϳ������� �˾ƺ����� �Ҷ� ����ϴ� ������

-- �����ȣ�� 7844 �̰ų� 7654�̰ų� 7521�� ����� ��� ������ ����ض� 
select * from emp where empno = 7844 or empno = 7654 or empno = 7521;
select * from emp where empno in(7844, 7654, 7521);

-- Ŀ�̼��� 300 �̰ų� 500 �̰ų� 1400�� �� �ϳ��� ����� �̸�, �޿�, Ŀ�̼��� ����ض� 

select ename, sal, comm from emp where comm in (300, 500, 1400);
select  ename, sal, comm from emp where comm = 300 or comm =500 or comm= 1400;


/*
  ������

- �˻��ϰ��� �ϴ� ���� ��Ȯ�� �� ��� ���ϵ� ī��� �Բ� ����Ͽ� ���ϴ� ������ �˻��ϴ� ������
- **Ư�� ���ϰ� ��ġ�ϴ� ���ڿ��� ã�� �� ����**
- ���� : �÷��̸� like ����

���ϵ� ī��

- %  : ���ڰ� ���ų� �ϳ� �̻��� ���ڰ� � ������ �𸦰��  � ���� ���� ������� ��� ���
    - 0 ~ n ���� ���ڿ��� ��ü��
- _  : �ϳ��� ���ڰ� � ���� ������ �������
    - ��, �� ������ ���ڿ��� ��ü��

*/
-- ����̸��� k�� �����ϴ� ����� �����ȣ, ����̸� ������ ����ض� 

select empno, ename from emp where ename like 'K%';

-- ��� �̸��� k�� �����ϴ� ����� �����ȣ ����̸� ���� ��� 
select empno, ename from emp where ename like '%K%';

-- ��� �̸��� k�� ������ ����� �̸� �����ȣ ����̸� ���� ��� 
select empno, ename from emp where ename like '%K';

/*
_ : �� ���ڸ� ����ؼ� ����ϴ� �� 
    �̸��� 2��° ���ڰ� A�� ����� �˻��Ͽ� ����ض�  

*/

select * from emp where ename like '_A%';


-- ����̸��� k�� �������� �ʴ� ����� �����ȣ, ����̸� ������ ����ض� 
select empno, ename from emp where ename not like '%K%';

/*
NULL ������
- ����Ŭ������ �÷��� **NULL���� ����Ǵ� ���� ���**��.
NULL
- ��Ȯ��, �� �� ���� ��, 0��, ������� �ƴ�  ��� ���� ���������� �˾Ƴ� �� ���� ���� �ǹ��Ѵ�.

is NULL �� is not NULL
- is NULL : ���� NULL�� ��� ����
- in not NULL : ���� NULL�� �ƴϸ� ����
*/

select * from emp;
--mrg : ���(���) /   ���ӻ���� ���� ����� �̸��� ����� ����� ����ض� 
select ename, mgr, empno from emp where mgr is null;

/*
## ORDER BY��

- ORDER BY ���� �ο�(��)�� �����ϴµ� ����ϸ� ������ �� �ڿ� ����Ѵ�.
- ������ ������ �÷�(��) �Ǵ� SELECT������ ��õ� ��Ī(as ����)�� ��밡���ϴ�.

*/
-- ��� ��ȣ�� �������� �������� ���� �Ͻÿ�

-- ����Ʈ�� ��������.
select empno, ename from emp;
select empno, ename from emp order by empno asc; -- �������� 
select empno, ename from emp order by empno desc;

-- �޿��� ���� ����� ������ ��� �̸��� ö���� ������ ���� �������� ��� 

select enpno, ename, sal from emp order by sal desc, ename asc;

-- �Ի����� ���� �ֱ��� ��� ������ ����ϵ�, ���, �̸� �Ի����� ����Ͻÿ�
select empno, ename, hiredate from emp order by hiredate desc;

select 20*2 from dual ; -- ����� ����� ����Ҷ� ������ ���̺� =dual
desc dual;

/*
dual ���̺� 
    ����Ŭ���� 1���� 24�ð��̰� 1�ð��� 60���̸� 1���� 60�ʸ� ����ϸ� 
    �Ϸ簡 �������� ����ϴµ� �̷� ����� �������� ������� ������Ʈ��
    �ٷ� �Է��ϸ� ������ �߻��� 
    why? ������� sql ����� �ƴϱ� ����.
    
*/
select 24*60*60 from dual;
select *from dual;


/*
������ �Լ� 
- �ึ�� �Լ��� ����Ǿ� ����� ��ȯ�ϴ� �Լ� 

�����Լ�	���ڿ��� �ٸ� ���·� ��ȯ�ϴ� �Լ�
�����Լ�	���� ���� �ٸ� ���·� ��ȯ�ϴ� �Լ� 
��¥�Լ�	��¥���� �ٸ� ���·� ��ȯ�ϴ� �Լ� 
��ȯ�Լ�	����, ��¥, ���� ���� ���� �ٸ� �ڷ������� ��ȯ�ؼ� ��Ÿ���� �Լ� 
�Ϲ��Լ� 	��Ÿ�Լ� 



�׷��Լ� 
- �ϳ� �̻��� ������ �׷����� ���� ���� ����� ���� 
SUM	�׷��� ���� �հ踦 ��ȯ�� 
AVG	�׷��� ����� ��ȯ�� 
COUNT	�׷��� �� ���� ��ȯ��
MAX	�׷��� �ִ밪
MIN	�׷��� �ʼҰ� 
SEDDEV	�׷��� ǥ�������� 
VARIANCE	�׷��� �л��� ����� 


�����Լ� 
���ڿ��� �ٸ� ���·� ��ȯ�Ͽ� ��Ÿ�� 
LOWER	�ҹ��� ��ȯ
UPPER 	�빮�� ��ȯ 
INITCAP	ù���ڸ� �빮�ڷ� 
CONCAT	������ ���� ������ �� 
SUBSTR	���ڸ� �߶� ������ 
LENGTH	������ ���� 
INSTR	Ư�� ������ ��ġ
LPAD, RPAD	�Է¹��� ���ڿ��� ��ȣ�� �����Ͽ� Ư�� ������ ���ڿ��� ��ȯ �е��� ���ڷ� ���� / ������ 
TRIM	���� �߶󳻰� ���ڸ� ǥ���� // Ư�� ���ڸ� �Է��ϸ� �յڷ� �߸�
CONVERT	��ȯ
CHAR	�ƽ�Ű �ڵ�� ��ȯ
ASCII	�ƽ�Ű �ڵ带 ���ڷ� ��ȯ
REPLACE	Ư�� ���ڿ� ���� 

*/

select concat ('Data','Base')from dual;
select LPAD(ename, 20, '#')from emp;  -- �е��� ���ڷ� ���� �е� 
select RPAD(ename, 20, '#')from emp; -- ������ �е� 
select ename, trim('A' from ename) from emp;
select initcap(ename) from emp;
select substr('Database',3,4)from dual; 

/*
���� �Լ� 
abs	���밪
cos	cosine �ڻ��� ���� ��ȯ 
exp	e�� n���� ��ȯ
floor	�Ҽ��� �Ʒ��� �߶� ���� 
log	log���� ��ȯ 
power	power(m,n) �������� m^n���� ��ȯ 
sign	sign(n) �� n<0 �̸� -1�� ��ȯ 
                      n=0 �̸� 0�� ��ȯ 
                      n>0 �̸� 1�� ��ȯ 
sin	sin ���� ��ȯ 
tan	tan ���� ��ȯ
round	Ư�� �Ҽ������� �ݿø� 
trunc	Ư�� �Ҽ������� �߶� 
mod	�Է¹��� ���� ���� ������ ���� ���� 
*/


select abs(-15) from dual;
select floor(3.12511) from dual;
select round(123.3213), 
         round(123.3213,0), 
         round(123.3213,2), 
         round(123.3213,-1) from dual;
select mod (34 ,7)from dual;

/*
## ��¥ �Լ�

- ��¥���� �ٸ� ���·� ��ȯ�ϴ� ���� ��Ÿ��
- ��������δ� �Ⱓ�� ������ �Ⱓ�� �ַ� �ϴ����� �������� ���

sysdate	�ý��ۿ� ����� ���� ��¥�� ��ȯ
months_between	�� ��¥ ���̰� �� ���������� ��ȯ
add_months	Ư���� ��¥�� ���� �� 
next_day	Ư���� ��¥���� ���ʷ� �����ϴ� ���ڷ� ���� ������ ��¥�� ��ȯ
last_day	�ش� ���� ������ ��¥�� ��ȯ
round	���ڷ� ���� ��¥�� �������� �ݿø� 
trunc	���ڷ� ���� ��¥�� �������� ���� 

*/
select substr(sysdate, -5,2) from dual;
-- ���� ��¥ 
select sysdate-1 ����, sysdate ����, sysdate+1 ���� from dual; 
select last_day(sysdate) from dual;

-- �μ� ��ȣ�� 10�� ����� ������� �Ի��� ���κ��� ���ñ��� ������ �������� 
--  �ٹ� �ϼ��� ���Ͻÿ� 

select hiredate �Ի���, round(sysdate-hiredate) 
�ٹ��ϼ� from emp where deptno =10;

select sysdate, hiredate �Ի���, round(months_between(sysdate, hiredate)) ������ 
 from emp where deptno =10;

select sysdate, hiredate �Ի���, round(add_months(hiredate,3 ))���������� 
from emp where deptno =10;

/*
next_day
- �ش� ������ ���� ����� ��¥�� ��ȯ
- next_day (date, ����)
*/
-- �Ҷ����� �ʱ�ȭ �ؾ��� 
--alter session set NLS_LANGUAGE=ENGLISH;
alter session set NLS_LANGUAGE=KOREAN;
--alter session set NLS_LANGUAGE=JAPANESE;

--select sysdate, next_day(sysdate, '�����') from dual;
select sysdate, next_day(sysdate, '������') from dual;
--select sysdate, next_day(sysdate, 'wednesday') from dual;

/*
### ��ȯ�Լ�

- ����, ��¥, ���� ���� ���� Ÿ������ ��ȯ�Ͽ� ��Ÿ�� 
  �ڷ����� ��ȯ��Ű���� �Ҷ� �����
  
TO_CHAR	��¥�� Ȥ�� �������� ���������� ��ȯ�ϰ��� �Ҷ�
TO_CHAR(��¥������, ��������ġ�)
YYYY : ���� 4�ڸ�
YY : ���� 2�ڸ�
MM :���� ���ڷ� ǥ��
MON :���� ���ĺ�����
DD : ��¥ �� ǥ��
DAY : ���� ǥ��
D : ���� ���� ǥ��

TO_DATE	�������� ��¥������ ��ȯ�Ҷ�
TO_NUMBER	�������� ���������� �ٲܶ�

*/

select sysdate, to_char(sysdate, 'YYYY/MM/DD DY, HH24:MI:SS') from dual;

select ename, hiredate from emp where hiredate= to_DATE(19810220,'YYYYMMDD');

-- ������ �귶���� 
select sysdate-TO_DATE('2024/01/01','YY/MM/DD')from dual; 
-- �Ҽ��� �����ϰ� �ʹ�.  -trunc 
select trunc (sysdate - TO_DATE('2024/01/01','YY/MM/DD'))from dual; 

select to_number('10,000','999,999') + to_number('20,000','999,999')from dual;


/*
NVL : ù��° ���ڷ� ���� ���� NULL�� ������ �ι�° ���� ������ ���� 
DECODE : ù��° ���ڷ� ���� ���� ���ǿ� ���缭 ���� (if�� ����)
���� : DECODE(ǥ����, ����1, ���1, 
                                ����1, ���, 
                                ����1,���, 
                                �⺻���N)
                                
CASE : ���ǿ� �´� ������ ����(SWITCH �� ����)


*/

select ename, sal, comm, job from emp order by job; -- �������� 
select ename, sal, NVL(comm,0), job from emp order by job; -- null���� 0���� ��ȯ
-- ���� ��� 
select ename, sal, comm, sal*12+NVL(comm,0), job from emp order by job;

/*
 DECODE
���� : DECODE(ǥ����, ����1, ���1, 
                                ����1, ���, 
                                ����1,���, 
                                �⺻���N)
*/

select *from dept;
select deptno from emp;

-- �μ���ȣ�� �ش��ϴ� �μ����� �˾ƺ����� �� ��� 
select deptno, DECODE( deptno, 10, 'ACCOUNTING', 
                         20, 'SEARCHING',
                         30, 'SALES',
                         40, 'OPERATIONS') as �μ��� 
from emp;
/*
case �Լ� 
- ���ǿ� ���� ���� �ٸ� ó���� ����
- ���� : case ǥ����  WHEN ����1 THNE ���1 
                             WHEN ����2 THNE ���2 
                             WHEN ����3 THNE ���3  
                             ELSE ��� N 
end
*/
select deptno, 
case when deptno = 10 then 'ACCOUNTING' 
        when deptno = 20 then 'SEARCHING'
        when deptno=30 then 'SALES'
        when deptno=40 then 'OPERATIONS' 
        else '���ºμ�'
end as �μ���
from emp;
/*
Ex ) ���޿� ���� �޿��� �λ��ϵ����Ѵ�.
      ������ ANALYST �� ����� 5% 
                SALSESMAN �� ����� 10%
                MANAGER �� ����� 15%
                CLERK �� ����� 20% �λ��Ͽ� ��� ��� 
*/

select  job, sal, empno, ename,
case when job ='ANALYST' then sal*1.05
       when job ='SALSESMAN' then sal*1.10
        when job =' MANAGER' then sal*1.15
         when job =' CLERK' then sal*1.20
    else sal
    end as �λ�޿�
from emp;



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
desc dept; 
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
.




/* 
select - 정보검색 명령어로 조건부여하여 특정행만 조회 
    형식 
    select - 조회하는 명령문
    * - 모든 열을 
    from - 테이블명 명시 
select * from emp; 
    = 셀렉트 테이블에 emp정보를 모두 출력해라 

*/
-- 오라클 데이터베이스의 테이블의 모든 내용을 출력해라 라는의미 
select * from tab;
-- 부서번호가 10번 또는 20번인 부서의 정보를 출력해라 
desc dept; 
select *from dept where deptno=10 or deptno=20 ;

show user ;

-- 테이블에서 특정한 컬럼만 조회할때 
-- select 다음에 컬럼명을 명시하면 됨 

select deptno, dname from dept;

--사원테이블에서 이름, 급여, 입사일만 출력하시오 

select ename, sal, hiredate from emp;
select * from emp;


/*
컴럼을 기술한 후 바로 뒤에 as 라는 키워드 쓴 후 별칭을 기술한다 
별칭에는 공백문자, $, _, # 등을 표현하고 대문자를 구별하여 사용함 
as를 사용하고 또는 더블쿼터("")를 사용해도 별칭 사용 가능 
*/
-- as 활용하는 방법 
select ename as 사원이름, sal as 급여, hiredate as 입사일 from emp;
-- "" 더블쿼터를 사용하는 방법
select ename "사원이름", sal "급여", hiredate "입사일" from emp;
-- 특수문자 사용 가능 - > 공백문자, $, _, # 
select deptno "$$$$" from dept;

select * from emp;

select DISTINCT job from emp;
.




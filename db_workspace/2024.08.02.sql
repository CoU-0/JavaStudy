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
desc dept; -- 오름차순 
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

/*

= > < >= <= <>(!=, ^=)

*/
-- 급여가 3000이상 받는 사원을 출력하되, 사원번호 사원이름, 급여를 출력하시오 
-- where절 데이터를 선택할때 조건을 부여하는 명령어다. 
select empno, ename, sal from emp where sal >= 3000;
select empno, ename, sal from emp where sal < 3000;

select * from emp where deptno = 10;

-- 급여가 2000미만 받은 사원을 번호, 이름, 급여를 출력하시오 
select empno, ename, sal from emp where sal < 2000;

-- 급여가 1250을 받는 사원을 번호, 이름, 급여를 빼고 출력하시오 
select empno, ename, sal from emp where sal <> 1250;
select empno, ename, sal from emp where sal  != 1250;
select empno, ename, sal from emp where sal ^= 1250;

/*
문자데이터 조회
 - 문자 데이터는 반드시 단일 따옴표(싱글쿼터 ) 안에 표시한다 대소문자 구분

*/
-- 사원의 이름이 FORD인 사원의 사원번호를 출력하시오 

select empno from emp where ename ='FORD' ;
select empno from emp where ename ='SCOTT' ;

-- 이름이 SCOTT 인 사원의 정보를 출력해라 
select empno, ename, job from emp where ename='SCOTT';

-- 이름이 SCOTT 인 사원의 모든 정보를 출력해라
select * from emp where ename='MILLER';

/*
날짜 데이터 조회
- 반드시 싱글 쿼터 안에 표시해야한다 
- 형식 : 연 / 월 / 일 -> YY / MM /DD
*/
-- 1985년 이후에 입사한 사원의 이름과 입사일을 출력
select ename, hiredate from emp where hiredate >= '1985/01/01';

/*
and 연산자 
-여러 조건을 모두 만족할 경우 사용하는 연산자
*/
-- 부서번호가 10번이고 직급이 MANAGER인 사원을 이름, 사원번호, 직급을 출력해라 
select empno, ename, job from emp;
select empno, ename, job from emp where deptno= 10 and job = 'MANAGER' ;

-- 급여가 1000에서 3000사이에 있는 모든 사원의 정보를 출력해라

select *from emp where sal >=1000 and sal<=3000;

/*
or 연산자 
- 두가지 조건 중에 하나만 만족하더라도 검색이 가능 

*/
--   부서번호가 10번이거나 직급이 MANAGER인 사원을 이름, 사원번호, 직급을 출력해라 

select empno, ename, job, deptno from emp where deptno =10  or job ='MANAGER';

-- 사원번호가 7844 이거나 7654이거나 7521인 사원의 모든 정보를 출력해라 
select * from emp where empno =7844 or empno = 7654 or empno = 7521;

-- not : 부정되는 논리 연산자 
-- 부서번호가 10번이 아닌 모든 정보 
select * from emp where not deptno= 10;  

select * from emp where not job = 'MANAGER';  

/*


*/
-- 급여가 100에서 3000사이 받는 모든 사원 출력
select *from emp where sal BETWEEN 1000 and 3000;
--급여가 1500과 2500 사이인 사원의 번호, 이름 급여를 출력하시오,
--단, and 연산자와 BETWEEN AND 연산자를 활용 하시오 
select ename, empno, sal from emp where sal BETWEEN 1500 and 2500;
select ename, empno, sal from emp where sal >=1500 and sal <=2500;

-- in 연산자 
-- 동일한 컬럼이 여러개의 값중 하나인지를 알아보려고 할때 사용하는 연산자

-- 사원번호가 7844 이거나 7654이거나 7521인 사원의 모든 정보를 출력해라 
select * from emp where empno = 7844 or empno = 7654 or empno = 7521;
select * from emp where empno in(7844, 7654, 7521);

-- 커미션이 300 이거나 500 이거나 1400인 중 하나인 사원을 이름, 급여, 커미션을 출력해라 

select ename, sal, comm from emp where comm in (300, 500, 1400);
select  ename, sal, comm from emp where comm = 300 or comm =500 or comm= 1400;


/*
  연산자

- 검색하고자 하는 값에 정확히 모를 경우 와일드 카드와 함께 사용하여 원하는 내용을 검색하는 연산자
- **특정 패턴과 일치하는 문자열을 찾을 때 유용**
- 형식 : 컬럼이름 like 패턴

와일드 카드

- %  : 문자가 없거나 하나 이상의 문자가 어떤 값인지 모를경우  어떤 값이 오든 상관없을 경우 사용
    - 0 ~ n 개의 문자열을 대체함
- _  : 하나의 문자가 어떤 값이 오든지 상관없음
    - 단, 한 글자의 문자열을 대체함

*/
-- 사원이름이 k로 시작하는 사원의 사원번호, 사원이름 정보를 출력해라 

select empno, ename from emp where ename like 'K%';

-- 사원 이름이 k를 포함하는 사원의 사워번호 사원이름 정보 출력 
select empno, ename from emp where ename like '%K%';

-- 사원 이름이 k로 끝나는 사원의 이름 사워번호 사원이름 정보 출력 
select empno, ename from emp where ename like '%K';

/*
_ : 한 문자를 대신해서 사용하는 것 
    이름의 2번째 글자가 A인 사원을 검색하여 출력해라  

*/

select * from emp where ename like '_A%';


-- 사원이름이 k를 포함하지 않는 사원의 사원번호, 사원이름 정보를 출력해라 
select empno, ename from emp where ename not like '%K%';

/*
NULL 연산자
- 오라클에서는 컬럼에 **NULL값이 저장되는 것을 허용**함.
NULL
- 미확정, 알 수 없는 값, 0도, 빈공간도 아닌  어떠한 값이 존재하지만 알아낼 수 없는 것을 의미한다.

is NULL 과 is not NULL
- is NULL : 값이 NULL일 경우 만족
- in not NULL : 값이 NULL이 아니면 만족
*/

select * from emp;
--mrg : 상관(상사) /   직속상관이 없는 사원의 이름과 상관의 사번을 출력해라 
select ename, mgr, empno from emp where mgr is null;

/*
## ORDER BY절

- ORDER BY 절은 로우(행)을 정렬하는데 사용하며 쿼리문 맨 뒤에 기술한다.
- 정렬이 기준은 컬럼(열) 또는 SELECT절에서 명시된 별칭(as “”)도 사용가능하다.

*/
-- 사원 번호를 기준으로 오름차순 정렬 하시오

-- 디폴트가 오름차순.
select empno, ename from emp;
select empno, ename from emp order by empno asc; -- 생략가능 
select empno, ename from emp order by empno desc;

-- 급여가 같은 사람이 존재할 경우 이름의 철자의 순서가 빠른 기준으로 출력 

select enpno, ename, sal from emp order by sal desc, ename asc;

-- 입사일이 가장 최근인 사원 순으로 출력하되, 사번, 이름 입사일을 출력하시오
select empno, ename, hiredate from emp order by hiredate desc;

select 20*2 from dual ; -- 산술식 계산을 출력할때 가상의 테이블 =dual
desc dual;

/*
dual 테이블 
    오라클에서 1일이 24시간이고 1시간은 60분이며 1분은 60초를 계산하면 
    하루가 몇초인지 계산하는데 이런 결과를 얻으려면 산술식을 프롬프트에
    바로 입력하면 오류가 발생함 
    why? 산술식은 sql 명령이 아니기 때문.
    
*/
select 24*60*60 from dual;
select *from dual;


/*
단일행 함수 
- 행마다 함수가 적용되어 결과를 반환하는 함수 

문자함수	문자열을 다른 형태로 변환하는 함수
숫자함수	숫자 값을 다른 형태로 변환하는 함수 
날짜함수	날짜값을 다른 형태로 변환하는 함수 
변환함수	문자, 날짜, 숫자 값을 서로 다른 자료형으로 변환해서 나타내는 함수 
일반함수 	기타함수 



그룹함수 
- 하나 이상의 행으로 그룹으로 묶어 연산 결과를 리턴 
SUM	그룹의 누적 합계를 변환함 
AVG	그룹의 평균을 반환함 
COUNT	그룹의 총 개수 반환함
MAX	그룹의 최대값
MIN	그룹의 초소값 
SEDDEV	그룹의 표준편차값 
VARIANCE	그룹의 분산을 계산함 


문자함수 
문자열을 다른 형태로 변환하여 나타냄 
LOWER	소문자 변환
UPPER 	대문자 변환 
INITCAP	첫글자만 대문자로 
CONCAT	문자의 값을 연결할 때 
SUBSTR	문자를 잘라서 추출함 
LENGTH	문자의 길이 
INSTR	특정 문자의 위치
LPAD, RPAD	입력받은 문자열과 기호를 정렬하여 특정 길이의 문자열로 반환 패딩의 약자로 왼쪽 / 오른쪽 
TRIM	공백 잘라내고 문자만 표시함 // 특정 문자를 입력하면 앞뒤로 잘림
CONVERT	변환
CHAR	아스키 코드로 변환
ASCII	아스키 코드를 문자로 변환
REPLACE	특정 문자열 변경 

*/

select concat ('Data','Base')from dual;
select LPAD(ename, 20, '#')from emp;  -- 패딩의 약자로 왼쪽 패딩 
select RPAD(ename, 20, '#')from emp; -- 오른쪽 패딩 
select ename, trim('A' from ename) from emp;
select initcap(ename) from emp;
select substr('Database',3,4)from dual; 

/*
숫자 함수 
abs	절대값
cos	cosine 코사인 값을 반환 
exp	e의 n승의 반환
floor	소수점 아래를 잘라 버림 
log	log값을 반환 
power	power(m,n) 형식으로 m^n으로 반환 
sign	sign(n) → n<0 이면 -1일 반환 
                      n=0 이면 0을 반환 
                      n>0 이면 1을 반환 
sin	sin 값을 반환 
tan	tan 값을 반환
round	특정 소수점에서 반올림 
trunc	특정 소수점에서 잘라냄 
mod	입력받은 수를 나눈 나머지 값을 구함 
*/


select abs(-15) from dual;
select floor(3.12511) from dual;
select round(123.3213), 
         round(123.3213,0), 
         round(123.3213,2), 
         round(123.3213,-1) from dual;
select mod (34 ,7)from dual;

/*
## 날짜 함수

- 날짜값을 다른 형태로 변환하는 것을 나타냄
- 결과값으로는 기간을 얻으며 기간은 주로 일단위와 월단위로 계산

sysdate	시스템에 저장된 현재 날짜를 반환
months_between	두 날짜 사이가 몇 개월인지를 반환
add_months	특정한 날짜에 개월 수 
next_day	특정한 날짜에서 최초로 도래하는 인자로 받은 요일의 날짜로 변환
last_day	해당 월의 마지막 날짜를 변환
round	인자로 받은 날짜를 기준으로 반올림 
trunc	인자로 받은 날짜를 기준으로 버림 

*/
select substr(sysdate, -5,2) from dual;
-- 어제 날짜 
select sysdate-1 어제, sysdate 오늘, sysdate+1 내일 from dual; 
select last_day(sysdate) from dual;

-- 부서 번호가 10인 사원을 대상으로 입사한 날로부터 오늘까지 몇일이 지났는지 
--  근무 일수를 구하시오 

select hiredate 입사일, round(sysdate-hiredate) 
근무일수 from emp where deptno =10;

select sysdate, hiredate 입사일, round(months_between(sysdate, hiredate)) 개월수 
 from emp where deptno =10;

select sysdate, hiredate 입사일, round(add_months(hiredate,3 ))증가개월수 
from emp where deptno =10;

/*
next_day
- 해당 요일의 가장 가까운 날짜를 변환
- next_day (date, 요일)
*/
-- 할때마다 초기화 해야함 
--alter session set NLS_LANGUAGE=ENGLISH;
alter session set NLS_LANGUAGE=KOREAN;
--alter session set NLS_LANGUAGE=JAPANESE;

--select sysdate, next_day(sysdate, '水曜日') from dual;
select sysdate, next_day(sysdate, '수요일') from dual;
--select sysdate, next_day(sysdate, 'wednesday') from dual;

/*
### 변환함수

- 문자, 날짜, 숫자 값을 서로 타입으로 변환하여 나타냄 
  자료형을 변환시키고자 할때 사용함
  
TO_CHAR	날짜형 혹은 숫자형을 문자형으로 변환하고자 할때
TO_CHAR(날짜데이터, ‘출력형식’)
YYYY : 연도 4자리
YY : 연도 2자리
MM :월을 숫자로 표기
MON :월을 알파벳으로
DD : 날짜 일 표시
DAY : 요일 표시
D : 요일 약어로 표시

TO_DATE	문자형을 날짜형으로 변환할때
TO_NUMBER	문자형을 숫자형으로 바꿀때

*/

select sysdate, to_char(sysdate, 'YYYY/MM/DD DY, HH24:MI:SS') from dual;

select ename, hiredate from emp where hiredate= to_DATE(19810220,'YYYYMMDD');

-- 몇일이 흘렀는지 
select sysdate-TO_DATE('2024/01/01','YY/MM/DD')from dual; 
-- 소수점 제거하고 싶다.  -trunc 
select trunc (sysdate - TO_DATE('2024/01/01','YY/MM/DD'))from dual; 

select to_number('10,000','999,999') + to_number('20,000','999,999')from dual;


/*
NVL : 첫번째 인자로 받은 값이 NULL과 같으면 두번째 인자 값으로 변경 
DECODE : 첫번째 인자로 받은 값을 조건에 맞춰서 변경 (if와 유사)
형식 : DECODE(표현식, 조건1, 결과1, 
                                조건1, 결과, 
                                조건1,결과, 
                                기본결과N)
                                
CASE : 조건에 맞는 문장을 수행(SWITCH 와 유사)


*/

select ename, sal, comm, job from emp order by job; -- 오름차순 
select ename, sal, NVL(comm,0), job from emp order by job; -- null값을 0으로 변환
-- 연봉 계산 
select ename, sal, comm, sal*12+NVL(comm,0), job from emp order by job;

/*
 DECODE
형식 : DECODE(표현식, 조건1, 결과1, 
                                조건1, 결과, 
                                조건1,결과, 
                                기본결과N)
*/

select *from dept;
select deptno from emp;

-- 부서번호에 해당하는 부서명을 알아보고자 할 경우 
select deptno, DECODE( deptno, 10, 'ACCOUNTING', 
                         20, 'SEARCHING',
                         30, 'SALES',
                         40, 'OPERATIONS') as 부서명 
from emp;
/*
case 함수 
- 조건에 따라 서로 다른 처리가 가능
- 형식 : case 표현식  WHEN 조건1 THNE 결과1 
                             WHEN 조건2 THNE 결과2 
                             WHEN 조건3 THNE 결과3  
                             ELSE 결과 N 
end
*/
select deptno, 
case when deptno = 10 then 'ACCOUNTING' 
        when deptno = 20 then 'SEARCHING'
        when deptno=30 then 'SALES'
        when deptno=40 then 'OPERATIONS' 
        else '없는부서'
end as 부서명
from emp;
/*
Ex ) 직급에 따라 급여를 인상하도록한다.
      직급이 ANALYST 인 사원은 5% 
                SALSESMAN 인 사원은 10%
                MANAGER 인 사원은 15%
                CLERK 인 사원은 20% 인상하여 결과 출력 
*/

select  job, sal, empno, ename,
case when job ='ANALYST' then sal*1.05
       when job ='SALSESMAN' then sal*1.10
        when job =' MANAGER' then sal*1.15
         when job =' CLERK' then sal*1.20
    else sal
    end as 인상급여
from emp;



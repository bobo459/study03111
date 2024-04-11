-- join이란,  두개 이상의 테이블을 연력하여 데이터를 검색하는 방법 (빈칸을 null과 같이 인식을 안해줌)
/*
<join의 종류>  - from 바로 뒤에 써준다.
cross join
inner join
outer join
self join
*/

-- cross join(크로스 조인) : 한쪽 테이블의 각 행마다 다른 쪽 테이블의 모든 행이 한번씩
-- 매칭되는 조인을 의미  /무조건 합쳐서 보여줌, 무식함
select 부서.부서번호, 
	부서명,
	이름,
	사원.부서번호
from 부서
cross join 사원
where 이름 = '배재용';

select 부서.부서번호, 
	부서명,
	이름,
	사원.부서번호
from 부서,사원
where 이름 = '배재용';

-- inner join(내부 조인) : 각 테이블에서 조인 조건에 일치하는 데이터만 조인
-- '이소미'사원의 전화번호, 직위, 부서번호, 부서명
-- ANSI sql 조인 (아메리칸 네셔널 스탠다드 인스티튜트/미국 국립 표준협회)
select 사원번호, 
	직위,
	부서.부서번호,
	부서명
from 사원
inner join 부서
on 사원.부서번호  = 부서.부서번호 -- 두 테이블 간에 같은걸 조회해서 보여줌.
where 이름 = '이소미';

-- Non-ANSI sql 조인 (위 방법과 결과는 같으나 문법이 다름)
select 사원번호, 
	직위,
	부서.부서번호,
	부서명
from 사원, 부서
where 사원.부서번호  = 부서.부서번호
and 이름 = '이소미';

-- 고객회사들이 주문한 주문건수를 많은 순서대로 보이시오.
-- 컬럼은 고객번호, 담당자명, 고객회사명, 주문건수
select 고객.고객번호, 
	담당자명, 
	고객회사명,
	count(*) as 주문건수
from 고객
inner join 주문
on 고객.고객번호 = 주문.고객번호
group by 고객.고객번호 , 담당자명, 고객회사명
order by count(*) desc ; 

-- 고객별로 주문금액 합을 보이되, 주문금액 합이 많은 순서대로
-- 컬럼은 고객번호, 담당자명, 고객회사명, 주문금액함
select 고객.고객번호, 
	담당자명, 
	고객회사명,
	sum(주문수량*단가) as 주문금액합
from 고객
inner join 주문
on 고객.고객번호 = 주문.고객번호
inner join 주문세부
on 주문.주문번호 = 주문세부.주문번호
group by 고객.고객번호, 담당자명, 고객회사명
order by 4 desc ; 

-- non ANSI 스타일
select 고객.고객번호, 
	담당자명, 
	고객회사명,
	sum(주문수량*단가) as 주문금액합
from 고객, 주문 ,주문세부
where 고객.고객번호 = 주문.고객번호
and 주문.주문번호 = 주문세부.주문번호
group by 고객.고객번호, 담당자명, 고객회사명
order by 4 desc ; 

-- 할인율을 반영하려면 아래 수식 사용!!
-- sum(truncate (주문수량*단가-(주문수량*단가*할인율),1)) as 주문금액합

-- <문 제>
-- 모든 사원의 사원번호, 이름, 부서명 표시
select 사원번호, 
	이름, 
	부서.부서명
from 사원
inner join 부서
on 부서.부서번호 = 사원.부서번호;


-- 주문번호 'H0255' 의 제품명과 주문수량, 단가 표시
select 주문번호,제품명, 주문수량, 주문세부.단가
from 주문세부 
inner join 제품 
on 주문세부.제품번호 = 제품.제품번호 -- 그 테이블에 하나밖에 없는지 확인이 되어야 가능하다. 유니크한 정보
where 주문번호  ='H0255'

-- 테이블이름이 길거나 많은 곳에 사용될 경우, 별명을 사용하는 것이 좋다
select o.주문번호,p.제품명, o.주문수량, o.단가
from 주문세부 o  -- 별명을 o를 지어줌
inner join 제품 p 
on o.제품번호 = p.제품번호 
where o.주문번호  ='H0255'


-- Non-Equi Join : = (등호)연산자가 아닌 부등호 비교연산자를 이용한 조인 (많이 사용됨!)
-- '이은광' 이 담당자인 고객회사의 마일리지 등급을 표시
select 고객번호, 
	고객회사명,
	담당자명,
	마일리지,
	등급명
from 고객
inner join 마일리지등급 -- 고객하고 마일리지등급과 조인해야한다.고객 테이블에 마일리지등급테이블의 등급을 붙여주겠다.
on 마일리지 >= 하한마일리지 and 마일리지 <= 상한마일리지;
where 담당자명 = '이은광';












-- 상관 서브쿼리(Corelated SubQuery) -'니가 뭔 상관이야??' 할때의 상관쿼리이다.
/* main쿼리 와 서브쿼리 간의 상관관계를 포함하는 형태의 쿼리.
상관서브쿼리는 메인쿼리와ㅏ 한 행씩 실행하며 처리함 
그렇기때문에 실행속도가 늦어질 가능성이 있음 (소곤..)기왕이면 안쓰는게 낫다. 대신 구조가 간편하고 직관적으로 사용은 가능)*/

-- 사원의 정보와 상사의 정보를 함께 표현
-- self join을 서브쿼리로 표현
select 사원번호,
	이름,
	상사번호,
	(select 이름 from 사원 as 상사 -- from 테이블 뒤에 붙어서 상사라는 테이블을 만듬
		where 상사.사원번호 = 사원.상사번호) as 상사이름 -- 사원.상사번호는 바깥에 있는 밑에 있는 from 사원; 에서 정보를 가져오는것
from 사원;
	
-- 특정 주문일 범위안에서 각 주문번호당 총 판매금액
select 주문번호, 주문일,
	(select sum (주문세부.주문수량 * 주문세부.단가) from 주문세부 -- 판매금액
		where 주문세부.주문번호 = 주문.주문번호 ) as 총판매금액
from 주문
where 주문일 between '2022-01-01' and '2022-12-31';

-- 위의 상관쿼리를 비상관쿼리로 변경하면 (join 사용 예시)
select 주문.주문번호 , 주문일,
 sum(주문세부.주문수량 * 주문세부.단가) as 총판매금액
from 주문
left join  주문세부
on 주문세부.주문번호 = 주문.주문번호 
where 주문일 between '2022-01-01' and '2022-12-31'
group by 주문.주문번호 , 주문.주문일 ;


-- '배재용' 사원의 부서명
-- 비상관쿼리
select 부서명
from 부서
where 부서번호 = (select 부서번호 from 사원
				where 이름 = '배재용');
-- 상관쿼리
select (select 부서명 from 부서
		where 부서.부서번호 = 사원.부서번호) as 부서명
from 사원
where 이름 = '배재용';

-- <연습문제>
-- 담당자명, 고객회사명, 주문건수(count), 최초주문일(min), 최종주문일(max)
-- 서브쿼리 이용
select 담당자명, 
	고객회사명, 
	주문건수, 
	최초주문일, 
	최종주문일
from 고객
inner join (select 고객번호,
			count(*) as 주문건수,
			min(주문일) as 최초주문일,
			max(주문일) as 최종주문일
			from 주문
			group by 고객번호) as 주문요약
on 주문요약.고객번호 =  고객.고객번호 ;
-- inner join 을 생략한 버전
 select 담당자명, 
	고객회사명, 
	주문건수, 
	최초주문일, 
	최종주문일
from 고객, (select 고객번호,
			count(*) as 주문건수,
			min(주문일) as 최초주문일,
			max(주문일) as 최종주문일
			from 주문
			group by 고객번호) as 주문요약
where  주문요약.고객번호 =  고객.고객번호 ;


-- <서브쿼리 연습문제> --
/* 1. 제품테이블에 있는 제품 중 단가가 가장 높은 제품명 */

select 제품명, 단가
from 제품
where 단가 = (select max (단가) from 제품); 

/* 2. 제품 테이블에 있는 제품 중 단가가 가장 높은 제품의 주문수량합 */
select 제품명,
	sum(주문수량) "주문수량",
	제품.단가
from 제품
inner join 주문세부
on 제품.제품번호 = 주문세부.제품번호
where 제품.단가 = (select max (단가) from 제품);
-- 선생님답
select sum(주문수량) 수량합
from 주문세부
where 제품번호 = (select 제품번호 from 제품 
				where 단가 = (select max(단가) from 제품));

/* 3. '아이스크림'제품의 주문수량합 */
select sum(주문수량) '주문수량합'
from 제품		
inner join 주문세부
on 제품.제품번호 = 주문세부.제품번호 
where 제품명 like '%아이스크림%';
-- 선생님답
select sum(주문수량) 주문수량합
from 주문세부
where 제품번호 in (select 제품번호 from 제품
				where 제품명 like '%아이스크림%');

/* 4. '서울특별시'고객들에 대한 주문년도별 주문건수 */

select year (주문일) as 주문년도,
	count(*) as 주문건수
from 주문
where 고객번호 in(select 고객번호 from 고객
				where 도시 = '서울특별시')
group by year (주문일);






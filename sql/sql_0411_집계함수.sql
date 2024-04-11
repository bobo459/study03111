-- count 데이터 열의 갯수를 세는 함수 (null은 제외. 빈칸은 값이 빈칸으로 인식되서 숫자를 셈. )
select count(*),
	count(고객번호),
	count(도시),
	count(지역)
from 고객;

select * from 고객;

-- sum 합계
-- avg 평균
-- min 최소값
-- max 최대값
select sum(마일리지),
	avg(마일리지),
	min(마일리지),
	max(마일리지)
from 고객;

-- group by 그룹별로 묶어주는 명령어 (중요!!)
select 도시, -- 잘못됨. 도시의 조건이 없으면 그냥 가장 위에 있는 지역이 나온다. 서울의 고객의 평균은 마일리지가 이렇다는게 아니다.
	count(*) as 고객수,
	avg(마일리지) as 평균마일리지
from 고객;

select 도시,
	count(*) as 고객수,
	avg(마일리지) as 평균마일리지
from 고객
group by 도시; -- 도시별로 보고 싶으면 밑에 group by 를 써주면 된다.

select 담당자직위,
	도시,
	count(*) as 고객수,
	avg(마일리지) as 평균마일리지
from 고객
group by 담당자직위, 도시
order by 담당자직위, 도시;

-- having  --group by뒤에 쓰는게 having : select에 사용한 내용만 사용가능 / from 뒤에 쓰는게 where : select 쓰여진 것과 상관없이 사용가능
select 도시,
	count(*) as 고객수,
	avg(마일리지) as 평균마일리지
from 고객
group by 도시
having count(*) >= 4; 

select 도시,
	sum(마일리지)
from 고객
where 고객번호 like 'T%' -- where는 select에 지정된 컬럼이외도 사용가능
group by 도시
having sum(마일리지) >1000; -- having 은 select에 지정된 컬럼만 사용

-- with rollup 그룹별 소계와 전체 총계를 표시
select 도시,
	count(*) as 고객수,
	avg(마일리지) as 평균마일리지
from 고객
group by 도시
with rollup; -- 고객수 총계

select 담당자직위,
	도시,
	count(*) as 고객수
from 고객
group by 담당자직위, 도시
with rollup; -- 담당자직위별 소계 + 총계

-- group_concat 컬럼내의 값을 결합해서 표시 (A,B,C..처럼 쉼표를 기준으로 묶어서 보여줌)
select 도시,
	group_concat(고객회사명) as 고객회사명목록
from 고객
group by 도시;



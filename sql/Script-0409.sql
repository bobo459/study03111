use testdb; -- 꼭 처음에 써줘서 열어줘야한다.

-- 산술연산자
select 23+5, 23-5, 23*5, 23/5, 23 div 5,
23 % 5, 23 mod 5; -- div는 정수형나누기, 23/5 와 23 div 5 는 나누기인데 정수냐 실수냐 정도의 차이이다. 23 % 5와 23 mod 5는 별차이가 없다.

-- 비교연산자
select 23>=5, 23<=5, 23>23, 23<23, 23=23,
23!=23 , 23<>23;  -- 특이점은 1과 0으로 표현된다. 1: true , 0: flase?
                  -- != 와 <> 는 같지 않다는 의미

-- 논리연산자(and, or, not)
select * from 고객
where 도시 = '부산광역시' and 마일리지 < 1000;

-- 집합연산자 (Union, Union All) : 합친다는 뜻 합집합, 교집합
-- 1) 첫번째와 두번째 select문의 컬럼 갯수 동일 (갯수만 같으면 나옴.문법적으로 같지 않아도 된다.그래도 내용을 맞추는게 좋긴하겠다.)
-- 2) 컬럼이 다르다면 데이터타입은 같아야함(하나는 문자, 하나는 숫자면 오류)
-- 3) union all은 중복 허용
select 고객번호, 담당자명, 마일리지, 도시
from 고객
where 도시 = '부산광역시'
union all 
select 고객번호, 담당자명, 마일리지, 도시
from 고객
where 마일리지 <1000 order by 마일리지;

-- IS NULL
-- empty value(빈값)와 NULL은 다른 개념이다.
select * from 고객
where 지역 is null; -- null 찾기

select * from 고객
where 지역 ='';  -- empty value 찾기

-- IN 연산자 (or 연산자의 간편버전)
select 고객번호, 담당자명, 담당자직위
from 고객
where 담당자직위 = '영업 과장' or 담당자직위 = '마케팅 과장';

select 고객번호, 담당자명, 담당자직위
from 고객
where 담당자직위 in ( '영업 과장', '마케팅 과장');

-- between and (범위를 표현, ~이상이고 ~이하)
select 담당자명, 마일리지
from 고객
where 마일리지 >= 100000 and 마일리지 <= 200000;

select 담당자명, 마일리지
from 고객
where 마일리지 between 100000 and 200000; -- 시작과 끝값을 포함

-- LIKE 연산자(문자열의 특정 패턴을 필터링) - 무슨글자가 있는지 확인, 일부만 있어도 찾아준다. 
-- 특수문자 %, _ 사용
select * from 고객
where 도시 like '%광역시'; -- % 는 여러개의 문자가 존재할 수 있음을 의미, ~광역시로 끝나야함. '%광역' 하면 ~광역 으로 끝나는 문자만 나온다.

select * from 고객
where 도시 like '%광역%'; -- '광역'이 포함된 문자열

select * from 고객
where 도시 like '부산%'; 

select * from 고객
where 도시 like '%시'; -- '시'로 끝나는 문자열

select * from 고객
where 고객번호 like '_C%'; -- '_' 은 정확히 한 개의 문자를 의미, _앞에 글씨가 있고 두번째 자리가 'C'인 문자열을 의미함

select * from 고객
where 고객번호 like '__C%'; -- 3번째가 'C'인 문자열을 의미함





-- 전화번호 뒷자리가 45로 끝나는 고객
select *from 고객
where 전화번호 like '%45'

-- 전화번호 중 뒤에서 3번째 부터가 45인 고객
select *from 고객
where 전화번호 like '%98_'

-- 전화번호에 45가 들어가는 고객
select *from 고객
where 전화번호 like '%45%'

-- '서울'에 사는 고객중에 마일리지가 15000점 이상 20000점 이하인 고객
select *from 고객
where 도시 like '서울%' and( 마일리지 between 15000 and 20000);

-- '춘천' 또는 '과천'에 사는 고객 중 담당자직위에 '이사'가 들어가는 고객
select *from 고객
where 도시 in('춘천시','과천시') 
and 담당자직위 like '%이사';

-- '광역시' 또는 '특별시'에 살지 않는 고객 중 마일리지가 많은 상위 3명의 고객
select *from 고객
where 도시 not like '%광역시'and 도시 not like '%특별시'
order by 마일리지 desc 
limit 3;

select *from 고객
where not  (도시 like '%광역시' or  도시 like '%특별시')
order by 마일리지 desc 
limit 3;

-- 제품중에서 '주스' 제품에 대한 정보
select *from 제품
where 제품명 like '%주스%';

-- 단가가 5000원 이상 10000원 이하인 '주스' 제품
select *from 제품
where 제품명 like '%주스%'and 단가 between 5000 and 10000;

-- 제품번호가 1,2,3,4,7,11,20 인 제품
select *from 제품
where 제품번호 in (1,2,3,4,7,11,20);

/*재고금액이 높은 상위 10개 제품에 대한 제품번호, 제품명, 단가, 재고, 재고금액(단가*재고)
 */
select 제품번호, 제품명, 단가, 재고, 단가*재고 as 재고금액
from 제품
order by 재고금액 desc
limit 10;

select 제품번호, 제품명, 단가, 재고, 단가*재고 as 재고금액
from 제품
order by 5 desc -- 숫자는 select의 컬럼순서(5=재고금액)
limit 10;










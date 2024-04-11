-- cast  데이터타입을 변경시킴
-- convert : 여기서 권장하지 않아서 쓰지 않음
/*MYSql/ Maria의 데이터타입
 char, signed, unsigned, date, datetime, time, binary
 */
select cast('1' as unsigned),
	cast(2 as char);

-- if(조건식, 참인 경우, 거짓인 경우)
select if (12500*450>500000, '초과달성', '미달성');

-- ifnull(A, B)
-- A가 null 이면 B, A가 null이 아니면 A를 반환 (컴럼의 내용을 체크하는 것)
select ifnull(5,'null'),
	ifnull(null,'값이 없음'),
	ifnull(1/0,null); 

-- nullif(A,B)  -ex)주가 컬럼이 있을때 변환이 있을경우 비교할때 업데이트된 주가 new / old 기존 변화없는 주가
-- A와 B가 동일하면 null을 리턴, 다르면 A를 리턴
/*특정 컬럼을 업데이트했을 경우, 각 데이터별로 업데이트외었는지 여부를 확인하는데 사용.(기존 값과 동일하면 빈칸이고
업데이트  */
select nullif ()

-- case
-- case when 조건 when 실행의 형태로 조건에 따른 실행을 여러개 설정가능
-- 조건의 마지막에 나머지를 의미하는 else 사용(사용하지 않아도 됨)
-- case문의 마지막을 의미하는 end 반드시 사용!!
select case when 12500 * 450 > 500000 then '초과달성'
			when 2500 * 450 > 400000 then '달성'
			else '미달성'
		end;









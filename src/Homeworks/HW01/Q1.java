package Homeworks.HW01;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {   // 이중삼항연산자 이용 문제
        // 변수 num을 유저로부터 입력받아서 양수, 음수, 0 을 구별하는 코드를
        // 작성하시오. 단, if조건문이 아닌 삼항연산자를 사용해야함.
        /* 결과 예시
            입력값이 10이면 "양수" 출력
            입력값이 0이면 "0" 출력
            입력값이 -10이면 "음수" 출력 * */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        String  a = ( num > 0 ) ? "양수" : ( num == 0 ) ?  "0" : "음수";  //양수 일때와 (0일때와 그외일때)
        System.out.println(a);




    }
}
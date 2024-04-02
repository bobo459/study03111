package StudyGroup.Java0401;

import java.util.Scanner;

public class TimeAttack03 {
    /*
사용자에게 1~10까지의 수 중 하나를 입력받는다.
(조건1. 입력받은 값이 1~10의 범위를 넘어간 경우 Error 출력)   <=
사용자가 입력한 값을 userInput으로 받은 뒤    <=
그 수가 짝수인 경우 입력 받은 수 부터 10까지의 숫자를 모두 더한 값을 출력하고,    <=
그 숫자가 홀수인지 짝수 인지 출력라는 코드를 짜시오.    <=
또한 사용자가 입력한 값이 홀 수 인 경우    <=
입력 받은 수부터 10까지의 숫자를 모두 곱한 값을 출력하고,    <=
그 숫자가 홀수인지 짝수 인지 출력라는 코드를 짜시오.    <=

(조건2. 계산 결과값이 20보다 클 경우)
"결과값은 20보다 큰 수 입니다"
작을 경우
"결과값은 20보다 작은 수 입니다."
를 출력하시오.
같을 경우
"결과값은 20입니다."
*/
    public static void main(String[] args) {
/*      int a = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자입력하시오. : ");
        int userInput = sc.nextInt();

 /*       int userInput = 7;*/
        int sum = 0;
        int mul = 1;
        int jump = 0;
        String a;

        if (userInput >= 1 && userInput <= 10) {
            if (userInput % 2 == 0) {
                jump=1;
                for (int i = userInput; i <= 10; i++) {
                    sum = sum + i;
                }
                a = (sum >20) ? "결과값은 20보다 큰 수 입니다" : ( sum < 20 ) ? "결과값은 20보다 작은 수 입니다." : "결과값은 20입니다.";
                System.out.println("숫자를 모두 더한 값 : " + sum);
                System.out.println(a);


            }
            if (userInput % 2 == 1) {
                jump=2;
                for (int j=userInput; j<=10;j++){
                    mul = mul *j;
                }
                System.out.println("숫자를 모두 곱한 값 : " + mul);
                a = (mul >150) ? "결과값은 150보다 큰 수 입니다" : ( mul < 150 ) ? "결과값은 150보다 작은 수 입니다." : "결과값은 150입니다.";
                System.out.println(a);
            }


        } else {
            System.out.println("Error");
        }
        switch (jump){
            case 1 :
                System.out.println("짝수");
                break;
            case 2 :
                System.out.println("홀수");
                break;
        }
    }
}




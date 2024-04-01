package StudyGroup.Java0401;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class TimeAttack02 {
    /*
사용자에게 1~10까지의 수 중 하나를 입력받는다.
(조건1. 입력받은 값이 1~10의 범위를 넘어간 경우 Error 출력)   <=
사용자가 입력한 값을 userInput으로 받은 뒤                  <=
그 수가 짝수인 경우 입력 받은 수 부터 10까지의 숫자를 모두 더한 값을 출력하고,   <=
그 숫자가 홀수인지 짝수 인지 출력라는 코드를 짜시오.   <=
또한 사용자가 입력한 값이 홀 수 인 경우     <=
입력 받은 수부터 10까지의 숫자를 모두 곱한 값을 출력하고,   <=
그 숫자가 홀수인지 짝수 인지 출력라는 코드를 짜시오.   <=

(조건2. 계산 결과값이 20보다 클 경우)
"결과값은 20보다 큰 수 입니다"
작을 경우
"결과값은 20보다 작은 수 입니다."
를 출력하시오.
같을 경우
"결과값은 20입니다."
 */
    //조건이 참일때 출력, 범위를 넘을 때 에러

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Input = sc.nextInt();
        int sum = 0;
        int mul = 1;
        int jump = 0;

        if (Input >= 1 && Input <= 10) {
            if (Input % 2 == 0) {
                jump=1;
                for (int i = Input; i <= 10; i++) {
                    sum = sum+i;
                }
                System.out.println("입력한 값이 짝수일때 뒤에 값을 모두 더한 값: " + sum);
                String three =(sum >150) ? "결과값은 150보다 큰 수 입니다" :  (sum <150) ?
                        "결과값은 150보다 작은 수 입니다." : "결과값은 150입니다.";
                System.out.println(three);


            } else if (Input % 2 == 1) {
                jump=2;
                for (int j= Input; j<=10; j++){
                    mul = mul * j;
                }
                System.out.println("입력한 값이 홀수일때 뒤에 값을 모두 곱한 값: " + mul);
                String three = (mul >150) ? "결과값은 150보다 큰 수 입니다" :  (mul <150) ?
                        "결과값은 150보다 작은 수 입니다." : "결과값은 150입니다.";
                System.out.println(three);
            }
        } else {
            System.out.println("Error");
            
        }
        switch (jump){
            case 1:
                System.out.println("짝수");
                break;
            case 2 :
                System.out.println("홀수");
                break;
        }
    }
}

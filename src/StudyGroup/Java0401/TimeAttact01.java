package StudyGroup.Java0401;

import java.util.Scanner;

public class TimeAttact01 {
    /*
1~100까지의 숫자를 입력받는다
(조건1. 입력받은 값이 1~100의 범위를 넘어간 경우 Error 출력)
사용자가 입력한 숫자를 찾는 코드를 작성하고
그 숫자와 시도 횟수를 출력하시오.
 */
    public static void main(String[] args) {
        //조건을 구하고 참일때 숫자와 시도 횟수를 아니면 에러 출력한다.
        //조건안에 수를 구하는 규칙이 있는 반복문을 작성
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하시오. : ");
        int num = sc.nextInt();

/*        int num = 10;*/
        int count = 0;

        if (num >= 1 && num <= 100){
            for (int i = 1 ; i<=100; i++){
                count++;
                if (num == i){
                    System.out.println(i);
                    break;
                }
            }System.out.println(count);
        }else {
            System.out.println("Error");
        }
    }
}

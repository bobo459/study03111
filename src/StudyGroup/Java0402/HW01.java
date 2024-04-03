package StudyGroup.Java0402;


//사칙연산 계산기 코드를 작성하시오.
//조건 1.) 사용자에게 2개의 숫자를 입력 받는다.   <=
// 사용자가 원하는 사칙연산의 숫자를 입력받는다. ex. 1. 덧셈 2. 뺄셈 3. 곱셈 4.나눗셈 중 원하는 연산의 숫자를 입력하시오.   <=

//조건 2.) 사용자가 원하는 사칙연산을 수행하는 코드를 작성한다.

//조건 3.) 범위를 벗어나는 행동을 할 경우 Error를 출력한다.   <=

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);
        System.out.print("1.숫자를 입력하시오. : ");
        int a=sc.nextInt();

        Scanner sca = new  Scanner(System.in);
        System.out.print("2.숫자를 입력하시오. : ");
        int b =sca.nextInt();


        Scanner num = new  Scanner(System.in);
        System.out.print("원하는 연산의 숫자를 입력하시오. (1. 덧셈 2. 뺄셈 3. 곱셈 4.나눗셈) : ");
        int c =num.nextInt();

        int sum;
        int min;
        int mul;
        int div;

        if (c>=1&& 4>=c){
            switch (c) {
                case 1 :
                    sum = a + b;
                    System.out.println("더한 값 : " + sum);
                    break;
                case 2 :
                    min = a - b;
                    System.out.println("뺀 값 : "+ min);
                    break;
                case 3 :
                    mul = a*b;
                    System.out.println("곱한 값 : "+ mul);
                    break;
                case 4 :
                    div = a/b;
                    System.out.println("나눈 값 : "+ div);
                    break;
            }
        }else {
            System.out.println("Error");
        }
    }
}

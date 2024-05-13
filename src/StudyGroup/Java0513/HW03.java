package StudyGroup.Java0513;

import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        //계산기 구현
        //사용자로부터 두 개의 숫자와 연산자(+, -, *, /)를 입력받아 해당 연산을 수행하는 코드를 작성하시오.
        //조건. 4가지의 연산자가 아닌 경우 다시 입력닫도록 설계하고, 프로그램의 종료는 사용자가 '종료'라고 입력해야지만 가능하도록 코드를 작성
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int min = 0;
        int mul = 0;
        int div = 0;

        for (int i = 0; ; i++) {
            System.out.println("숫자를 입력하세요.");
            int input = sc.nextInt();

            System.out.println("+, -, *, / 중 원하는 연산자를 입력하세요.");
            char input2 = sc.next().charAt(0);

            System.out.println("연산할 숫자를 입력하세요.");
            int input3 = sc.nextInt();

            if (input2 == '+') {
                sum = input + input3;
                System.out.println(input + " + " + input3 + " = " + sum);
                break;
            } else if (input2 == '-') {
                min = input - input3;
                System.out.println(input + " - " + input3 + " = " + min);
                break;
            } else if (input2 == '*') {
                mul = input * input3;
                System.out.println(input + " * " + input3 + " = " + mul);
                break;
            } else if (input2 == '/') {
                div = input / input3;
                System.out.println(input + " ÷ " + input3 + " = " + div);
                break;
            }else {
                System.out.println("Error 다시 입력해주세요. ");
            }

        }
    }
}

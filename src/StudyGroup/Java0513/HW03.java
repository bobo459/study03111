package StudyGroup.Java0513;

import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        //계산기 구현
        //사용자로부터 두 개의 숫자와 연산자(+, -, *, /)를 입력받아 해당 연산을 수행하는 코드를 작성하시오.
        //조건. 4가지의 연산자가 아닌 경우 다시 입력닫도록 설계하고, 프로그램의 종료는 사용자가 '종료'라고 입력해야지만 가능하도록 코드를 작성
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        double min = 0;
        double mul = 0;
        double div = 0;

        for (int i = 0; ; i++) {

            System.out.println("+, -, *, / 중 원하는 연산자를 입력하세요.");
            String input2 = sc.nextLine();
            if (input2.equals("종료")){
                System.out.println("종료합니다.");
                break;
            }else if (input2.equals("+")||input2.equals("-")||input2.equals("*")||input2.equals("/")){
                System.out.println("숫자를 입력하세요.");
                double input = sc.nextDouble();

                System.out.println("연산할 숫자를 입력하세요.");
                double input3 = sc.nextDouble();

                if (input2.equals("+")) {
                    sum = input + input3;
                    System.out.println(input + " + " + input3 + " = " + sum);
                    break;
                } else if (input2.equals("-")) {
                    min = input - input3;
                    System.out.println(input + " - " + input3 + " = " + min);
                    break;
                } else if (input2.equals("*")) {
                    mul = input * input3;
                    System.out.println(input + " * " + input3 + " = " + mul);
                    break;
                } else if (input2.equals("/")) {
                    div = input / input3;
                    System.out.println(input + " ÷ " + input3 + " = " + div);
                    break;
                } else {
                    System.out.println("Error 다시 입력해주세요. 종료를 원하시면 종료를 입력해주세요.");
                }
            }

        }
    }
}

package StudyGroup.Java0513;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min = 0;
        int mul = 0;
        int div = 0;
        System.out.println("종를 원하시면 종료를 적어주세요.");
        String end = sc.nextLine();
        for (int j = 0; ; j++) {

            for (int i = 0; i<1; i++) {
                    System.out.println("숫자를 입력하세요.");
                    int input = sc.nextInt();
                    System.out.println("+, -, *, / 중 원하는 연산자를 입력하세요.");
                    char input2 = sc.next().charAt(0);
                    System.out.println("연산할 숫자를 입력하세요.");
                    int input3 = sc.nextInt();
                    if (input2 == '+') {
                        sum = input + input3;
                        System.out.println(input + " + " + input3 + " = " + sum);
                    } else if (input2 == '-') {
                        min = input - input3;
                        System.out.println(input + " - " + input3 + " = " + min);
                    } else if (input2 == '*') {
                        mul = input * input3;
                        System.out.println(input + " * " + input3 + " = " + mul);
                    } else if (input2 == '/') {
                        div = input / input3;
                        System.out.println(input + " ÷ " + input3 + " = " + div);
                    } else if (end.equals("종료")) {
                        System.out.println("종료");

                    } else {
                        System.out.println("다시 입력해주세요.");
                    }
                }


        }
    }
}

package StudyGroup.Java0522;

import java.util.Scanner;

class Digit{
    public String digit (int input){
        if (0<=input && input<10){
            return "1의 자리 입니다.";
        } else if (10<=input && input<100){
            return "10의 자리 입니다.";
        } else if (100<=input && input<1000){
            return "100의 자리 입니다.";
        }
        return null;
    }
}
public class HW02 {
    //사용자에게 입력받은 숫자가 1의 자리인지 10의 자리인지 100의 자리인지 알아내는 코드를 작성하시오.
    //입력매게변수 사용
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        Digit digit = new Digit();
        digit.digit(input);
        System.out.println(digit.digit(input));


    }
}

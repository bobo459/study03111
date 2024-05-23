package StudyGroup.Java0522;

import java.util.Scanner;

public class HW02 {
    //사용자에게 입력받은 숫자가 1의 자리인지 10의 자리인지 100의 자리인지 알아내는 코드를 작성하시오.
    //입력매게변수 사용
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        NumberForHw numberForHw = new NumberForHw();
        String num = numberForHw.digit(input);
        System.out.println(num);
    }
}

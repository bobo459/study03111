package StudyGroup.Java0516;

import java.util.Scanner;

class Divide {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    void printDivide() {
        if (input % 2 == 0) {
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }
    }
}

public class HW01 {
    public static void main(String[] args) {
        //사용자가 값을 입력하면 짝수인지 홀수인지를 구분하는 코드를 작성하시오.
        //단, 외부클래스 사용.

        System.out.println("숫자를 입력해 주세요");

        Divide divide = new Divide();
        divide.printDivide();
    }
}

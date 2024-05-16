package StudyGroup.Java0516;

import java.util.Scanner;

public class Num {
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
}

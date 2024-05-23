package StudyGroup.Java0522;
// 공통 조건 : 3개의 과제 클래스에서 필요한 외부 클래스는 하나의 클래스 NumberForHw로 통일하여 사용
import java.util.Scanner;

public class HW01 {
    //유저에게 두 개의 숫자를 입력받아 사칙연산을 수행하시오.
    //4개의 사칙연산을 따로따로 모두 실행하시오.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int input02 = sc.nextInt();

        NumberForHw numberForHw = new NumberForHw();

        int sum = numberForHw.sum(input,input02);
        int sub = numberForHw.sub(input,input02);
        double mul = numberForHw.mul(input,input02);
        double div = numberForHw.div(input,input02);

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

    }
}

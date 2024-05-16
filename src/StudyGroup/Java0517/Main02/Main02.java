package StudyGroup.Java0517.Main02;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        //사용자에게 두 개의 숫자를 입력받아 다음을 수행하는 메서드를 만드시오.
        //단 외부 클래스를 사용해야 함. -> 새로운 file 이용
        //1. 두 수를 더하는 메서드를 만드시오.
        //2. 두 수를 빼는 메서드를 만드시오.
        //3. 1과 2를 더하는 메서드를 만드시오.

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int input2 = sc.nextInt();

        SumNum sum1 = new SumNum();

        System.out.println(sum1.sum(input,input2));
        System.out.println(sum1.sub(input,input2));

        int a = sum1.sum(input,input2);
        int b = sum1.sub(input,input2);
        System.out.println(sum1.num(a,b));


    }
}

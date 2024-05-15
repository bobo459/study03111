package StudyGroup.Java0516;

import java.util.Scanner;

class Multiplication{
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    void printMultiplication(){
        int mul =0;
        System.out.println(input +"단");
        for (int i = 1; i <= 9; i++) {
            mul = input*i;
            System.out.print(mul+" ");
        }
    }
}

public class HW02 {
    public static void main(String[] args) {
        //구구단 어플을 만드시오.
        //사용자가 원하는 단수를 입력하면 그에 해당하는 구구단이 출력되야함
        //단, 외부 클래스 사용
        System.out.println("구구단의 알고 싶은 단을 입력해 주세요.");

        Multiplication multiplication = new Multiplication();
        multiplication.printMultiplication();

    }
}

package StudyGroup.Java0426;

import java.util.Scanner;

//유저가 숫자를 입력하면 그 숫자에 해당 하는 한글을 출력하는 코드를 작성하시오.
// 범위는 1부터 5까지이며 범위를 초과시 error 를 출력. ex) 유저 1 입력 = 일 출력
public class HW01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원하시는 숫자를 입력하시오 : ");
        int a = sc.nextInt();
        if (a==1){
            System.out.print("일");
        }else if (a==2) {
            System.out.print("이");
        }else if (a==3) {
            System.out.print("삼");
        }else if (a==4) {
            System.out.print("사");
        }else if (a==5) {
            System.out.print("오");
        }else System.out.println("Error");
    }
}

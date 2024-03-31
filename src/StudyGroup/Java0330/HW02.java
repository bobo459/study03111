package StudyGroup.Java0330;

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {

        /*2. a = 10일때 a가 10이면 true, a가 10이 아니면 false 가 출력되는 코드를 작성하시오.*/

/*

        int a =10;
        if (a==10){
            System.out.println("true");
        }else {
            System.out.println("fales");
        }


*/


        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해보세요 : ");
         int a =  sc.nextInt();

        if (a==10){
            System.out.println("true");
        }else {
            System.out.println("fales");
        }







    }
}

package StudyGroup.Java0417;

//0부터 n까지의 자연수를 순서대로 더할 때, 어느 항까지 더해야 주어진 (n)값 이상이 되는지를 찾는 프로그램을 작성하세요.

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        System.out.print("원하는 숫자가 있나요? : ");
        int input2 = scn.nextInt();

        int count = 0;
        int sum = 0;
        for (int i=0 ; i <= input2  ; i++ ){
            if (sum<input2){
            count++;
            }
            sum = sum + i;
        }System.out.println("입력한 숫자의 총 합 : "+sum);
        System.out.println(count );
    }
}

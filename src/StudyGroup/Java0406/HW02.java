package StudyGroup.Java0406;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//2.array배열에 1부터 50까지의 숫자를 저장하고 사용자에게 임의이 값을 입력받은뒤
//그 수가 array 배열에 있으면 “있다” 없으면 “없다”를 출력하시오
public class HW02 {
    public static void main(String[] args) {
        int[] arry = new int[50];

        Scanner sc = new Scanner(System.in);
        System.out.print("원하시는 숫자를 입력해주세요. : ");
        int a = sc.nextInt();

        int i = 0;
        for (i = 0; i < arry.length; i++) {
            arry[i] = i + 1;
         }
        if (i == a) {
            System.out.println("있다.");
        } else {
            System.out.println("없다.");
        }
    }
}



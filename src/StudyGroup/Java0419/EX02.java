package StudyGroup.Java0419;

import java.util.Arrays;
import java.util.Scanner;

// 사용자에게 배열의 길이를 입력 받고
// 그 배열에 1부터 100까지 중 짝수의 숫자만 앞에서부터 넣으시오.
// 예 )) 길이가 3이면 배열 안에는 2,4,6저장된다.
public class EX02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("원하는 배열 길이가 몇인가요? : ");
        int input = scn.nextInt();
        int[] a = new int[input];
        int b = 0 ;

        for (int i = 0; ; i++) {
            if (i%2==0){
                a[b] = i;
                b=b+1;
            }
            if (b==input){
                break;
            }
        }System.out.println(Arrays.toString(a));
    }
}

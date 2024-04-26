package StudyGroup.Java0426;

import java.util.Arrays;
import java.util.Scanner;

//각 배열의 크기는 100으로 하며,
// a배열에는 1부터 100까지, b배열에는 101부터 200까지, c배열에는 201부터 300까지의 숫자를 저장한다.
// 유저에게 값을 입력 받은 뒤 그 배열의 값이 어느배열에 몇번째 인덱스번호에 저장되어있는지를 출력하시오.
public class HW05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 1~300중 적어주세요 : ");
        int input = sc.nextInt();
        int[] a = new int[100];
        int[] b = new int[100];
        int[] c = new int[100];

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i]+i;
            b[i] = 101+i;
            c[i] = 201+i;
            if (input == a[i]){
                System.out.println(i);
            }
            else if (input == b[i]){
                System.out.println(i);
            }
            else if (input == c[i]){
                System.out.println(i);
            }
        }//100을 못넣음..
    }
}

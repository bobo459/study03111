package StudyGroup.Java0419;

import java.util.Arrays;
import java.util.Scanner;
//사용자가 입력한 정수 배열을 오른쪽으로 주어진 횟수만큼 회전시키는 프로그램을 작성하시오.
//예를 들어, 배열 [1, 2, 3, 4, 5]를 오른쪽으로 2회 회전하면 [4, 5, 1, 2, 3]이 된다.
/*
사용자가 입력한 정수 배열을 인덱스 제한 없이 scanner로 받는다.
입력받은 정수의 배열을 for문을 이용하여 한칸씩 뒤로 보낸다. 미뤄진 앞의 인덱스 [0] 번째는 null값인 0이 나올 수 있다.
이제 맨 뒤에 있던 숫자를 앞으로 보낼수 있게 만들어준다.
*/
public class EX05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요 : ");

        int[] a = new int[5];
        int b = 0;
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            int input = scn.nextInt();
            a[b] = input;
            b++;

            // a[i] = a[i+1];
        }
        System.out.println(Arrays.toString(a));
    }
}

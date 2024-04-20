package StudyGroup.Java0419;

import java.util.Arrays;

//사용자가 입력한 정수 배열을 오른쪽으로 주어진 횟수만큼 회전시키는 프로그램을 작성하시오.
//예를 들어, 배열 [1, 2, 3, 4, 5]를 오른쪽으로 2회 회전하면 [4, 5, 1, 2, 3]이 된다.
public class EX05 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i]+1;
            
            // a[i] = a[i+1];
        }
        System.out.println(Arrays.toString(a));
    }
}

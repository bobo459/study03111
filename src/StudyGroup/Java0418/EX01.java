package StudyGroup.Java0418;

// 1. {0,1,2,3,4,5,6,7,8,9}값이 들어있는 배열을 만드시오
// 2. 본인의 (이름),(나이),(성별),(키) 정보가 들어있는 배열을 만드시오.
// 3. 0부터 99까지의 수가 저장되는 배열을 만드시오.

import java.util.ArrayList;
import java.util.Arrays;

public class EX01 {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        System.out.print(Arrays.toString(a));
        System.out.println();

        String[] b = new String[]{"송진경","30","여자","160cm" };
        System.out.print(Arrays.toString(b));
        System.out.println();

        int[] c= new int[100];
        for (int i = 0; i < c.length; i++) {
            c[i]=i;
        }System.out.print(Arrays.toString(c));




    }
}

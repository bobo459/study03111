package StudyGroup.Java0419;

import java.util.Arrays;

// Z배열에는 {1,2,3,4,5,6,7,8,9,10}이 저장되어있다
// 배열의 각 요소를 제곱하고, 새로운 배열에 저장한 후 결과를 출력하는 프로그램을 작성하시오.
public class
EX03 {
    public static void main(String[] args) {
        int[] z = new int[]{1,2,3,4,5,6,7,8,9,10};
        int square = 0;
        for (int i = 0; i < z.length; i++) {
            z[i] = z[i]*z[i];
        } System.out.println(Arrays.toString(z));
    }
}

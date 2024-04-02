package StudyGroup.Java0402;


import java.util.Arrays;

//아래 정수형 배열에서 짝수인 요소들의 합을 계산하여 출력하는 프로그램을 작성하시오.
public class HW03 {
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 0;

        for ( int i = 0; i < Array.length; i++) {
            if (Array[i] % 2 == 0) {
                num = num + Array[i];
            }/*System.out.println(Array[i]);*/
        }
        System.out.println(num);

    }
}

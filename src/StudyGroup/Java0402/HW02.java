package StudyGroup.Java0402;

import java.lang.reflect.Array;
import java.util.Arrays;

//1부터 50까지의 숫자 중 2의 배수 이면서 5의 배수인 숫자만을 담고 있는 배열 만들고, 배열 안에 있는 값을 출력하시오.

//- 갯수를 세는 count 변수를 만들고 그 수를 세는 만큼 인덱스를 만들수 있어야 한다.
public class HW02 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                count++;
            }
        }
/*
        System.out.println("횟수 : " + count);
*/

        int[]Array = new int[count];
        int a=0;

        for (int j = 1; j <= 50; j++) {
            if (j % 2 == 0 && j % 5 == 0) {

                Array[a]=j;
                a++;

            }
        }
        System.out.println("2와 5의 배수 : " + Arrays.toString(Array));
        System.out.println("횟수 : " + count);

    }
}




/*        int count;
        count=0;
        int input = 0;
        int[] Array = new int[]{count};

        if (input <= 1 && input <= 50) {
            for (int i = 1; i <= 50; i++) {
                if (i % 2 == 0 && i % 5 == 0) {
                    count++;
                    System.out.println(i);
                }
            }
            System.out.println("횟수 : " + count);
        }*/


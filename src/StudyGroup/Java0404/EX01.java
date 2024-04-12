package StudyGroup.Java0404;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

//1~100까지의 숫자 중 5의 배수인 숫자는 Array5 에 저장하고 [20개] <=
//10의 배수이 숫자는 Array 10에 저장한다.  [10개]  <=
//그리고
//1. Array5 의 인덱스의 총 합을 sum5 에 저장한다. 출력   <=
//2. Array5와 Array10의 공통적으로 들어가는 숫자(공배수)를 Array0 이라는 배열에 저장하시오. 출력
public class EX01 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int sum5 = 0;

        int[] Array5 = new int[20];
        int[] Array10 = new int[10];
        int[] Array0 = new int[10];

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                Array5[a] = i;
                a++;
            }
        }
        for (int k = 0; k < Array5.length; k++) {
            sum5 = sum5 + Array5[k];
        }
        System.out.println("총 합은 " + sum5);

        for (int j = 1; j <= 100; j++) {
            if (j % 10 == 0) {
                Array10[b] = j;
                b++;
            }
        }

        // System.out.println(Arrays.toString(Array5));
        // System.out.println(Arrays.toString(Array10));

  /*      for (int j =0; j <= Array5.length ; j++){
            if ( Array5 == Array10 ) {
                Array0[c] = j;
                c++;
            }
        }System.out.println(Arrays.toString(Array0));*/

        //Array5와 Array10에 있는 같은 수를 Array0에 저장해라.
        for (int i = 0; i < Array5.length; i++) {
            for (int j = 0; j < Array10.length; j++) {
                if (Array5[i] == Array10[j]) {
                    Array0[c] = Array5[i];


                    System.out.println(Arrays.toString(Array5));
                    System.out.println(Arrays.toString(Array10));

                    for (int k = 0; k < Array5.length; k++) {
                        for (int m = 0; m < Array10.length; m++) {
                            if (Array5[k] == Array10[m]) {
                                Array0[c] = Array5[k];

                                c++;
                            }
                        }
                    }
                    System.out.println(Arrays.toString(Array0));
                }
            }
        }
    }
}

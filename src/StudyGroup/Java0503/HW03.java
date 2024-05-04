package StudyGroup.Java0503;

import java.util.Arrays;

/*문제3. 두 개의 배열을 하나의 배열로 합치시오.
        [1,2,3,4,5,6,7,8,9,10]
        [가,나,다,라,마,바,사,아,자,차]
결과 : [1,가,2,나,3,다 …9,자,10,차]*/
public class HW03 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] b = {"가", "나", "다", "라", "마", "바", "사", "아", "자", "차"};
        int num = 10;

        String[] pu = new String[num];

        for (int i = 0; i < num; i++) {
            pu[i] = String.valueOf(a[i]);
        }
        System.out.println(Arrays.toString(pu));
    }
}


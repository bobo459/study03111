package StudyGroup.Java0503;

import java.util.Arrays;

/*문제 1. 하나의 배열을 이용하여
        [1,2,3,4,5,6,7,8,9,10]
        [3,6,9,12,15,18,21,24,27,30]
        [5,10,15,20,25,30,35,40,45,50]
을 출력하시오 . 단 직접 값을 입력하지 말고 제어문 사용*/
public class HW01 {
    public static void main(String[] args) {
        int[] a=new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + i;
        }System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            int num =1;
            a[i] = (num+i) * 3 ;
        }System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            int num =1;
            a[i] = (num+i) * 5 ;
        }System.out.println(Arrays.toString(a));

    }
}

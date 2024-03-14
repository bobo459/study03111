package Java0311;

import java.util.Arrays;

public class Java20240311 {
    public static void main(String[] args) {

// 실습문제
        // 참조 자료형 매개 변숫값의 변화
        int[] array = new int[] {1, 2, 3};
        modifyData(array);
        printArray(array);

    }
    public static void modifyData(int[] a){
        a[0] = 4;
        a[1] = 5;
        a[2] = 6;
    }
    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }


}

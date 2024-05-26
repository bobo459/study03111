package StudyGroup.Java0525;

import java.util.Arrays;
import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        int [] a = new int[10];
        int [] b = new int[10];
        int sumA = 0;
        int sumB = 0;

        Numbers numbers = new Numbers();

        a = numbers.inputNum(a);
        sumA = numbers.sum(a);
        int minA = (int) numbers.min(a);
        int maxA = (int) numbers.max(a);
//        System.out.println(Arrays.toString(a));
//        System.out.println(sumA);
//        System.out.println(minA);
//        System.out.println(maxA);


        b = numbers.inputNum(b);
        sumB = numbers.sum(b);
        int minB = (int) numbers.min(b);
        int maxB = (int) numbers.max(b);
//        System.out.println(Arrays.toString(b));
//        System.out.println(sumB);
//        System.out.println(minB);
//        System.out.println(maxB);

        boolean sumMin = numbers.comparisonSum(sumA,sumB);
        boolean maxNum = numbers.comparisonMax(maxA,maxB);
//        System.out.println(sumMin);
//        System.out.println(maxNum);

    }
}

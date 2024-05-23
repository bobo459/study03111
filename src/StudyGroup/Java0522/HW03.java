package StudyGroup.Java0522;

import java.util.Arrays;
import java.util.Scanner;
class MaxAndMin{
    public int[] maxAndMin(int[] num){
        Scanner sc = new Scanner(System.in);
        int temp=0;
        for (int i = 0; i < num.length; i++) {
            int input = sc.nextInt();
            num[i]=input;
        }return num;
 /*       for (int i = 0; i < num.length; i++) {
            for (int j = num.length-1; j > i; j--) {
                if (num[i] >= num[j]) {
                    temp = num[j];
                    num[j] =num[i];
                    num[i] = temp;
                }
            }
        }*/
    }
}
public class HW03 {
    //유저에게 10개의 정수형 데이터를 입력받아 최소값과 최대값을 찾는 코드를 작성하시요.
    //최소값과 최대값을 구하는 메서드를 각각 만드시오.
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int temp=0;*/
/*
        for (int i = 0; i < num.length; i++) {
            int input = sc.nextInt();
            num[i]=input;
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = num.length-1; j > i; j--) {
                if (num[i] >= num[j]) {
                    temp = num[j];
                    num[j] =num[i];
                    num[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
        System.out.println(min);
        System.out.println(Arrays.toString(num));
        */
        int[] num = new int[10];
        int min = num[0];
        int max = num[9];

        MaxAndMin maxAndMin = new MaxAndMin();
        maxAndMin.maxAndMin(num);

        System.out.println(Arrays.toString(maxAndMin.maxAndMin(num)));


    }
}

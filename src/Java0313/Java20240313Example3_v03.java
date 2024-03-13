package Java0313;

import java.util.Scanner;

public class Java20240313Example3_v03 {
    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 5};
        int n = 3;

     /*   Scanner sc = new Scanner(System.in);  // 2번문제 오른쪽으로 돌아가게 변경해보시오. 심화문제로 풀어보기.
        System.out.println("숫자를 입력하세요. : ");
        int[] n = new int[sc.nextInt()];*/

/*

        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
*/

        for(int i = 0; i < n ; i++){
            int j, first;

            first = arr[0];  // 포인트 1
            for(j = 0; j < arr.length-1; j++){
                arr[j] = arr[j+1];

            }

            arr[j] = first;  // 포인트 2
            System.out.print(arr[i] + " ");
        }

/*
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }*/
    }
}

package Java0313;

import java.util.Scanner;

public class Java20240313Example3_v02 {
    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 5};

        Scanner sc = new Scanner(System.in);  // int n = 3; 대신 scanner로 외부입력을 받아서 작성해보기(inpot 넣는 것)
        System.out.println("숫자를 입력하세요. : ");
        int[] n = new int[sc.nextInt()];


        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < n.length ; i++){
            int j, first;

            first = arr[0];  // 포인트 1
            for(j = 0; j < arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = first;  // 포인트 2
        }
        System.out.println();

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

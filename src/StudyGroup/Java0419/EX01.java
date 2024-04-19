package StudyGroup.Java0419;

import java.util.Arrays;
import java.util.Scanner;

//A배열과 B배열을 만들고
//A배열에는 {1,2,3,4,5,6,7,8,9,10}을 저장하고
//B배열에는 유저에게 1부터 20까지의 숫자 중 5개의 숫자를 입력받은 뒤
//A배열에 유저에게 입력받은 값과 같은 수가 몇개 있는지 세고,
// 그 숫자들을 출력해서 보여주는 코드를 작성하시오.
public class EX01 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        int[] B = new int[5];
        int[] C = new int[5];
        int k =0;
        int count = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("1부터 20까지의 숫자 중 5개의 숫자를 입력해주세요 : ");

        for (int i = 0; i < B.length; i++) {
            int input = scn.nextInt();
            if (1<= input && input <=20) {
                B[i] = B[i] + input;
            }else {
                System.out.println("다시 입력해주세요");
                i=i-1;
            }
        }System.out.println(Arrays.toString(B));
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (B[j]==A[i]){
                    C[k] = B[j];
                    k=k+1;
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(C));
    }
}

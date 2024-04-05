package StudyGroup.Java0405;

import java.util.Arrays;
import java.util.Scanner;

//배열 arrayCheck 에는 1부터 10까지의 숫자가 들어있고
//사용자에게 1부터 10까지 숫자중 임의의 숫자 5개를 입력받는다.(중복 숫자 가능)
//사용자가 입력한 숫자들과 배열 arrayCheck 중 동일한 숫자를 찾고 그 수가 중복 돈다면 중복된 횟수를 출력하라.
public class HW02 {
    public static void main(String[] args) {
        int[] arrayCheck = new int[10];
        int count =0;
        int[] a = new int[arrayCheck.length];

 if (1<= arrayCheck.length && arrayCheck.length>=10 ) {
            for (int j = 0; j < 5; j++) {

                Scanner sc = new Scanner(System.in);
                System.out.println("1부터 10까지 숫자중 임의의 숫자 5개를 입력해주세요. : ");
                arrayCheck[j] = sc.nextInt();

            }
        } else {
                System.out.println("1부터 10 까지의 숫자를 입력해주세요.");
            } //System.out.println("중복된 숫자는 " + count + " 번입니다.");

        for(int i=0;i<arrayCheck.length-1;i++) {
            for(int j=i+1;j<arrayCheck.length;j++) {
                if(arrayCheck[i] == arrayCheck[j]) {
                    count++;
                }
            }
        }System.out.println("중복된 숫자는 " + count);
        System.out.println(Arrays.toString(arrayCheck));


    }

}

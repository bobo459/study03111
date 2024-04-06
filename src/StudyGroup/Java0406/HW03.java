package StudyGroup.Java0406;

import java.util.Arrays;
import java.util.Scanner;

//3.배열 arraynum에 임의의 숫자 10개를 입력한다.
//사용자가 n번째 까지 뽑아달아고 하면 처음부터 그에 해당되는 인덱스번호까지의 내용을 출력하는 코드를 작성하시오.
public class HW03 {
    public static void main(String[] args) {
        int[] arraynum = new int[10];
        int count=0;

        Scanner sc1 = new Scanner(System.in);
        System.out.print("몇번째 번호까지 보이길 원하세요? : ");
        int b = sc1.nextInt();


        for (int i = 0; i < arraynum.length ; i++) {
            count++;
            Scanner sc = new Scanner(System.in);
            System.out.print(count+"번째 원하는 숫자를 입력하시오.: ");
            int a = sc.nextInt();

            arraynum[i] = a;

            for (int j = 0; j < arraynum.length-i-1; j++) {
              if (b==arraynum[j]){
                  break;
              }

            }System.out.println(b);

        }System.out.println(Arrays.toString(arraynum));

    }
}

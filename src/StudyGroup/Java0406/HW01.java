package StudyGroup.Java0406;

import java.util.Arrays;
import java.util.Scanner;

//1. 사용자에게 입력받은 숫자 10개를 저장하는 코드를 작성하시오
public class HW01 {
    public static void main(String[] args) {

        int[] arry = new int[10];
        int count  =0;

        for (int i = 0; i < arry.length; i++) {
            count++;
            Scanner sc = new Scanner(System.in);
            System.out.print(count+"번째에 저장 할 숫자 적어주세요. : ");
            int a = sc.nextInt();
            arry[i] = a;
        }System.out.println("입력한 숫자는 : "+Arrays.toString(arry));
    }
}

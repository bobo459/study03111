package StudyGroup.Java0522;

import java.util.Arrays;
import java.util.Scanner;
class MaxAndMin {

}
public class HW03 {
    //유저에게 10개의 정수형 데이터를 입력받아 최소값과 최대값을 찾는 코드를 작성하시요.
    //최소값과 최대값을 구하는 메서드를 각각 만드시오.
    public static void main(String[] args) {
        int[] num = new int[10];
        
        NumberForHw numberForHw = new NumberForHw();
        numberForHw.maxAndMin01(num);
        numberForHw.maxAndMin02(num);
        int min = num[0];
        int max = num[9];

        System.out.println(Arrays.toString(num));
        System.out.println(min);
        System.out.println(max);

    }
}

package StudyGroup.Java0502;

import java.util.Arrays;

//피보나치 수열을 만드시오.
//단 길이는 20개로 한함
public class Example03 {
    public static void main(String[] args) {
        int[] pi = new int[20];
        int a = 1;
        int b = 1;
        for (int i = 0; i < pi.length; i++) {
            if (i < 2){
                pi[i] = 1;
            }else {
                pi[i] = pi[i-1] + pi[i-2];
              /*
                pi[i] = a + b;
                a = b;
                b = pi[i];*/
            }

        }
        System.out.print(Arrays.toString(pi));
    }
}

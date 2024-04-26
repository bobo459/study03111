package StudyGroup.Java0426;

import java.util.Scanner;

// 다음 출력이 되는 코드를 작성 하시오.
/*
초등학생
1학년 = 8살
2학년 = 9살
3학년 = 10살
4학년 = 11살
5학년 = 12살
6학년 = 13살
중학생
1학년 = 14살
2학년 = 15살
3학년 = 16살
고등학생
1학년 = 17살
2학년 = 18살
3학년 = 19살
 */
public class HW02 {
    public static void main(String[] args) {
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int a = 0;
        System.out.println("초등학생");
        for (int i = 0; i < 6 ; i++) {
            count++;
            a = i + 8;
            if (a <= 13) {
                System.out.println(count + "학년 = " + a + "살");
            }
        }System.out.println("중학생");
            for (int i = 0; i < 12 ; i++) {
                a = i + 8;
            if (14<=a && a<=16){
                count1++;
                System.out.println(count1 + "학년 = " + a + "살");
            }
        }System.out.println("고등학생");
        for (int i = 0; i < 12 ; i++) {
            a = i + 8;
            if (17<=a && a<=19){
                count1++;
                System.out.println(count1 + "학년 = " + a + "살");
            }
        }
    }
}

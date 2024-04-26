package StudyGroup.Java0426;

import java.util.Scanner;

// 유저에게 나이를 입력 받고,
// 나이에 맞는 학년을 출력하시오.
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

20살부터는 모두 성인으로 출력
 */
public class HW04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 적어주세요 : ");
        int b = sc.nextInt();
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int a = 0;

        for (int i = 0; i < 12 ; i++) {
            count++;
            a = i + 8;
            if (a==b) {
                    if (a <= 13) {
                        System.out.println("초등학교 " + count + "학년");
                    } else if (14 <= b && b <= 16) {
                        count1++;
                        System.out.println("중학교 " + count1 + "학년");
                    } else if (17 <= b && b <= 19) {
                        count2++;
                        System.out.println("고등학교 " + count2 + "학년");
                    }
            }
        }
    }
}

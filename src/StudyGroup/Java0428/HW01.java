package StudyGroup.Java0428;
//각 학생 5명의 국어 수학 사회 과학 점수 배열이 있다. [임의로 값 입력] !
//1. 각 과목별로 평균 점수를 구하시오.
//2. 반의 전체 평균을 구하시오.
//3. 학생 5명에 대한 국어 평균 이상 이하 학생을 구분하시오.
//4. 모든 학생의 각 과목별 총점을 담고 있는 객체를 출력하시오.


import java.util.Arrays;
import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new  int[4];
        int[] b = new  int[4];
        int[] c = new  int[4];
        int[] d = new  int[4];
        int[] e = new  int[4];
        int i;
        float avg = 0;
        int sum = 0;
        System.out.print("1번학생 국어, 수학, 사회, 과학 점수를 적어주세요 : ");
        for (i = 0; i < a.length; i++) {
            int age = sc.nextInt();
                a[i] =  age;
            }
        System.out.print("2번학생 국어, 수학, 사회, 과학 점수를 적어주세요 : ");
        for (i = 0; i < b.length; i++) {
            int age1 = sc.nextInt();
            b[i] =  age1;
        }System.out.print("3번학생 국어, 수학, 사회, 과학 점수를 적어주세요 : ");
        for (i = 0; i < c.length; i++) {
            int age2 = sc.nextInt();
            c[i] =  age2;
        }System.out.print("4번학생 국어, 수학, 사회, 과학 점수를 적어주세요 : ");
        for (i = 0; i < d.length; i++) {
            int age3 = sc.nextInt();
            d[i] =  age3;
        }System.out.print("5번학생 국어, 수학, 사회, 과학 점수를 적어주세요 : ");
        for (i = 0; i < d.length; i++) {
            int age4 = sc.nextInt();
            e[i] =  age4;
        }
      //  sum = sum +age;
        avg = sum / a.length;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));
      //  System.out.println(avg);
    }
}

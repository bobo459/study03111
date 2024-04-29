package StudyGroup.Java0428;
//각 학생 5명의 국어 수학 사회 과학 점수 배열이 있다. [임의로 값 입력] !
//1. 각 과목별로 평균 점수를 구하시오.
//2. 반의 전체 평균을 구하시오.
//3. 학생 5명에 대한 국어 평균 이상 이하 학생을 구분하시오.
//4. 모든 학생의 각 과목별 총점을 담고 있는 객체를 출력하시오.
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
public class HW01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int man =5;
        int subject = 4;
        int[] a = new  int[subject];
        int[] b = new  int[subject];
        int[] c = new  int[subject];
        int[] d = new  int[subject];
        int[] e = new  int[subject];
        float[] avg = new float[subject];
        int[] sum = new int [subject];
        System.out.println("1번학생 국어, 수학, 사회, 과학 점수를 적어주세요");
        for (int i = 0; i < subject; i++) {
            int age = sc.nextInt();
                a[i] =  age;
            }
        System.out.println("2번학생 국어, 수학, 사회, 과학 점수를 적어주세요");
        for (int i = 0; i < subject; i++) {
            int age = sc.nextInt();
            b[i] =  age;
        }System.out.println("3번학생 국어, 수학, 사회, 과학 점수를 적어주세요");
        for (int i = 0; i < subject; i++) {
            int age2 = sc.nextInt();
            c[i] =  age2;
        }System.out.println("4번학생 국어, 수학, 사회, 과학 점수를 적어주세요");
        for (int i = 0; i < subject; i++) {
            int age3 = sc.nextInt();
            d[i] =  age3;
        }System.out.println("5번학생 국어, 수학, 사회, 과학 점수를 적어주세요");
        for (int i = 0; i < subject; i++) {
            int age4 = sc.nextInt();
            e[i] =  age4;
        }
        //1. 각 과목별로 평균 점수를 구하시오.
        for (int j = 0; j < 4; j++) {
            sum[j] = a[j]+b[j]+c[j]+d[j]+e[j];
            avg[j] = sum[j] /5f;
        }
        System.out.println("1학생의 성적 : "+ Arrays.toString(a));
        System.out.println("2학생의 성적 : "+Arrays.toString(b));
        System.out.println("3학생의 성적 : "+Arrays.toString(c));
        System.out.println("4학생의 성적 : "+Arrays.toString(d));
        System.out.println("5학생의 성적 : "+Arrays.toString(e));
        System.out.println("전체 과목별 성적 합계 : "+Arrays.toString(sum));
        System.out.println("전체 과목별 평균 : "+Arrays.toString(avg));

    }
}

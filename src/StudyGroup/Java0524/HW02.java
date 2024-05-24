package StudyGroup.Java0524;

import java.util.Arrays;
import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        // 문제 3. Students 클래스에 학생들의 성적을 입력받는 메서드를 입력받아 저장하는 메서드를 구현하시오.
        // 성적은 국어, 수학, 사회, 과학으로 구성
        // 메서드를 호출해 학생 3명의 성적을 입력받으시오.
        // 문제 4. 저장된 학생의 성적을 입력매게변수로 받아 그 학생의 평균 점수를 반환하는 메서드를 구현 후 실행하시오.
        // 문제 5. 반평균을 구하는 메서드를 구현 후 실행하시오.

        int[] student01 = new  int[4];
        int[] student02 = new  int[4];
        int[] student03 = new  int[4];

        Students students = new Students();

        student01 =students.grade(student01);
        double ave01 = students.average(student01);
        System.out.println(Arrays.toString(student01));
        System.out.println(ave01);

        student02 = students.grade(student02);
        double ave02 = students.average(student02);
        System.out.println(Arrays.toString(student02));
        System.out.println(ave02);

        student03= students.grade(student03);
        double ave03 = students.average(student03);
        System.out.println(Arrays.toString(student03));
        System.out.println(ave03);

        double[] studentAll = {ave01,ave02,ave03};
        double aveAll = students.averageAll(studentAll);
        System.out.println(Arrays.toString(studentAll));
        System.out.println(aveAll);
    }
}

package StudyGroup.Java0521;


import Java0308.Student;
import Java0402.sec01_list.EX01_ArrayVsList.ArrayVsList;

import java.util.Arrays;
import java.util.Scanner;

public class HW01 {
    //DW 고등학교 1학년 신입생 이름 저장 프로그램
    //조건 :) 외부클래스 사용 / 입력매게변수 사용
    //각 A,B,C반이 있으며 각 반의 학생은 5명으로 규정한다.

    public static void main(String[] args) {
 /*       Scanner sc = new Scanner(System.in);
        String[] classNames = new String[3];
        String[] mateNames = new String[5];

        for (int j = 0; j < classNames.length; j++) {
            int className = sc.nextInt();
            for (int i = 0; i < mateNames.length; i++) {
                String mateName = sc.next();
                mateNames[i] = mateName;
            }
        }사용자한테 값을 10개를 입력받는 메서드
        그 값에서 최소값을 구하는 메서드
    */
        String[] aclass = new String[5];
        String[] bclass = new String[5];
        String[] cclass = new String[5];

        ClassMateName classMateName = new ClassMateName();

        aclass = classMateName.className(aclass);

        String[] b;
        b= classMateName.className(bclass);

        cclass = classMateName.className(cclass);  //변수선언을 따로 안하고 한번에도 가능하다.

        System.out.println("A반"+Arrays.toString(aclass));
        System.out.println("B반"+Arrays.toString(b));
        System.out.println("C반"+Arrays.toString(cclass));

    }
}

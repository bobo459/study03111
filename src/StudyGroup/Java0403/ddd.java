package StudyGroup.Java0403;

import java.util.Scanner;

public class ddd {
        public static void main(String[] args) {
            //학생 수를 입력받는다.
            System.out.println("총 학생수를 입력하시오.");
            Scanner scanner = new Scanner(System.in);
            int numSutudents = scanner.nextInt();

            //학생들의 점수를 입력받을 배열을 선언한다.
            int[] grade = new int[numSutudents];

            //학생들의 점수를 입력받는다.
            for (int i = 0; i < grade.length; i++) {
                System.out.println("st"+(i+1)+" 학생의 성적을 입력하시오.");
                grade[i] = scanner.nextInt();
            }

            //학생들의 평균점수를 구한다.
            int sum =0;
            float evg;
            for (int i=0;i<grade.length;i++){
                sum = sum+grade[i];
            }
            evg = sum/numSutudents;
            System.out.println("학생들의 평균점수 : "+evg);

            //평균점수를 바탕으로 학생분류
            for (int i=0;i<grade.length;i++){
                if(grade[i]>evg){
                    System.out.println("학생명 : st"+i+", 점수 : "+grade[i]+"점, 평균이상");
                } else {
                    System.out.println("학생명 : st"+i+", 점수 : "+grade[i]+"점, 평균이하");
                }
            }
        }
    }

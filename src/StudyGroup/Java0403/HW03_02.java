package StudyGroup.Java0403;

import java.util.Scanner;
//st1, st2,st3 3명의 학생의 성적을 입력받아 배열에 저장한다.  <==
//그 학생들의 평균성적을 구한 뒤 구한 평균 성적을 바탕으로 학생들의 성적을 분류하여 출력한다.
// 결과값 예시 => 학생명 : st1, 점수 : 100점, 평균 이상(혹은 이하)
//*이하는 기준점을 포함한 그보다 아랫수자를 의미함*
public class HW03_02 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.print("총 학생수를 입력하시오. : ");
    int Ouput = sc.nextInt();

    int[] study = new int[Ouput];

        for (int i = 0; i < study.length; i++) {
            System.out.print("학생의 점수를 입력하세요 : ");
            study[i] = sc.nextInt();
        }

    }
}

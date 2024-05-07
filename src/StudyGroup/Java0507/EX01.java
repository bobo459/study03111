package StudyGroup.Java0507;

import java.util.Arrays;
import java.util.Scanner;

//김수중, 홍성구,송진경 순으로 3명의 학생의 성적을 입력받아 하나의 배열에 저장한다.  <==
//그 학생들의 평균성적을 구한 뒤 구한 평균 성적을 바탕으로 학생들의 성적을 분류하여 출력한다.
// 결과값 예시 => 학생명 : st1, 점수 : 100점, 평균 이상(혹은 이하)
//*이하는 기준점을 포함한 그보다 아랫수자를 의미함*
public class EX01 {
    /*Scanner 을 이용하여 김수중, 홍성구,송진경 순으로 3명의 학생의 성적을 입력을 받아 배열을 만들어 준다.
    3번의 반복으로 입력을 해줘야 하므로 for문을 사용해서 입력해 준다.
    3명의 평균을 구하는 avg 변수를 만들고  점수의 합계 / 인원수 3 을 해준다.
    구한 평균을 기준으로 학생들의 성적을 평균 이상, 이하로 나누어 준다.
    조건이 걸렸으므로 if문을 사용해서 나눠지도록 만들어 준다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("김수중, 홍성구,송진경 순으로 성적을 입력해 주세요.");

        int[] num = new int[3];
        int sum = 0;
        int avg = 0;

        for (int i = 0; i < num.length; i++) {
            int input = sc.nextInt();
            num[i] = input;
            sum = sum + input;
        }  avg = sum / num.length;
        System.out.println(Arrays.toString(num));
        System.out.println("학생들의 평균 점수 : " + avg);

        if (avg <= num[0]) {
            System.out.println("학생명 : 김수중, " + "점수 : " + num[0] + " 평균이상입니다.");
        } else {
            System.out.println("학생명 : 김수중, " + "점수 : " + num[0] + " 평균이하입니다.");
        }
        if (avg <= num[1]) {
            System.out.println("학생명 : 홍성규, " + "점수 : " + num[1] + " 평균이상입니다.");
        } else {
            System.out.println("학생명 : 홍성규, " + "점수 : " + num[1] + " 평균이하입니다.");
        }
        if (avg <= num[2]) {
            System.out.println("학생명 : 송진경, " + "점수 : " + num[2] + " 평균이상입니다.");
        } else {
            System.out.println("학생명 : 송진경, " + "점수 : " + num[2] + " 평균이하입니다.");
        }



    }
}

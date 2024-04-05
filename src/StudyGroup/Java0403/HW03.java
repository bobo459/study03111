package StudyGroup.Java0403;

import java.util.Arrays;
import java.util.Scanner;

//st1, st2,st3 3명의 학생의 성적을 입력받아 배열에 저장한다.  <==
//그 학생들의 평균성적을 구한 뒤 구한 평균 성적을 바탕으로 학생들의 성적을 분류하여 출력한다.
// 결과값 예시 => 학생명 : st1, 점수 : 100점, 평균 이상(혹은 이하)
//*이하는 기준점을 포함한 그보다 아랫수자를 의미함*
public class HW03 {
    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);
        System.out.print("학생 st1 의 성적을 적어주세요. : ");
        int Ouput = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.print("학생 st2 의 성적을 적어주세요. : ");
        int Ouput1 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("학생 st3 의 성적을 적어주세요. : ");
        int Ouput2 = sc2.nextInt();


        int sum = 0;
        int mul = 0;
        int B = 0;

        int[] Array = new int[3];
        Array[0]=Ouput;
        Array[1]=Ouput1;
        Array[2]=Ouput2;

        for (int i = 0; i<Array.length;i++){
            sum = sum+ Array[i];
            mul = sum/Array.length;

        } System.out.println(Arrays.toString(Array));
        System.out.println(sum);
        System.out.println(mul);

        for (int j = 0; j<Array.length; j++){

            if (Array[j] >= mul){
                System.out.println("학생명 : " + "점수 : " +  "평균 이상");

            }else {
                System.out.println("학생명 : " + "점수 : " +  "평균 이하");
            }
        }

    }
}

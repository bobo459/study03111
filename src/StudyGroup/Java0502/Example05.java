package StudyGroup.Java0502;

import java.util.Arrays;
import java.util.Scanner;

//사용자로부터 사각형의 크기(가로와 세로)를 입력받아,
//그 크기만큼의 별(*)로 채워진 사각형을 그리는 프로그램을 작성하시오.
public class Example05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int input2 = sc2.nextInt();

        String[][] star = new String[input][input2];
        for (int i = 0; i < star.length; i++) {

                star[i][i] = "*";


        }
        System.out.println(Arrays.toString(star[0]));
        System.out.println(Arrays.toString(star[1]));
    }
}

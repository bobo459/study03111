package StudyGroup.Java0502;

import java.util.Arrays;
import java.util.Scanner;

//사용자로부터 사각형의 크기(가로와 세로)를 입력받아,
//그 크기만큼의 별(*)로 채워진 사각형을 그리는 프로그램을 작성하시오.
public class Example05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int h = sc2.nextInt();

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package StudyGroup.Java0513;

import java.util.Arrays;
import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        //사용자가 하나의 글을 입력했을때, 그 글에 사용자가 원하는 믄자 혹은 문자열이 몇개 들어있는지를 찾아내는 코드를 작성 -> 123451231
        //조건 1)  글과 문자 혹은 문자열은 사용자에게 입력받아야 한다.
        //조건 2)  사용자가 찾고자 하는 문자 혹은 문자열은 종류에 구애받지 않는다.
     /*   문제 2.
        문자열 : 123451231
        찾을 문자 : 1
        출력 : 3*/

        Scanner sc = new Scanner(System.in);
        System.out.println("작성하고자 하는 문자를 입력하세요.");
        String a= sc.nextLine();

        System.out.println("찾고하 하는 문자를 입력하세요.");
        char c = sc.next().charAt(0);  //.charAt(0) 문자의 첫번째 위치

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)==c) { //a.charAt(i) a문자열을 char화시키고 그것의 i번째 부터 비교하여, c와(입력받은 문자의 0번째) 같은 것을 찾는다.
                count++;
            }
        }
        System.out.println(count);

    }
}

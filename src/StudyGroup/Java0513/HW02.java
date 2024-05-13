package StudyGroup.Java0513;

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        //사용자가 하나의 글을 입력했을때, 그 글에 사용자가 원하는 믄자 혹은 문자열이 몇개 들어있는지를 찾아내는 코드를 작성
        //조건 1)  글과 문자 혹은 문자열은 사용자에게 입력받아야 한다.
        //조건 2)  사용자가 찾고자 하는 문자 혹은 문자열은 종류에 구애받지 않는다.

        Scanner sc = new Scanner(System.in);
        System.out.println("작성하고자 하는 문자 또는 문구를 입력하세요.");
        String a = sc.next();

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            count++;
        }
        System.out.println(count);

    }
}

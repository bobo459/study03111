import java.util.Scanner;

public class java20240307_2024040306 {
    public static void main(String[] args) {
        //5. 사용자로부터 이름을 입력받아 아래 회원배열에 있는 이름이면
        //"~~~님 확영합니다" 를 출력하고
        //없으면 "회원가입해주세요" 를 출력(단,대소문자 구분하지 마시오)
        String[] members = {"Steve", "Tom", "Michael", "Laura", "Jessica", "Annie"};
        Scanner scan2 = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 : ");
        String inputStr = scan2.nextLine();
        boolean found = false;
 /*       for (int i=0; i< members.length; i++) {
            if (members[i].equalsIgnoreCase(inputStr)) {
                System.out.println(members[i] + "님 환영합니다");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("회원가입해주세요");
        }*/


        //유사한 베레이션
        int k =0;
        for ( ; k< members.length; k++) {
            if (members[k].equalsIgnoreCase(inputStr)) {
                System.out.println(members[k] + "님 환영합니다.");
                break;
            }
        }
        if (k == members.length) {
            System.out.println("회원가입해주세요");
        }
    }
}

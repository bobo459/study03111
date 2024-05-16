package StudyGroup.Java0517;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int userInput = scanner.nextInt();

        //로또 프로그램 짜기
        //조건, 외부 클래스 사용 (멤버 사용 필수) =>멤버 :필드,메서드, 이너클래스
        //아래 메서드들을 활성화 시키시오.

        //1.로또번호 생성 메소드  <=

        //2.정렬 메소드
        // --입력매게변수로 로또번호 입력--

        //3.유저가 구입한 로또번호를 입력받는 메서드

        //4.정렬 메소드
        // --입력매게변수로 유저가 구입한 로또번호 입력--

        //5.등수 확인 메서드

//스캐너만 메인에 쓰고 메인에는 5개만 코드 있어야함
        //정렬은 하나를 만들어서 불러서 사용하면 됨




        Lotto lotto = new Lotto();
        System.out.println(Arrays.toString(lotto.randomLotto()));

        System.out.println(Arrays.toString(lotto.rangeNum()));

        System.out.println(Arrays.toString(lotto.userLotto()));

        //System.out.println(Arrays.toString(lotto.rangeNum()));

        System.out.println(lotto.ranking());





    }
}

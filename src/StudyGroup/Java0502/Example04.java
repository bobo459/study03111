package StudyGroup.Java0502;

import java.util.Random;
import java.util.Scanner;

//[숫자 맞추기 게임]
//사용자에게 랜덤한 숫자를 맞추게 하는 간단한 숫자 맞추기 게임 코드를 작성하시오.
// 출력 할 것 : 1. 시도한 횟수, 2. 맞춘 숫자
public class Example04 {
    public static void main(String[] args) {
        // 1부터 100까지 랜덤한 숫자 생성
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        //이후부터 코드 작성
        Scanner sc = new Scanner(System.in);
        System.out.println("1~100사이의 숫자를 입력해주세요. " + "정답은 : "+randomNumber);

        int count =0;
        for (int i = 0; ; i++) {
            int input = sc.nextInt();
            count++;
            if (randomNumber==input){
                System.out.println("축하드립니다. 정답입니다. "+"시도횟수는 "+count+" 회 입니다.");
                break;
            }else if (input < randomNumber){
                System.out.println("더 큰수를 입력해 주세요.");
            }else {
                System.out.println("작은수를 입력해주세요.");
            }
        }
    }
}

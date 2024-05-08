package StudyGroup.Java0508;
//복권 당첨 확인 프로그램 만들기
/*
프로그램에는 랜덤으로 생성되는 값 = 당첨 번호가 존재 하며(6개의 숫자),
유저가 값 6개를 입력한다.
조건.
(당첨 번호 끼리는 서로 값이 중복 되지 않아야 한다.)
1등 = 6개 모두 일치
2등 = 5개 일치
3등 = 4개 일치
나머지는 모두 꽝

//난수 생성법
Random rd = new Random();
        int randNum = rd.nextInt(10)+1; // 0 부터 입력한 (정수값-1) 범위에서 랜덤
 */
//1. 프로그램을 설계하시오.
//2. 코드를 작성하시오.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*1. 프로그램을 설계하시오.
로또번호와 유저의 로또번호와 맞는지 확인해주는 프로그램을 짜보자.

랜덤으로 숫자를 생성하는 Random 을 사용하여 6개의 숫자를 만들어 배열에 입력해준다.
번호 1~45 중에서만 생성되게 (45)+1;을 해주어 생성한다.

유저의 입력값을 받기위해 Scanner 을 사용하여 임의의 숫자 6개를 입력 받아 배열에 차례로 넣어주며,
로또의 번호 1~45 중에서만 입력을 받을 수 있게 해준다.
단, 중복 된 숫자를 입력받지 않게 중복이면 입력의 배열에 -1을 해서 제외 시켜준후 다시 입력할수 있게 만들어 준다.

랜덤으로 생성된 숫자와 입력받은 숫자를 반복으로 비교해야 하므로 for문을 사용하여 같은 숫자를 찾아준다.
 모두 같으면 1등, 5개만 일치한다면 2등, 4개가 일치하면 3등으로 그 외는 꽝의 문구가 나올 수 있게 if문을 사용하여 만들어준다.
 */
public class HW01 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 로또번호 6개를 입력하세요.");


        int[] rand = new int[6];
        int[] input = new int[rand.length];

        for (int i = 0; i < rand.length; i++) {
            int randNum = rd.nextInt(45) + 1;
            rand[i] = randNum;
        }
        System.out.println("로또 번호 : " + Arrays.toString(rand));

        for (int i = 0; i < rand.length; i++) {
            input[i] = sc.nextInt();
            for (int j = 0; j < i; j++) {
                if (1 <= input[i] && input[i] <= 45) {
                    if (input[i] == input[j]) {
                        i--;
                        System.out.println("다시 입력하시오");
                       // break; : 읽으면 시간이 단축되서 사용을 하지만, 굳이 안해도 되면 안써도 된다.
                    }
                } else {
                    i--;
                    System.out.println("1~45까지의 숫자를 입력해주세요.");
                    break;
                }
            }
        }
        System.out.println("입력한 로또번호 : " + Arrays.toString(input));
        /*(당첨 번호 끼리는 서로 값이 중복 되지 않아야 한다.)
        1등 = 6개 모두 일치
        2등 = 5개 일치
        3등 = 4개 일치
        나머지는 모두 꽝
*/
        int count =0 ;
        for (int i = 0; i < rand.length; i++) {
            if (input[i]==rand[i]){
                count++;
        }

            if (count==6) {
                System.out.println("1등입니다.");
                break;
            } else if (5 == count) {
                System.out.println("2등입니다.");
                break;
            } else if (4 == count) {
                System.out.println("3등입니다.");
                break;
            } else {
                System.out.println("꽝입니다.");
                break;
            }


        }


    }
}

package StudyGroup.Java0416;

import java.util.Scanner;

/*
스무고개 코드를 작성하고 질문의 답을 했을때 후보와 일치 하는지 확인하시오.
질문지
1. 당신의 키는 160cm 이상입니까?
2. 당신은 검은색 머리입니까?
3. 당신은 이성친구가 있습니까?
4. 당신의 나이는 12살보다 많습니까?
5. 당신은 반바지를 입었습니까?
후보 인포)
짱구 173cm 검은머리 여자친구X 19살 반팔 긴바지
맹구 135cm 갈색머리 여자친구O 16살 긴팔 반바지
철수 161cm 검은머리 여자친구0 18살 반팔 반바지
수지 160cm 빨간머리 남자친구X 14살 긴팔 긴바지
유리 162cm 탈색머리 남자친구0 17살 반팔 반바지

사용자의  답변지를 예 아니오로만 나오게 해보기
 */

// scanner 로 5가지의 질문을 받는다
// 키, 머리색, 이성친구 유무, 나이, 반바지에 대한 예, 아니오로 답을 받으면 그것에 대해 if문을 통해 추리해본다.
public class HW02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        System.out.println("2. 당신은 검은색 머리입니까?");
        String input2 = scanner.nextLine();

        System.out.println("3. 당신은 이성친구가 있습니까? [예, 아니오로 답해주세요]");
        String input3 = scanner.nextLine();

        System.out.println("4. 당신의 나이는 12살보다 많습니까? [예, 아니오로 답해주세요]");
        String input4 = scanner.nextLine();

        System.out.println("5. 당신은 반바지를 입었습니까? [예, 아니오로 답해주세요]");
        String input5 = scanner.nextLine();
        String a="예";
        String b="아니오";

        if (input.equals(a)){
            System.out.print("160cm이상이고 ");
        } else if (input.equals(b)) {
            System.out.print("160cm미만이고 ");
        }else {
            System.out.println("예,아니오로 답해주세요");
        }
        if (input2.equals(a)) {
            System.out.print("검은 머리이며 ");
        } else if (input.equals(b)) {
            System.out.print("밝은 색 머리이며 ");
        }
        if (input3.equals(a)) {
            System.out.print("이성친구가 있고 ");
        }else if (input.equals(b)) {
            System.out.print("이성친구가 없고 ");
        }else {
            System.out.println("예,아니오로 답해주세요");
        }
        if (input4.equals(a)) {
            System.out.print("12살 이상인 ");
        }else if (input.equals(b)) {
            System.out.print("12살 미만인 ");
        }else {
            System.out.println("예,아니오로 답해주세요");
        }
        if (input5.equals(a)) {
            System.out.print("반바지를 입은 사람은 ");
        }else if (input.equals(b)) {
            System.out.print("긴바지를 입은 사람은 ");
        }else {
            System.out.println("예,아니오로 답해주세요");
        }

    }
}

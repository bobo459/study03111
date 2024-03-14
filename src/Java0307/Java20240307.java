package Java0307;

import java.util.Arrays;
import java.util.Random;

public class Java20240307 {
    public static void main(String[] args) {
        //6. 아래 배열에서 입력받은 값보다 큰 수만 출력하시오
    /*    int[] intList1 = {1,2,3,4,5,6,7,8,9,10};
        Scanner scan = new Scanner(System.in);
        System.out.print("0~10까지 숫자를 입력해주세요 : ");
        int num = scan.nextInt();*/

   /*     for (int i =0; i < intList1.length; i++) {
            if (intList1[i] > num) {
                System.out.print(intList1[i] + " ");
            }
        }*/

      /*  //새로운 배열에 담기-앞의 값이 초기화가 되기때문에 숫자0이 대신 들어가진다.
        int[] intList2 = new int[intList1.length];
        int count = 0;
        for (int i=0; i < intList1.length; i++) {
            if (intList1[i] > num) {
                intList2[count] = intList1[i];
                count
            }
        }*/

/*        //새로운 배열에 담기 :ArrayList 사용하기 - 특정한값을 빼서 데이터를 보관할때 사용하는 배열
        ArrayList<Integer> intList3 = new ArrayList<Integer>();
        //클래스이름<테이터타입>
        for (int i=0; i < intList1.length; i++) {
            if (intList1[i] > num) {
                intList3.add(intList1[i]);
            }
        }
        System.out.print(intList3.toString());*/

        //7. 아래 배열의 총합과 평균을 출력
 /*       int[] numberList = {12,34,56,32,84,99,73,69};

        int sum = 0;       //소수점을 표현하고 싶으면 float 을 int 대신에 사용하면된다.
        for (int i=0; i < numberList.length; i++) {

            sum = sum + numberList[i];   // sum += numberList[i] = numberList[i+1]; 같지만 볶잡해진다
                                         // sum += numberList[i];
        }
        int average = sum / numberList.length;
            System.out.println(sum + " " + average);
*/
    /*    //8. 사용자로부터 문자열을 입력받아서 입력받은 문자열을 거꾸로 출력
        //예) hell 를 입력하면 olleh 를 출력
        Scanner scan = new Scanner(System.in);
        System.out.print("문자를 입력하세요 : ");
        String inputStr = scan.nextLine();

        char[] charList1 = inputStr.toCharArray();  //입력받은 문자열을 char 배열에 담음
        char[] charList2 = new char[charList1.length];  //거꾸로 저장할 새로운 배열을 만듦
        int index = charList2.length -1;   //새로운 배열의 위치를 나타내는 변수
        for (int i=0; i< charList1.length; i++) {
            charList2[index] = charList1[i];
            index = index -1;
        }
        //배열형태로 출력
        System.out.println(Arrays.toString(charList2));
        //문자열로 출력하기 위해 반복문 사용
        for (int i=0; i< charList2.length; i++) {
            System.out.print(charList2[i]);
        }
        System.out.println();

        */
        //난수생성법, Random 숫자 만드는 법
        Random rd = new Random();    //random 이라는 클래스를 만들기 위해 = new random 새로 렌덤을 만듬
        int ranDNum = rd.nextInt(10);  //플롯을 만들 필요가 없다 랜덤을 int를 써서 플롯으로 만들기때문
                                       //0부터 입력한 (정수값 -1) 범위에서 랜덤. 10을 넣으면 0~9까지 랜덤으로 나옴
 /*       int ranDNum = rd.nextInt(10)+1; //만약 1~10이 나오게 만들고 싶으면 뒤에 +1을 하면 된다*/
        System.out.println(ranDNum); //

        //9.1~45까지의 랜덤한 정수를 length가 6인 배열에 넣으시오.
        // 단, 중복 숫자는 허용하지 않음!! 로또 만들기
        //랜덤넘버를 만들면 비교했을때 같지 않게 만들기 tip.2step 랜덤값만들고, 나온 값과 중복이 안되는 코드를 짜기
/*
        Random rd2 = new Random();
        int ranDNum2 = rd2.nextInt(45)+1;
        System.out.print(ranDNum2 + " ");
        int ranDNum3 = rd2.nextInt(45)+1;
        System.out.print(ranDNum3 + " ");
        int ranDNum4 = rd2.nextInt(45)+1;
        System.out.print(ranDNum4 + " ");
        int ranDNum5 = rd2.nextInt(45)+1;
        System.out.print(ranDNum5 + " ");
        int ranDNum6 = rd2.nextInt(45)+1;
        System.out.print(ranDNum6 + " ");
        int ranDNum7 = rd2.nextInt(45)+1;
        System.out.print(ranDNum7 + " ");
*/
//힌트 : 포문안에 포문이 필요 2중포문이 필수. j의 조건이 i보다 작은 숫자를 비교한다.
        //랜덤이 겹치지 않을 때까지 랜덤으로 돌리겠다. 단 0번부터 다시 돌려야하기에 포문이 이더레이터 값을 다른 정수값으로 바꿔야한다.
/*
        Random rd2 = new Random();
        int ranDNum2 = rd2.nextInt(45)+1;
*/
        Random randClass = new Random();
        int[] rottoList = new int[6];
       /* for ( int i=0 ; i <rottoList.length; i++) {
            int temp = randClass.nextInt(6)+1;
            for (int j=0; j<i; j++) {
                if (rottoList[j] == temp) {
                    temp = randClass.nextInt(6)+1; //다시 뽑음. j를 0으로 만들면 다시 돌림
      *//*              j = 0;   //잘도는것 같지만 오류가 난다. 첫값과 끝값이 항상 같게 나오게 된다.*//*
                    j = -1;

                }
            }
            rottoList[i] = temp;
        }
        System.out.println(Arrays.toString(rottoList));*/


        //중복 코드가 들어가면 안됨. 지적된는 부분이라 주의해줘야한다. 중복을 제거한 아래코드가 좋은 코드이다
           for ( int i=0 ; i <rottoList.length; i++) {
            rottoList[i] = randClass.nextInt(45)+1;
            for (int j=0; j<i; j++) {
                if (rottoList[j] == rottoList[i]) {
                  /*  i--;*/ //이것보단 바로 아래에 있는 식이 좀더 나음.
                    i = i -1;

                }
            }
        }
        System.out.println(Arrays.toString(rottoList));


    }
}

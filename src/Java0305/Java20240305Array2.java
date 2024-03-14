package Java0305;

import java.util.Arrays;
     //자바 및에 유틸이 있으니 가져오라는 말

public class Java20240305Array2 {
    public static void main(String[] args) {
        //기본자료형의 복사 ==> 값 복사
        int a = 3;
        int b = a;
        System.out.println(a + " " + b);  //3, 3
        b = 5;
        System.out.println(a + " " + b);  //3, 5

        //참조자료형의 복사 ==> 참조복사 또는 주소복사(주소복사라는 말은 선생님이 만든말이지만 맞는 말임)
        int[] intList1 = {3,4,5};
        int[] intList2 = intList1;
        System.out.println(Arrays.toString(intList2));   //패키지-다른이가 만들어놓은거라 인포트를 해줘야한다
        intList2[0] = 10;
        System.out.println(Arrays.toString(intList2));   //
        System.out.println(Arrays.toString(intList1));

        //배역과 for문의 사용
        //조건식에 배열의 갯수(length)를 사용함
        for (int i=0;  i<intList2.length; i++){
            System.out.println(intList2[i]);
        }

     /*   //위에 간단하게 한줄로 쓰고 싶지 않음 밑에 있는 길고 복잡하게 적기- 사용할 일은 없을것
        for (int i=0; i<3; i++) {
            if (i == 0) {
                System.out.print("[" + intList2[i]);
            } else if (i == 2) {
                System.out.print(", " + intList2[i] + "]");
            } else {
                System.out.print(", " + intList2[i]);
            }
        }*/

        // < String 클래스 >
        String str1 = new String("안녕");
        String str2 = str1;
        str1 = "안녕하세요";
        System.out.println(str1);    //특장 1.리터럴형태로 값을 변경시, 새로운 메모리 위치에 생성! => 리터럴 : new 이용없이 직접 단어를 생성
        System.out.println(str2);    //new가 붙으면 무조건 메모리 생성.언제나 새로운 메모리 위치를 생성
                                     //

        str1 = new String("안녕하세요");

        //특징 2. "리터럴" 형태로 생성 시 동일한 값을 공유! 선언할때 리터럴과 new로 만든게 다르다.
        String str3 = "Start";  //=상수값과 동일함. 컴파일타임에 만들어진다.
        String str4 = "Start";  //같은 값이 있어서 메모리에 똑같은 파일을 만들지 않는다. 동일시 생각함
        String str5 = new String("Start");    //런타임에 만들어준다. 언제나 새 파일로 만들어짐.
        System.out.println(str3 == str4);
        System.out.println(str4 == str5);

        //자바는 compile언어 1.complie time 실행여부와 상관없이 코드를 모두 확인한다.
        // 2. run Time  모든 코드가 실행이 되는건 아니다. 메스드 호출이 없거나 if로 어디는 실행되고 안되는 부분이 있다.



    }
}

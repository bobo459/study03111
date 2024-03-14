package Java0305;

import java.util.Arrays;

public class Java20240305Array {
    public static void main(String[] args) {
        //배열 선언법
        int[] intArray1;    // 자바 스타일!!!- 이걸 사용하면 됨
        int intarray2[];    // 대괄호 밑에 물결 보면 내용이 나온다. c언어 스타일이고 쓰이지 않음

        //배열 객체 생성
        int[] intArray3 = new int[5]; //메모리에 5개의 빈 저장소를 만듬 (int는 4바이트 니까 5개면 20바이트가 된다)
          //배열의 선언   =  생성
        //배열 객체에 값 입력
        intArray3[0] = 10;     //빈저장소에 값을 만든것 , 입력
        intArray3[1] = 20;
        intArray3[2] = 30;
        intArray3[3] = 40;
        intArray3[4] = 50;
        for (int i=0; i<5; i++) {
            System.out.print(intArray3[i] + " ");
        }
        System.out.println();

        //배열의 선언, 생성, 입력을 한번에 수행하는 코드
        int[] intArray4 = {10,20,30,40,50};
          //배열의 선언   =  생성,입력을 한번에 함
        for (int i=0; i<5; i++) {
            System.out.print(intArray4[i] + " ");
        }
        //배열의 초기화
        //배열을 선언, 생성하고, 입력값을 넣지 않는 경우, 자동으로 초기값이 입력됨
        int[] intList = new int[3];               //정수 0
        float[] floatList = new float[3];         //실수 0.0 소수점이 필요한 환경일때 사용
        boolean[] booList = new boolean[3];       //true,false 의 초깃값은 false- 참이나 거짓이나 둘중하나이다
        char[] charList = new char[3];            //알수없는 문자,알파펫,한글등
        String[] strList = new String[3];         //null = 숫자와 문자를 구분하지 않는 경우 -정보값이 없을때
        System.out.println(Arrays.toString(intList));  // Arraays.toString = 변수의 초깃값을 알려주는 에피소드
        System.out.println(Arrays.toString(floatList));
        System.out.println(Arrays.toString(booList));
        System.out.println(Arrays.toString(charList));
        System.out.println(Arrays.toString(strList));

    }
}

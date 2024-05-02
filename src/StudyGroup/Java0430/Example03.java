package StudyGroup.Java0430;

import java.util.Arrays;
import java.util.Objects;

/* 참고자료 0430(3) 파일 참고해서 코드 작성

1. 모든 문장을 하나의 변수에 저장 후 출력하시오.
2.str1의 길이를 구하시오.
3.str2에서 처음나오는 숫자의 인덱스 번호를 구하시오.(단 앞에서부터 count 하는 것을 를 기본으로 함)
4. 1번의 변수에 a가 몇개 들어있는지를 구하시오.

 */
public class Example03 {
    public static void main(String[] args) {
        String str1 = "Hello, My name is Alex, nice to meet you.";
        String str2 = "I am 26. but I'm still student.";
        String str3;
        String str4;
        String str5;

        str3 = str1.concat(str2);
        System.out.println("1번 : " + str3);

        str4 = String.valueOf(str1.length());
        System.out.println("2번 : " + str4);

        str5 = String.valueOf(str2.indexOf("26"));
        System.out.println("3번 : " + str5);

/*        String[] test;
        int testLength = 0;
        test = str3.split("a");
        System.out.println(Arrays.toString(test));   //a를 기준으로 분할 해서 3분할이 됬다.
        testLength = test.length;
        System.out.println(testLength);              //분할된 배열 길이를 구해줌.*/

        var c = str3.split("a").length - 1;      //분할이 a를 기준으로 앞뒤 분할이라 -1를 해서 뒤에 분할을 빼준다.
        System.out.println("4번 : " + c);            //ex) --- a --- a --- 으로 된것을 -1을 해서 --- a --- a 로 만들어준 것


    }
}

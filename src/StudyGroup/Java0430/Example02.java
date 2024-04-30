package StudyGroup.Java0430;
/* 참고자료 0430(2) 파일 참고해서 코드 작성

1. 참고자료 0430(2) 모습을 출력하시오.
[조건 : 메서드 사용]
2. str1의 '!'를 '하세요'로, '나는'을 '저는'으로 변경하여 출력하시오.
3. 안녕하세요. 나는 '김개똥' 입니다!만나서 반갑습니다^^ //를 출력하시오.
4.str3의 도메인(naver.com)과 아이디(조건:소문자)를 출력하시오.
5.뒤죽박죽인 str4에서 특수문자를 모두 제외하고 출력하시오.

 */
public class Example02 {
    public static void main(String[] args) {
        String str1 = "안녕! 나는 '김개똥'입니다";
        String str2 = "만나서 반갑습니다^^";
        String str3 = "kgDD123@naver.com";
        String str4 = "he!lloxx@ni*ce$xxtoxx!mee@txxyou";

        str1 = str1.replace("!","하세요").replace("나는","저는");
        str2 = str1.replace("저는","나는").concat(". "+str2);
        str3 = str3.toLowerCase();
        str4 = str4.;

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        //System.out.println(str4);

/*        String str10 = "안녕! 나는 '김개똥'입니다!";
        char[] c = new char[10];
        c = str10.toCharArray();
        str10.indexOf("!");
        System.out.println();
        System.out.println( c);
        System.out.println( str10);*/


    }
}

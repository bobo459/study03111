package Java0326Example2;

public class StrSumExample {

    // 문자열 "12345"의 각 자리에 있는 숫자를 더하는 코드를 완성하시오
    public static void main(String[] args) {
        String str = "12345";   //charat : 문자 하나만 읽어주는 기능이 있는 메서드가 있음
        int sum = 0;

/*        for (int i=0; i<str.length(); i++){
            sum =sum + str.charAt(i);  //유니코드로 변환되서 49~55까지를 더해서 계산해주므로 255 값이 나온다.
        }*/

/*
        //1번째 방법
        for (int i=0; i<str.length(); i++){
            sum =sum + str.charAt(i)-'0';  //'0' 문자 유니코드가 48값이므로 1은 49 값이라 49-48을 하므로 1의 값으로 인식이 된다.
        }
*/

        //2번째 방법
        for (int i=0; i<str.length(); i++) {
//            sum =sum + str.charAt(i)-'0'; //하지만 개발자들은 이코드를 많이 사용한다.
//            sum + sum + Integer.valueOf(String.valueOf(str.charAt(i)));
        }

        //3번째 방법
        for (int i=0; i<str.length(); i++){
            sum =sum + Character.getNumericValue(str.charAt(i)); //자바에서 추천하는 방법
        }
//        System.out.println(str.charAt(0));
//        System.out.println(String.valueOf(str.charAt(0))); //문자 1을 문자 그대로 1로 인식시킨것
//        System.out.println(Integer.valueOf(str.charAt(0))); //문자 1을 정수로 변형시킨것으로 유니코드 값을 보여줌


        System.out.println("합계는 " + sum); // 15
    }
}

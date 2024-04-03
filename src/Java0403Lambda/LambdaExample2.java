package Java0403Lambda;

import java.util.ArrayList;
import java.util.List;

interface Condition{
    boolean test(String str);  //리턴  메서드(림다식)
}
public class LambdaExample2 {
    public static void main(String[] args) {
        //length 길이가(단어 길이가) 5개 이상인것만 true 설정

        List<String> strubgs = new ArrayList();
        strubgs.add("apple");
        strubgs.add("banana");
        strubgs.add("grape");
        strubgs.add("orange");
        strubgs.add("kiwi");

        //길이가 5 이상인 문자열을 필터링 하는 조건
        System.out.println("길이가 5 이상인 문자열 : ");
/*        filterAndPrint(strubgs, (str) ->{ return str.length() >5; } *//*'람다식'*//* );*/
        filterAndPrint(strubgs, (str) -> str.length() > 5 );
        //문자열이 'a'로 시작하는 아이템을 필터링하는 기능
        System.out.println("a로 시작하는 문자열 : ");  //장점은 filterAndPrint 수정이 없어도 된다.
       filterAndPrint(strubgs,(str)-> str.startsWith("a"));
    }

    public static void filterAndPrint(List<String> items, Condition condition){ //함수형 인터페이스 메서드
        //일반적인 for loop 사용 예시(for문을 사용한 예시)
        for (String item : items) {
            if (condition.test(item)){
                System.out.println(item);
            }
        }
        //함수형 프로그래밍으로 반복문을 처리하는 예시(결과는 위와 동일)
        items.stream().filter(condition::test).forEach(System.out::println);
    }


}

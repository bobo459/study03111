package Java0327P.Java0327Example;

public class Example2 {
    public static void main(String[] args) {

        // 문제 2. int 타입의 변수 num이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하세요.
        // num이 12345 이면 , ‘1+2+3+4+5’ 15 의 결과인 를 출력
        int num = 12345;
        int sum = 0;

        //수중이답
        while (num>0){
            sum = sum + num%10;
            num = num/10;
        }

        //선생님답
        while (num>0){
            sum += num%10; //숫자를 일자리로 각각 나누어준다. 인티져라 소수점은 없다.
            num = num/10;
        }


        System.out.println("sum=" + sum); //15
    }
}


package Java0403Lambda;

import java.security.PublicKey;

interface InCalculator { //정수계산기
    int calculate(int a, int b);
}
public class LambdaExample1 {
    public static void main(String[] args) {
        //calculate 함수의 정의 = 두개의 매개변수의 덧셈
        InCalculator adder = (a,b)-> a + b; //calculate 함수의 정의.
        int result = adder.calculate(5,3);  //구식방법
        System.out.println(result);


        /*    public static void printResult(int x, int y, String str){ //만약 계산법만 던져줄수 있다면 어떨까?
        if (str.equals("plus")){
            System.out.println(x+y);
        }
    */
        /*printResult(4,6,"plus"); // 목적: 4,6을 어떨때는 +,-,*,/를 해주고 싶을때 */
        printResult(4,6,(x,y)->x*y*10);
        printResult(7,8,(x,y)->x*y/10);
    }

    public static void printResult(int x, int y, InCalculator calculator){
            System.out.println("Result : "+calculator.calculate(x,y));

    }
}

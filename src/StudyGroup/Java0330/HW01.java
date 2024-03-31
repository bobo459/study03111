package StudyGroup.Java0330;

public class HW01 {
    public static void main(String[] args) {
            /*1. 변수 a,b,c,d,e,f의 초기값은
    a = 100
    b = hello
    c = 50.50
    d = 나는 8살이야
    e = 99.999999
    f = 180
    이며 출력시 a는 a와f의 합, b는 goodbye 가 출력되게 코드를 작성하시오.*/

        int a = 100;
        String b = "hello";
        Float c = 50.50f;
        String d = "나는 8살이야";
        double e = 99.999999;
        int f = 180;

        b = new String("goodbye");

        System.out.println(a+f);
        System.out.println(b);
    }
}

package StudyGroup.Java0522;

import java.util.Scanner;
class Elementary{
    public int sum(int input , int input02){
        int sum = input +input02;
        return sum;
    }
    public int sub(int input , int input02){
        int sub = input - input02;
        return sub;
    }
    public double mul(double input , double input02){
        double mul = input * input02;
        return mul;
    }
    public double div(double input , double input02){
        double div = input / input02;
        return div;
    }
}
public class HW01 {
    //유저에게 두 개의 숫자를 입력받아 사칙연산을 수행하시오.
    //4개의 사칙연산을 따로따로 모두 실행하시오.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int input02 = sc.nextInt();

        Elementary elementary = new Elementary();

        elementary.sum(input,input02);
        elementary.sub(input,input02);
        elementary.mul(input,input02);
        elementary.div(input,input02);

        System.out.println(elementary.sum(input,input02));
        System.out.println(elementary.sub(input,input02));
        System.out.println(elementary.mul(input,input02));
        System.out.println(elementary.div(input,input02));

    }
}

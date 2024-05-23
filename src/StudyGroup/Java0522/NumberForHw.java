package StudyGroup.Java0522;

import java.util.Scanner;

public class NumberForHw {
    public int sum(int input, int input02) {
        int sum = input + input02;
        return sum;
    }
    public int sub(int input, int input02) {
        int sub = input - input02;
        return sub;
    }
    public double mul(double input, double input02) {
        double mul = input * input02;
        return mul;
    }
    public double div(double input, double input02) {
        double div = input / input02;
        return div;
    }

    public String digit(int input) {
        if (0 <= input && input < 10) {
            return "1의 자리 입니다.";
        } else if ( input < 100) {
            return "10의 자리 입니다.";
        } else if (input < 1000) {
            return "100의 자리 입니다.";
        }
        return "범위를 벗어났습니다.";
    }

    public int[] maxAndMin01(int[] num) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            int input = sc.nextInt();
            num[i] = input;
        }
        return num;
    }

    public int[] maxAndMin02(int[] num) {
        int temp = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = num.length - 1; j > i; j--) {
                if (num[i] >= num[j]) {
                    temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                }
            }
        }return num;
    }
}

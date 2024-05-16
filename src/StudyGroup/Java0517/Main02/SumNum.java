package StudyGroup.Java0517.Main02;

import java.util.Scanner;

public class SumNum {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int input2 = sc.nextInt();
    int sum =0;
    int sub =0;
    int num =0;
    public String sum() {
        sum = input + input2;
        return input +" + " + input2 +" = "+ sum;
    }
    public String sub() {
        sub = input - input2;
        return input +" - " + input2 +" = "+ sub;
    }
    public String num() {
        num = sum +sub;
        return sum +" + " + sub +" = "+ num;
    }
}

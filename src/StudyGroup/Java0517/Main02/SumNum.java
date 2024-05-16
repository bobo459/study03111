package StudyGroup.Java0517.Main02;

import java.util.Scanner;

public class SumNum {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int input2 = sc.nextInt();
    int sum =0;
    int sub =0;
    int num =0;
    public int sum() {
        sum = input + input2;
        return sum;
    }
    public int sub() {
        sub = input - input2;
        return sub;
    }
    public int num() {
        num = sum +sub;
        return  num;
    }
}

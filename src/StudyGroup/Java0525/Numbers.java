package StudyGroup.Java0525;

import java.util.Scanner;

public class Numbers {
    //문제 1. 사용자에게 원하는 숫자 10개를 입력받는 메서드를 구현하시오.
    // => 위 메소드를 이용해 2개의 배열을 만드시오. 배열 이름은 a와 b로 함
    //문제 2. 총 합을 구히는 메서드 / 최대값을 구하는 메서드 / 최소값을 구히는 메서드를 구현하시오.
    // =>위에서 구현한 메소드를 호출하여 a,b 각 배열의 총합, 최대값, 최소값을 구하시오.
    //문제 3. 두 배열을 비교하는 메서드를 구현
    //(특정 값을 구하는 메서드를 문제2번에서 만들었기 때문에 3번 메서드에선 그 메서드들을 호출해 사용해 보세요.)
    // 3-1. 두 배열의 총 합을 비교해 a 배열이 큰 경우 true b 배열이 큰 경우 false 를 리턴하시오.
    // 3-2. 두 배열의 최대값을 비교해 a 배열이 큰 경우 true b 배열이 큰 경우 false 를 리턴하시오.

    public int[] inputNum(int[] num) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int input = scanner.nextInt();
            num[i] = input;
        }
        return num;
    }
    public int sum(int[] num){
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }return sum;
    }
    public long min(int[] num){
       int min = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
       return min;
    }
    public long max(int[] num){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
    public boolean comparisonSum(int sumA , int sumB){
        if(sumA>sumB){
           return true;
        }else {
            return false;
        }
    }
    public boolean comparisonMax(int maxA , int maxB){
        if(maxA>maxB){
            return true;
        }else {
            return false;
        }
    }

}

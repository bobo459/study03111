package StudyGroup.Java0517;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    Random rd = new Random();
    int[] random = new int[6];

    Scanner scanner = new Scanner(System.in);
    int[] userNum = new int[random.length];

    int count =0;

    public int[] randomLotto(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(45) + 1;
            for (int j = 0; j < i ; j++) {
                if (a[j] == a[i]) {
                    i--;
                }
            }
        }
        return a;
    }

    public int[] rangeNum(int[] a) {
        int num = 0;
        for (int i = 0; i < a.length ; i++) {
            for (int j = a.length-1; j > i; j--) {
                if (a[i] >= a[j]) {
                    num = a[j];
                    a[j] = a[i];
                    a[i] = num;
                }
            }
        } return a;
    }

    public int[] userLotto( int[] a ) {
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
            if (1>a[i] || a[i]>45){
                i--;
            }
            for (int j = 0; j < i; j++) {
                if (a[j] == a[i]){
                    i--;
                }
            }
        }
        return a;
    }

    public String ranking() {
        for (int i = 0; i < random.length; i++) {
            for (int j = 0; j < random.length; j++) {
                if (userNum[i] == random[j]){
                    count++;
                }
            }
        }
        if (count==6){
            return "1등입니다.";
        } else if (count==5) {
            return "2등입니다.";
        }else if (count==4) {
            return "3등입니다.";
        }else {
            return "꽝 입니다.";
        }
    }
}
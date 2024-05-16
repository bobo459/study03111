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

    public int[] randomLotto() {
        for (int i = 0; i < random.length; i++) {
            random[i] = rd.nextInt(45) + 1;
            for (int j = 0; j < i ; j++) {
                if (random[j] == random[i]) {
                    i--;
                }
            }
        }
        return random;
    }

    public int[] rangeNum() {
        int num = 0;
        for (int i = 0; i < random.length ; i++) {
            for (int j = random.length-1; j > i; j--) {
                if (random[i] >= random[j]) {
                    num = random[j];
                    random[j] = random[i];
                    random[i] = num;
                }
            }
        } return random;
    }

    public int[] userLotto( ) {
        for (int i = 0; i < random.length; i++) {
            userNum[i] = scanner.nextInt();
            if (1>userNum[i] || userNum[i]>45){
                i--;
            }
            for (int j = 0; j < i; j++) {
                if (userNum[j] == userNum[i]){
                    i--;
                }
            }
        }
        return userNum;
    }

    public String ranking() {
        for (int i = 0; i < random.length; i++) {
           if (userNum[i] == random[i]){
               count++;
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
package StudyGroup.Java0405;
//SKY반에는 학생 A,B,C,D,E,F,G가 있고 각 학생의 점수는 80,45,29,78,64,98,57 이다.
//SKY반 학생들의 성적을 하나의 배열로 보관하고,
//SKY반 학생의 평균,최고점,최저점을 구하시오.

import Java0326P.Java0326.A;

import java.util.Arrays;

public class HW03 {
    public static void main(String[] args) {
        int sum = 0;
        float mul = 0;
        int[] sky = {80,45,29,78,64,98,57};
        String [] skyName = {"A","B","C","D","E","F","G"};
        int a= 0;
        int b= 0;
        int c= 0;
        int d= 0;
        String q = null;
        String w= null;
        String e= null;
        String r= null;

        for (int i = 0; i < sky.length; i++) {
            sum = sum +sky[i] ;
            mul = (float) sum / sky.length;
        }

        for (int j = 0; j < sky.length; j++) {
            for (int k = 0; k < sky.length-j-1 ; k++) {
                skyName[k].equals(sky[k]);
               if (sky[k]<sky[k+1]){
                   a = sky[k+1];
                   sky[k+1] = sky[k];
                   sky[k] = a;
                   b=a;
                           if (skyName[k] == skyName[k]){
                               q = skyName[k+1];
                               skyName[k+1] = skyName[k];
                               skyName[k] = q;
                               w=q;
                           }
               }
            }
        }
        for (int j = 0; j < sky.length; j++) {
            for (int k = 0; k < sky.length-j-1 ; k++) {
                if (sky[k]>sky[k+1]){
                    c = sky[k+1];
                    sky[k+1] = sky[k];
                    sky[k] = c;
                    d=c;
                }
                if (skyName[k] == skyName[k]){
                    e = skyName[k+1];
                    skyName[k+1] = skyName[k];
                    skyName[k] = e;
                    r=e;
                }
            }
        }
        System.out.println("sky반 학생의 평균은 "+mul+ " 점");
        System.out.println("sky반 학생의 최고점은 " +q +" 학생의 " + b+ " 점");
        System.out.println("sky반 학생의 최저점은 "+r +" 학생의 " +d+ " 점");


    }
}

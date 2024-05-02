package StudyGroup.Java0502;

import java.util.Arrays;

//[배열의 최대값과 최소값 찾기]
//배열의 최대값과 최소값을 찾는 프로그램을 작성하시오.
public class Example01 {
    public static void main(String[] args) {
        //int[] str1= new int[]{100,54,6,78,98,74,85,65,24,26};  ///str1과 비교하는게 아니라 str2와 비교해서 계속 비교시켜줘야함
        int[] str1 = new int[]{100, 54, 6, 78};
        int str2 = 0;
        for (int i = 0; i < 3; i++) {
            if(str1[i] < str1[i+1]){
                str2 = str1[i+1];
            } else {
                str2 = str1[i];
            }
        } System.out.println(str2);
    }
}


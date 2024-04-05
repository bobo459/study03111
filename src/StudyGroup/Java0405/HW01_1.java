package StudyGroup.Java0405;

import java.util.Arrays;

//arraySort 배열엔 {2,50,14,2,74,12,57,42,1,78,63,59,27} 이 저장되어있다.
//배열 속 숫자들을 작은 순서부터 나열 하시오.
public class HW01_1 {
    public static void main(String[] args) {
        int[] arraySort =  {2,50,14,2,74,12,57,42,1,78,63,59,27};
        int a =0;

        for (int i = 0; i < arraySort.length; i++) {
            for (int j = 0; j < arraySort.length-i-1; j++) {
                if (arraySort[j] > arraySort[j+1]){
                    a=arraySort[j];
                    arraySort[j] = arraySort[j+1];
                    arraySort[j+1] = a;
                }
            }
        }System.out.println(Arrays.toString(arraySort));




    }

}

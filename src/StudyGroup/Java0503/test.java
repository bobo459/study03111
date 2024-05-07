package StudyGroup.Java0503;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] array = {54, 87, 14, 25, 97, 5, 41, 4, 627, 85, 41, 365};
        int tmp = 0;

        for (int i = 0; i < array.length; i++) {     //arry 길이 만큼 계산하겠다.
            for (int j = 1; j < array.length; j++) { //arry 1번 인덱스 위치부터 시작하겠다
                if (array[i] < array[j]) {           //값의 1번째 인덱스 값과 그 후 값을 비교해서 j값이 크다면 입력하기
                    tmp = array[j];
                    array[j] = array[i];
                    array[i]=tmp;
                }
            }

        }System.out.println(tmp);
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}

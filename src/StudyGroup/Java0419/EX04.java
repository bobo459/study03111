package StudyGroup.Java0419;

import java.util.Arrays;

// 1부터 10까지의 숫자가 저장되어 있는 배열이 있다.
//  이 배열의 인덱스끼리의 합이 50을 넘어가는 지점의 인덱스 번호를 출력하시오.
public class EX04 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;


        for (int i = 0; i < a.length; i++) {

            sum = sum +a[i];

            System.out.println("총 합 : "+sum);
            if (50<=sum){
                a[i] = i;
                System.out.println("합이 50이 넘었을때의 인덱스 번호 : "+ a[i]);
                break;
            }
        }

    }
}

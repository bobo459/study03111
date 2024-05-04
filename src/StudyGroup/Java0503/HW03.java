package StudyGroup.Java0503;

import java.util.Arrays;

/*문제3. 두 개의 배열을 하나의 배열로 합치시오.
        [1,2,3,4,5,6,7,8,9,10]
        [가,나,다,라,마,바,사,아,자,차]
결과 : [1,가,2,나,3,다 …9,자,10,차]*/
public class HW03 {
    public static void main(String[] args) {
        String[] a = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] b = {"가", "나", "다", "라", "마", "바", "사", "아", "자", "차"};
      //새로운 배열에 각 A 배열, B배열의 인덱스를 번갈아가면서 넣어준다.
        //i가 +1하면서 값이 올라가기에 a와b에 새로운 변수를 설정해서 +1씩 따로 올려줘야한다.
        String[] c = new String[a.length+b.length];
        int num = 0;
        int num1 = 0;

        for (int i = 0; i < a.length+b.length; i++) {
            if (i%2==0){
            c[i] = a[num] ;
                num++;
            }else {
                c[i] = b[num1];
                num1++;
            }
        }
        System.out.println(Arrays.toString(c));
    }
}


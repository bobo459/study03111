package StudyGroup.Java0426;

import java.util.Arrays;
import java.util.Scanner;

//각 배열의 크기는 100으로 하며,
// a배열에는 1부터 100까지, b배열에는 101부터 200까지, c배열에는 201부터 300까지의 숫자를 저장한다.
// 유저에게 값을 입력 받은 뒤 그 배열의 값이 어느배열에 몇번째 인덱스번호에 저장되어있는지를 출력하시오.
public class HW05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 1~300중 적어주세요 : ");
        int input = sc.nextInt();
        int[] a = new int[100];
        int[] b = new int[100];
        int[] c = new int[100];

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i]+i;    // a[i] = i+1; i가 0부터 시작해야하는데, 배열[]에 i를 더하는게 아닌 배열 안에 i+1 한 값을 대입해서 넣어줘야한다.
            b[i] = 101+i;
            c[i] = 201+i;
            if (input == a[i]){
                System.out.println(i);  //알기 쉽게 s.o.p 안에 ("a배열, "+i+"번째 인덱스") 의 내용을 적어줘야한다.
            }
            else if (input == b[i]){
                System.out.println(i);
            }
            else if (input == c[i]){
                System.out.println(i);
            }
        }

    }
}

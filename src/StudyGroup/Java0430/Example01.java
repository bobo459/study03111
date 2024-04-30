package StudyGroup.Java0430;

import java.util.Arrays;

/* 참고자료 0430(1) 파일 참고해서 코드 작성

1.정방 배열 만들기
2.비정방 베열 만들기
포문쓰기
 */
public class Example01 {
    public static void main(String[] args) {
        int[][] a = new int[4][10];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (a[i]==a[0]) {
                    a[i][j] = a[i][j] + 1  + j;
                }else if (a[i]==a[1]){
                    a[i][j] = a[i][j] + 10 + j*10;
                }else if (a[i]==a[2]){
                    a[i][j] = a[i][j]+10 - j;
                }else if (a[i]==a[3]){
                    a[i][j] = a[i][j] +(j+1)*2;
                }
            }
        }System.out.println("1번 문제의 답");
        System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(a[1]));
        System.out.println(Arrays.toString(a[2]));
        System.out.println(Arrays.toString(a[3]));

        System.out.println("2번 문제의 답");
        int[][] b = new int[4][];
        b[0] =new int[10];
        b[1] =new int[4];
        b[2] =new int[6];
        b[3] =new int[3];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (b[i]==b[0]) {
                    b[i][j] = b[i][j] + 1  + j;
                }else if (b[i]==b[1]){
                    b[i][j] = b[i][j] + 10 + j*10;
                }else if (b[i]==b[2]){
                    b[i][j] = b[i][j]+10 - j;
                }else if (b[i]==b[3]){
                    b[i][j] = b[i][j] +(j+1)*2;
                }
            }
        }
        System.out.println(Arrays.toString(b[0]));
        System.out.println(Arrays.toString(b[1]));
        System.out.println(Arrays.toString(b[2]));
        System.out.println(Arrays.toString(b[3]));


    }
}

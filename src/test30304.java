public class test30304 {
    public static void main(String[] args) {

/*

        //배열의 값 대입 방법1 159p
        int[] array1 = new int[3];
        array1[0] =3;
        array1[1] =4;
        array1[2] =5;
        System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);

        int[] array2;
        array2 = new int[3];
        array2[0] = 3;
        array2[1] = 4;
        array2[2] = 5;
        System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);

        //배열의 값 대입 방법2
        int[] array3 = new int[]{3,4,5,};
        System.out.println(array3[0] + " " + array3[1] + " " + array3[2]);

        int[] array4;
        array4 = new int[]{3,4,5};
        System.out.println(array4[0] + " " + array4[1] + " " + array4[2]);

        //배열의 값 대입 방법3
        int[] array5 = {3,4,5};
        System.out.println(array5[0] + " " + array5[1] + " " + array5[2]);


        //연습문제

        System.out.println("안녕" + 5.8);
        System.out.print(3 + 5 + "방가" + 4+ 2);
        System.out.printf(" %s:%d", "홍길동", 15);
*/

/*
        //110p
        if (5 > 3) {
            System.out.println("출력1");
        }

        if (5 < 3) {
            System.out.println("출력2");
        }

        int a = 3;
        if ( a == 3 );{
            System.out.println("출력3");
        }

        boolean b = false;
        if (b) {               // b = 만약 b가 거짓이면 출력안함. 이유는 if 단일사용일때 참일때만 출력
            System.out.println("출력4");
        }
   */
/*     boolean b = false;
        if (!b) {             // b = 거짓은 거짓이다. 그러므로 참이다
            System.out.println("출력4");
        }
    */

/*

        int h = 5;
        int p = 10;
        System.out.println( 15 == h + p != !true);
*/

        if (3 > 5){
            System.out.println("안녕");  //출력안됨
            System.out.println("방가");  //출력안됨
        }

        if (3 > 5) {
            System.out.println("안녕");  }//출력안됨
            System.out.println("방가");  //출력됨

        if (5 > 3) {
            System.out.println("실행1");
        } else {
            System.out.println("실행2");
        }
        int a, b;
        a = 5; b = 0;
        if (a > 5) {
            b = 10;
        } else {
            b = 20;
        }
        System.out.println(b);
        
        //삼항 연산자로 변환
        a = 5; b = 0;
        b = (a > 5) ? 10 : 20;
        System.out.println(b);


    }
}

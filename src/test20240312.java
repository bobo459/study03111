public class test20240312 {
    public static void main(String[] args) {

        int a;
        for (a=0; a<3; a++){
            System.out.print(a+" ");
        }
        System.out.println();

        for (int i=0; i<3; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i=0; i<100; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i=10; i>0; i--) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i=0; i<10; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i=0, j = 0; i<10; i++,j++) {
            System.out.print(i+j+" ");
        }
        System.out.println();

        int num=0;  //선언문을 밖으로 내보냄으로써 for문 밖의 print 에도 변수를 사용할 수 있게 만들어줌
        int sum=0;
        for (num=0,sum=0; sum<100; ){  //int는 빼고 초기값을 한번 살려줄려 남긴것
            sum += num;
            num++;
       }
        System.out.println((num-1) + "까지의 합 = "+ sum ); //최종값만을 출력할려면 for문안이 아닌 밖에 내보내는것

/*

        int num = 0, sum = 0;
        while (sum <100) {
            sum+=num;
            num++;

            System.out.println(sum);
        }
        System.out.println((num-1) + "까지의 합 = "+sum);

*/

        for (int c = 0; c<10; c++) {
            System.out.println(c);
        }

        int b =0;
        while (b<10) {
            System.out.println(b);
            b++;
        }

    }

}

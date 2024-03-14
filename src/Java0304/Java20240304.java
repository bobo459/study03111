package Java0304;

public class Java20240304 {
    public static void main(String[] args) {
       //for 반복문의 기본형
        for (int i = 0; i < 10; i = i+1) {
            //   초기시   조건식   증감식
            System.out.println(i);
        }
        //무한루프
        //조건식이 false가 될 수 있는지 여부를 반드시 확인!!!//
  //      for (int i =0; i >= 0; i++) {
  //          System.out.println(i);
  //      }
        //무한루프의 ++면 무한루프에 빠지지만 --하면 원하는 방향으로 변형된다
  //      for (int i =0; i >= 0; i--) {
  //          System.out.println(i);
  //      }
        //for 문 기본 문법구조 책128P
        int a;
        for (a = 0; a < 3; a++){
            System.out.print(a + " ");
        }
        System.out.println();

        for (int i = 0; i < 3; i++){
            System.out.print(i+ " ");
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i =0; i < 10; i +=2) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0, j = 0; i < 10; i++, j++) {
            System.out.print(i + j + " ");
        }
        System.out.println();

        //for 문의 특수한 형태(무한 루프)

       /*
        for (int i = 0; ; i++) {
            System.out.print(i + "");
        }
        for (;;){
            System.out.print("무한루프");
        }
        */
        System.out.println();

       //무한루프탈출
        for (int i = 0; ; i++) {
            if (i > 10) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.print("무한 루트 탈출");

/*        //for문 변형하기
        //기본형
        for (int i=0; i<5; i++) {
            System.out.print(i + " ");
        }
        //변형-자리를 기억하기때문에 값이 비어 있어도 자리는 만들어 줘야한다.
        int i = 0;
        for ( ; i<5; ) {
            System.out.print(i + " ");
            i++;
        }*/
        System.out.println();

        int i = 0;   //초기식
        for ( ; ; ) {   //조건식
            if (i < 5) {
                System.out.print(i + " ");
                i++;   //증감식
            }else {
                break;
            }
        }
        System.out.println();
        //멀티 조건식 - 시작 포괄호 안에 겹치는 이름이 있으면 같은 다른주소의 같은 저장파일을 쓴다는 거로 인식해서 오류를 내는 것, 괄호를 닫기보단 보통은 다른이름을 적어서 사용한다.
        for (int c=0, d=0; c<5 || d<5; c++, d++) {
            System.out.print(c + "_" + d + " ");
        }
        System.out.println();

        //while문 - for문의 변형식과 유사
        int count = 0;   //초기식
        while (count < 5) {  //조건식
            System.out.print(count + " ");
            count++;  //증감식 - 실제로 자주 빼먹는부분이다 왜냐하면 코드를 짜고 맨 마지막에 입력하기 때문에 잊어버림
        }
        //의도적인 무한루프에서 while문은 자주 쓰임
 //       while (true) {
 //           //무한루프
 //           //유저가 버튼클릭 할때까지 대기
 //           //if (esc버튼 클릭)
 //           //    break;
 //       }
        System.out.println();

            //do~ while문 - 실행먼저하고 조건을 체크하겠다는 차이, 쓰는경우는 거의 없음 c, c++에서만 주로 사용
            int cnt = 0;  //초기식
            do {
                System.out.print(cnt + " ");
                cnt++;
            }while (cnt < 5);
        System.out.println();

        int cnt1 = 0;
        do {
            System.out.print(cnt1 + " ");
            cnt1++;
        }while (cnt1 < 5);
        //아래 while문과 비교하면,
        //반복문이 조건이 처음부터 false인 경우,
        //do~while문은 실행코드가 1회 실행되는 반면, while문은 실행되지 않음!!!
        int cnt2 = 0;
        while (cnt1 < 5);{
            System.out.print(cnt2 + " ");
            cnt2++;
        }
        System.out.println();
        //이중루프, 이중반복문 중요!!!
        for (int k=0; k<3; k++) {
            for (int j=0; j<5; j++)
                System.out.println("[k=" + k + ", j=" + j + "]");  //밖에 포문 1개당 작은 포문이 돈다


        }
    }
}
package Java0305;

public class Java20240305 {
    public static void main(String[] args) {
        //break = 제어문의 중괄호를 탈출시키는 키워드
        //자기를 싸고 있는 가장가까운 중괄호 하나를 탈출한다.

        for (int i = 0; i < 10; i++){
            System.out.println(i);
            if (i  > 5) {
                break;
            }
        }

        //이중 for문에서의 break 사용법
        for (int i=0; i<10; i++) {   //안에값이 증가가 끝나야 바깥포문의 i의 값이 시작하고 끝남
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    break;  //3이 되기전에 탈추하는것
                }
                System.out.println(i + "," + j);  //브레이크로 실행될수가 없음.그래서3이 없음
            }
        }
        for (int i=0; i<10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    i = 99999999;  //매우 큰 수를 세팅해서 바깥 for문을 탈출
                                   //의도적으로 큰수를 넣은 것, 탈출시킬려고 하는 의도
                                  // 1.의도성 2.가독성 까지 고려해야한다 9만 넣으면 가웃뚱하고 의도를 파악못할수도?
                    break;
                }
                System.out.println(i + "," + j);  //브레이크로 실행될수가 없음.그래서3이 없음
            }
        }

        //바깥 for문까지 탈출하는 다른 방법 - 실제로 잘 안씀 out이라는 예약어가 아니라 이름지어준거라 무슨 단어를 써도 의미없고 상관없음. 단순한 표시
        out:
        for (int i=0; i<10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    break out;
                }
                System.out.println(i + "," + j);
            }
        }

        //continue 사용법
        for (int i=0; i<10; i++) {
            if (i % 2 == 1) {  //홀수의 경우 아래 출력문을 실행하지 않음
                continue;
            }
            System.out.println(i);
        }
        for (int i=0; i<10; i++) {
            if (i % 2 == 1) {  //홀수의 경우 아래 출력문을 실행하지 않음
                break;    //첫번째 홀수가 나오자 마자 끝남
            }
            System.out.println(i);
        }

        //이중 for문의 continue  - 바깥포문은 할일을 다 하고 j가 3인경우에 continue 라서 3은 출력을 안하고 그다음 4는 출력함
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                if (j == 3) {
                    continue;    //continue 는 찍히는 것만 차이가 있고 반복횟수는 차이가 없음,단 코드 실행을 안한다. break는 기준점 이상은 실행 안함.
                }
                System.out.println(i + "," + j);
            }
        }
    }
}

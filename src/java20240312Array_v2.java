import java.util.Arrays;

public class java20240312Array_v2 {
    public static void main(String[] args) {
        //중복되는 횟수를 카운트하는 것
        int[] arr = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
        int[] fr = new int[arr.length];    //프리컨시 : 횟수, 왜 위에와 같은 크기로 잡았을까?
        int visited = -1;      //정수의 변수를 주고 -1 해줌
        for (int i = 0; i < arr.length; i++) {

            if (fr[i]==visited){  //중복되는 것을 계산하지 마라
                continue;
            }


            int count = 1;     // 카운트를 0으로도 1로도 할수도 있지만 1로 셋팅하 이유?
            // 중요포인트! 하나를 든순간 그 숫자부터 하나로 카운트를 세고 있다. 다음건 두개로 갯수를 세고있다.

            for (int j = i + 1; j < arr.length; j++) { //i+1 로 설정한이유 중요포인트! 문제에 주어졌던내용이
                //다시 한번들었다 내려놓은 것은 다시 계산할 필요없다.
                // 그러므로 1을 체크하면 1을 다시 체크할 필요없다.

                if (arr[i] == arr[j]) {  // 하나를 든순간 카운트를 세고 있다.
                    count++;               //count   : 갯수를 세는 것
                    fr[j] = visited;       //visited : 방문하다. 이지만 체크를 했느냐 안했는냐의 변수
                }
                //자바는 배열은 같은 값을 사용해줘야한다.

            }
            if (fr[i] != visited)  //fr의 i 가 visited가 아니라면
                fr[i] = count;     //갯수를 거기에 써라. 0000000-1 인 상태이다.
        System.out.println(Arrays.toString(fr));



        }
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited)   //인텍스가 같으면 렝스가 같으므로 같은 값으로 사용된다.
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }
    }
}
/* //코드를 수정해서 결과적으로 int[] arr = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1}; 중간에 세는 숫자가 포함되지 않도록 해보자
    //답이 밑에 일것이다. /*을 한곳을 활성화하면 답이 표시될것이다. 예시로 2의 값을 구하려고 중복으로 다시 세지 않게 만들면 된다.
    //[2, 0, 0, 0, 0, 0, 0, 0, -1]
    //[2, 4, 0, 0, -1, -1, -1, 0, -1]
    //[2, 4, 1, 0, -1, -1, -1, 0, -1]
    //[2, 4, 1, 1, -1, -1, -1, 1, -1]
    //[2, 4, 1, 1, -1, -1, -1, 1, -1]
}*/

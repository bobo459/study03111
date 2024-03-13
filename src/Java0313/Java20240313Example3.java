package Java0313;

public class Java20240313Example3 {   //left로 로테이트한다 또는 shift한다라고 표현한다. 많이 사용하는 문제
    public static void main(String[] args) {   //n의 횟수만금 left를 움직이는것, 단 순환구조로 넘긴숫자는 뒤로 가게 만들어줌.
                                               //로직을 어케 세우는지가 중요
        int [] arr = new int [] {1, 2, 3, 4, 5};  //2,3,4,5,5 인데 첫번ㅁ째 값을 뒤에 넣어주면 1,2,3,4,5 로 만들어준다.
         // 2 3 4 5 1
         // 3 4 5 1 2   -로직을 수정할 필요는 없다.
         // 4 5 1 2 3  => 기대값,답안
        int n = 3;   //1번문제 외부입력을 받아서 작성해도 된다.(inpot 넣는 것)  2번문제 오른쪽으로 돌아가게 변경해보시오. 심화문제로 풀어보기.
        System.out.println("Original array: ");


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < n; i++){    //고려할 부분 1번째 : 반복, 옆으로 이동하는것을 3번 반복하라
            int j, first;              //2번째 어떻게 반복하겠는가? 3번을 집착하면 복잡해지니까 집착ㄴㄴ
                                       //n이 1회일때, 사실 for문 필요없음. 빼놓고 생각해보자면 - 결과 2,3,4,5 / 1일 없어져야한다. 없애고 하나씩 땡겨주고 1은 제일 뒤에 넣어준다.라고 로직을 설정한다.
            first = arr[0];  // 포인트 1
            for(j = 0; j < arr.length-1; j++){  //설명 : arr[j+1]이것때문에 만듬. +1만큼 인덱스가 앞으로 한칸씩 이동중이다. -1을 안쓰게 되면 j의 최대값은 4이다.
                arr[j] = arr[j+1];              //arr[j] = arr[j+1] 배열의 5번째가 존재하지 않기에 length을 조정한것. arr[j+1]의 값이 5가되면 에러나서 죽기때문에
            }
            arr[j] = first;  // 포인트 2     //first 마지막에 사용할려면 마지막이 j 가 오게 할려고, j의 최대값이 3이다. j가 오는 숫자는 4이다. j는 가장끝자리 인덱스를 가르키고 있다.
        }
        System.out.println();

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}

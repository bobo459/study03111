package Java0315.example0315;

public class example3015 {  //중요한 코드이므로 해석해보기
                             //정렬 작은 숫자부터 큰 숫자순으로 정렬해주기
    static void bubble(int[] arr) {  //bubble = bubbleShort 을 축약어 : 작은 갯수를 정렬할때는 적합하나 많은 갯수를 정렬하기엔 부적함하다. n*n 정직하게 n을 계속 곱해준다.
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {  //n만큼 순회한다. n만큼 돌겠다
/*            for (int j = 1; j < (n - i); j++) {  //왜 n-i 일까요~? n은 고정값, i는 늘어나는 값. 반복할수록 순회하는 갯수가 줄어든다.앞뒤녀석을 비교해서 비교횟수가 줄어듬
                if (arr[j - 1] > arr[j]) {  //최대값 구할때 비슷하게 했지요?
                    temp = arr[j - 1]; //큰놈을 템포에 넣고 -큰놈을 오른쪽으로 놓고
                    arr[j - 1] = arr[j]; //작은 놈팡이를 앞에 두겠다.
                    arr[j] = temp;
                }
            } //제일 큰놈을 오른쪽에 놓고 그 옆에 작은 수중 큰 친구를 오른쪽으로 정리하겠다. 작은 값을 찾기 위해 n 번 만큼 돌겠다.

          */
            for (int j = 0; j < (n - i-1); j++) {  // 0부터 시작하게 만든다면? 의 예시
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 60, 35, 2, 45, 320, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubble(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

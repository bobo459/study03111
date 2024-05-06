package StudyGroup;

import java.util.Arrays;

//array[54,87,14,25,97,5,41,4,627,85,41,365]
//위 배열을 작은 수부터 큰 순으로 정렬하시오.
//문제 1. 위 배열을 정렬하는 플로우 차트를 작성하시오(주석처리)
//문제 2. 정렬된 배열과 최소,최대 값 그리고 최소값부터 값을 차례대로 더했을때 최대값 이상으로 값이 커지는 인덱스를 구한 뒤 출력하시오.
public class Java0506 {
    public static void main(String[] args) {
        int[] array = {54, 87, 14, 25, 97, 5, 41, 4, 627, 85, 41, 365};
        //작은 수 부터 큰 순으로 정렬해야하니까 전, 후 의 값을 비교해서 작은 수를 왼쪽으로 이동 큰수를 오른쪽으로 이동시켜 줘야겠다.
        //for문을 이용해서 array길이 만큼 전, 후 값을 계속 비교해야겠다.
        //비교를 하면 임시로 저장할 수 있는 변수에 넣어줘야겠다.
        int tmp = 0;
        int[] array2 = new int[array.length];

        for (int i = 0; i < array.length; i++) {     //arry 길이 만큼 계산하겠다.
            for (int j = 1; j < array.length; j++) { //arry 1번 인덱스 위치부터
                if (array[i] > array[j]) {          //값의 1번째 인덱스 값과 그 후 값을 비교해서 크다면 입력하기
                    tmp = array[j];
                    array[j] = array[i];
                    array[i]=tmp;
                }
            }

        }
        System.out.println();
        System.out.println(Arrays.toString(array));


    /*    Arrays.sort(array);
        System.out.println(Arrays.toString(array));*/
    }
}

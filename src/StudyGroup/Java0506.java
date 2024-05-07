package StudyGroup;

import java.util.Arrays;

//array[54,87,14,25,97,5,41,4,627,85,41,365]
//위 배열을 작은 수부터 큰 순으로 정렬하시오.
//문제 1. 위 배열을 정렬하는 플로우 차트를 작성하시오(주석처리)
//문제 2. 정렬된 배열과 최소,최대 값 그리고 최소값부터 값을 차례대로 더했을때 최대값 이상으로 값이 커지는 인덱스를 구한 뒤 출력하시오.
public class Java0506 {
    public static void main(String[] args) {
        //주어진 array = {54, 87, 14, 25, 97, 5, 41, 4, 627, 85, 41, 365} 정보를 정수인 int로  변수로 선언해준다.
        //작은 수인 4를 가장 왼쪽으로 가장 큰수인  627을 가장오른쪽으로 정렬하는 식을 만들어줘야한다.
        //작은 수 부터 큰 순으로 정렬해야하니까 전, 후 의 값을 비교해서 작은 수를 왼쪽으로 이동 큰수를 오른쪽으로 이동시켜야한다.
        //한가지 숫자를 계속해서 비교해줘야한다는 규칙을 생각하여 for문을 이용해서 array길이 만큼 전, 후 값을 계속 비교해야겠다.
        //비교를 하면 임시로 저장할 수 있는 tmp 변수를 만들어 넣어줘야겠다.
        //정렬된 최소값은 arry[0]의 위치에 있을 것이고
        //정렬된 최대값은 arry[11]번째의 인덱스 위치에 있을것이다.
        //최소값부터 최대값을 순차적으로 더하기 위해 sum의 변수를 선언하고 sum =sum+i 를 사용하므로 계속해서 더해주고
        //sum < arry[11]번째 값보다 커질때 나오는 인덱스 번호를 구하고 break;를 해주므로 빠져 나오는 식을 짜준다.


        int[] array = {54, 87, 14, 25, 97, 5, 41, 4, 627, 85, 41, 365};
        int tmp = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {     //arry 길이 만큼 계산하겠다.
            sum= sum + array[i];
            for (int j = 1; j < array.length; j++) { //arry 1번 인덱스 위치부터 시작하겠다
                if (array[i] < array[j]) {           //값의 1번째 인덱스 값과 그 후 값을 비교해서 j값이 크다면 입력하기
                    tmp = array[j];
                    array[j] = array[i];
                    array[i]=tmp;
                }
            }

        }System.out.println(tmp);
        System.out.println();
        System.out.println("합계 : "+sum);
        System.out.println(Arrays.toString(array));

    /*    Arrays.sort(array);
        System.out.println(Arrays.toString(array));*/
    }
}

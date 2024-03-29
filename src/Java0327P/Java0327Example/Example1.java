package Java0327P.Java0327Example;

public class Example1 {
    public static void main(String[] args) {

        // 문제 1. 아래 2차원 배열의 모든 값의 합과 평균을 구하시오
        int[][] arr = {
                { 5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };

        int total = 0;  //325
        float average = 0;  //16.25
/*
    //정방
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                total = total + arr[i][j];
            }
            System.out.println();
        }

        average =  total / (float)(arr.length * arr[0].length);

*/
        //비정방
        int i;
        int mamo = 0;
        for (i=0; i<arr.length;i++){
            for (int j=0; j<arr[i].length; j++){
                total = total +arr[i][j];

                mamo= mamo +1;

            }
        }
       average = (float) total/mamo;

        System.out.println(i);
        System.out.println(mamo);

        System.out.println();
        System.out.println("total="+total);
        System.out.println("average="+average);

        //선생님답
    }
}


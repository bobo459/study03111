package Java0326Example2;

public class InsertionSortExample {

    // Insertion 정렬의 알고리즘을 이해하고
    // 어떤 정렬상태가 주어졌을때 가장 빨리 정렬을 마무리할지 생각해봅시다!! = Best Case : 순서대로 되어 있을경우. 적게 돌아감
    // 반대로 어떤 정렬 상태가 주어졌을때 가장 오래 걸릴까?? = Worst Case : 숫자 정렬이 역순으로 되어 있을 경우.
    public static void insertionSort(int array[]) {  //삽입정렬법
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];  //값을 저장
            int i = j-1;         //인덱스를 저장  인덱스란? 배열의 위치값을 나타냄
            while ( (i > -1) && ( array [i] > key ) ) { //true면 밑에 친구를 동작한다. 아니면 빠져나간다.
                array [i+1] = array [i];                //key와 비교하면서 자리를 옮긴다.
                i--;
            }
            array[i+1] = key;
        }
    }

    public static void main(String a[]){
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Insertion Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        insertionSort(arr1);//sorting array using insertion sort

        System.out.println("After Insertion Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}
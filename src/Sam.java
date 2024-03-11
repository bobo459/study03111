import java.util.Scanner;

public class Sam {
    public static void main(String[] args) {
        // 10. 양의 정수 10개를 입력받아 배열에 담고 3의 배수만 출력
        Scanner sc = new Scanner(System.in);
        int[] intArray = new int[10];
        for (int i=0; i< intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }
        for (int i=0; i< intArray.length; i++) {
            if (intArray[i] % 3 == 0) {
                System.out.print(intArray[i] + " ");
            }
        }
    }
}

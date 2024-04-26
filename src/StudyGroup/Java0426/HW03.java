package StudyGroup.Java0426;
//구구단 8단의 코드를 작성하시오.
//출력 예시 :
//8 * 1 = 8
//8 * 2 - 16
// ...
public class HW03 {
    public static void main(String[] args) {
        int a = 0;
        int count = 0;
        for (int i = 1; i < 10; i++) {
            a= 8*i;
            count++;
            System.out.println("8 * "+ count + " = "+a);
        }
    }
}

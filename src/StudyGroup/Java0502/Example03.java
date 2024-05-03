package StudyGroup.Java0502;
//피보나치 수열을 만드시오.
//단 길이는 20개로 한함
public class Example03 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        for (int i = 2; i < 20; i++) {
            int c = a + b;
            a = b;
            b = c;

            System.out.print(" "+c);
        }

    }
}

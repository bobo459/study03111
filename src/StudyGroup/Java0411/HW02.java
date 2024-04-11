package StudyGroup.Java0411;

/*
[for문 사용]+if문 필요시 사용
1) 1~10까지의 숫자를 모두 출력하는 코드를 작성하시오.
2) 1~10까지의 숫자 중 짝수만 줄력하시오.
3) 1부터 50까지의 숫자 중 10의 배수만 출력하시오.
 */
public class HW02 {
    public static void main(String[] args) {
           for (int i = 0; i < 10; i++) {
            System.out.print(i+1 + ", ");
        }System.out.println();

        for (int i = 1; i <= 10; i++) {
            if( i%2==0){
                System.out.print(i+", ");
            }
        }System.out.println();

        for (int i = 1; i <= 50; i++) {
            if( i%10==0){
                System.out.print(i+", ");
            }
        }


    }
}

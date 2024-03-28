package Java0327;    //467p

public class TryCatchFinally {
    public static void main(String[] args) {
        try { //이 코드르 실행해보고 문제가 발생하면 catch를 사용
            System.out.println(3/1);
            int a = Integer.parseInt("20");  //무언가를 인티져로 바꾸는것
            int[] arr = {1,2,3,4,5}; //ArryIndexOutOfBoundsException 발생
            arr[5] =6;
            System.out.println("프로그램 종료1");  //실행이 다안됨.
            System.out.println("예기지 못한 에러로 인하여 프로그램을 종료합니다.");
        }catch (ArithmeticException e){  //예상이 되는 예외를 캐치한다.
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
            System.out.println("프로그램 종료2");
        }catch (NumberFormatException e){
            System.out.println("숫자로 변환할 수 없습니다.");
        }catch (NullPointerException e) {
            System.out.println("Null관리 좀 잘하자");
        }catch (Exception e) {
        }

        finally {
            System.out.println("프로그램 종료3"); //정상적인 때도 캐치가 실행되도 파이널리가 실행된다.
                                                //정상이든 아니든 어찌됬든 마지막으로 실행이 되어야 하므로 실행된다.
                                                //finally 뒤에는 추가로 붙는 코드는 없다. 이름 그대로 마지막에 넣어주기
        }
       // System.out.println("여기가 실행될까?");
    }
}

package Java0327P.Java0327;

class MyException extends Exception {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}

    //사용자실행예외
    class MyRTException extends RuntimeException {
        public MyRTException() {
            super();
        }

        public MyRTException(String message) {
            super(message);
        }
    }

class A{
    //3.사용자정의 예외객체생성
    MyException me1 = new MyException();
    MyException me2 = new MyException("예외메세지 : MyException");
    MyRTException mre1 = new MyRTException();
    MyRTException mre2 = new MyRTException("예외메세지 : MyRTException");


    void abc_1(int num) {
        try {
            if (num > 70)
                System.out.println("정상작동");
            else
/*                throw me1;*/
                throw new MyException("나이가 70이하임: "+num); //예외를 던진 이시점에 예외
        }catch (MyException e){ //e는 변수이다
            System.out.println("예외 처리1");
            System.out.println(e.getMessage()); //다잉메세지를 찍어준다.
        }
    }
    void bcd_1(){
        abc_1(65);
    }

    void abc_2(int num) throws MyException{ //throw's'를 함. 예외처리를 안하겠다는 의미. 내가 처리 안하고 호출한 사람에게 일을 전가한다.
        if (num > 70)
            System.out.println("정상작동");
        else
            throw new MyException("예외전가 => 나이가 70이하임: "+num);
    }
    void bcd_2(){
        try {
            abc_2(65);
        } catch (MyException e){  //catch의 위치가 다름
            System.out.println("예외 처리2");
            System.out.println(e.getMessage());
            e.printStackTrace();   // 어떤 경로로 실행되는지 보여주는 코드
        }
    }
}
public class CreateUserException {
    public CreateUserException() {
    }

    public static void main(String[] args) {
        A a = new A();
        a.bcd_1();
        a.bcd_2();
    }
}

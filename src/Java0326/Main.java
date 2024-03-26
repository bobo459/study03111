package Java0326;

public class Main {
    public static void main(String[] args) {
        ChildA a = new ChildA();
        a.abc();
        a.bcd();

        System.out.println(A.a);
        System.out.println(B.a);
 /*     A.a = 100; //에러가 나는 이유는 a는 파이널이면서 상수이다. 인터페이스는 힙이 아닌 고정형 스택에 만들어지기 때문이다.
        a.a //뒤에 a는 누구의 a를 말하는 것인가?A의 a인지, B의 a인지 찾을 수 없다.
                */


        A a2 = new A(){ //중괄호사용 . 사실은 금지된 방식인데 가능하게 됨
            public void abc(){    //오바라이드
             System.out.println("나는 익명 이너클래스");
            }
        };  //세미콜론 필수
        a2.abc();


        //<인터페이스 생성 방법1>
        //자식클래스(ChildA)를 선언하고 해당 인터페이스를 상속하게 하면
        //아래와 같이 동일한 코드 내용(매서드 오버라이딩 내용)을 계속해서 사용할 수 있음.
        ChildA c2 = new ChildA();  //ChildA 가 이미 존재하기에 똑같이 복사해주는것
        ChildA c3 = new ChildA();
        ChildA c4 = new ChildA();

        //<인터페이스 생성 방법2>
        //아래와 같이 익명 이너 클래스 형식으로 생성하면,
        //방법1에서와 같이 재사용할 수 있는 클래스 이름이 없으므로
        //동일한 코드 내용(=매서드 오버라이딩 내용)을 복사 붙여넣기 해줘야 함.
        A a3 =  new A() {
            public void abc() {   //이름이 없기에 내용을 입력해 줘야한다.
                                  // 단, 특정적인 기능이 필요하지만 파일을 만들어 계속 뽑아 쓸정도는 아니고 그 자리에서 한번만 사용할때 쓴다.
                System.out.println("나는 익명 이너클래스");
            }
        };

        A a4 =  new A() {
            public void abc() {
                System.out.println("나는 익명 이너클래스");
            }
        };
    }
}

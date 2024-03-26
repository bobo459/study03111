package Java0326;

public class ChildA implements A,B {  //빨간줄뜨면 에러 확인해서 파랑글씨 눌러서 override 만들어준다.
    @Override
    public void abc() { //A의 메서드를 사용
        System.out.println("child of A");
    }

    @Override
    public void bcd() {  //B의 메서드를 사용
        System.out.println("child of B");
    }
}

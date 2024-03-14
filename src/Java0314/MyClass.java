package Java0314;

class MyClass2 {}
public class MyClass {
    public static void main(String[] args) {
        MyClass2 myClass2 = new MyClass2();
        System.out.println(myClass2);  //클래스의 패키지.헤쉬코드 - 내부에 있고 없고를 떠나서 숫자로 나오는 코드값이 출력된다.
                                       //부모로 받고 있다.예시) 부모 a = 자식; 하면 에러가 안나는데 이것과 같이 대입해서 출력해주는것 오버라이딩이다.
                                       //println(myClass2 ) => object x 모든 클래스를 받아준다.
    }
}

package Java0313;

class A {}
class B extends A {}

public class Java20240313_v03_325P {
    public static void main(String[] args) {
        A aa = new A();
        A ab = new B();

        System.out.println(aa instanceof A);
        System.out.println(ab instanceof A);

        System.out.println(aa instanceof B);
        System.out.println(ab instanceof B);

        if (aa instanceof B) {
            B b = (B) aa;
            System.out.println("aa를 B로 캐스팅했습니다.");
        }else{
            System.out.println("aa는 B타입으로 캐스팅이 불가능!!!");
        }
    }
}

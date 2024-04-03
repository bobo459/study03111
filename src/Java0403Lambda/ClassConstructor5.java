package Java0403Lambda;

interface CC{
    MyClass method();
}

interface CC2{
    MyClass method(int k); //매개변수가 있는타입, method 메서드의 이름은 동일하게 해도 된다. 왜냐하면 단독으로 사용이 아니라 제목의 CC2.method 로 사용하기에
}
class MyClass{
    int k;
    MyClass(){
        System.out.println("MyClass 기본 생성자");
    }
    MyClass(int k){
        System.out.println("매개변수 생성자"+ k);
        this.k=k;
    }

}
public class ClassConstructor5 {
    public static void main(String[] args) {
        //함수인터페이스 메서드가 외부클랫를 리터하는 경우
        //메서드내에서 외부클랫의 생성자를 이용하여 객체를 생성해야함

        CC a1 = new CC() {  //익명 이너 클래스 방식
            @Override
            public MyClass method() {
                return new MyClass();
            }
        };

        //람다식 ()=>CC의 공간에 내용이 있어야 하는데 내용이 없어서 넣으면 에러가 난다.
        CC a2 = () -> new MyClass(); //람다식 단축형1
        CC a3 = MyClass::new;  //람다식 단축형2
        a3.method();

        CC2 c1 = (int k) -> new MyClass(k);
        CC2 c2 = MyClass::new;
        c1.method(5);
        c2.method(10);
    }
}

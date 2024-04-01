package Java0401Generic;
//585p
//제네릭 방식을 하나만 사용가능
class MyClass<T>{ //제네릭 기본 선언 방식
    private T t;//필드를 넣기. 보통 변수가 오는데 변수를 안넣을 거기 때문에 T 를 써줘서 클래스를 만든다.
                //클래스를 인스턴스화 할때 T가 사용된다.
    public T get() {  //겟터
        return t;
    }
    public void set(T t) { //셋터를 수기로 작성한 것 뿐임.
        this.t =t;
    }
}
public class Main1 {
    public static void main(String[] args) {
        /*       MyClass<T> // <=원래는 이것인데, 생성단계에서는 구체적으로 뭐인지 들어가야해서 밑에 처럼 적어준다.*/
        MyClass<String> mc1 = new MyClass<String>(); //클래스의 생성단계/내가 받고 싶은 객체를 <>안에 써주자
        mc1.set("안녕"); // 생성단계에서 자료형을 결정했기때문에 입력단계에서 특정 자료형만 받음. String을 사용했으므로 문자만 가능하고 int형인 숫자는 안받아줌.
        System.out.println(mc1.get());  //숫자를 받고 싶어도 mc1은 String으로 고정되서 받을 수 없고 새로운 변수명을 만들어준다.

        MyClass<Integer> mc2 = new MyClass<>(); //int 를 넣어서 에러에 이런문구가 나오면 primitive type는 기본있는8개의 타입을 이렇게 표시해준다.클래스는 아님. 원시타입
                                                //Integer는 int자료형의 wrapper 클래스. 자료형을 랩핑(감싸주는 클래스가 따로 있다)
        mc2.set(100);
        System.out.println(mc2.get());
    }
}
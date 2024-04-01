package Java0401Generic;

class GenericMethods{  //<=일반클래스. 일반클래스 안에 정의한 제네릭메서드 예제
    public int method0(int a){   //일반메서드 : 반드시 int 타입만 가능. 하나의 타입으로 고정됨.
        return a;
    }
    public <T> T method1(T t) {  //제너릭 메서드 : 파라미터로 받는 타입도 아무거나
        return t;
    }
/*    public T method1(T t) {  //<T>를 지우면 <T>를 찾을 수 없다고 오류가 난다. 어딘가에 T가 있을거라고 믿고 찾아다님.
        return t;
    }*/
    public <T> boolean method1(T t1, T t2) { // <T> 하나만 쓴거면 제네럴타입을 1개만 쓰겠다는 의미
        return t1.equals(t2);
    }
}


public class GenericMethod {
    public static void main(String[] args) {

    }
}

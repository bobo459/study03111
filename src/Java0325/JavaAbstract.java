package Java0325;

abstract public class JavaAbstract {

        //필드

        int a;
        String b;

    public JavaAbstract() {   //기본값이 들어감
        this.a = 10;
        this.b = "default";
    }

    //생성자
    public JavaAbstract(int a, String b){
        this.a = a;
        this.b = b;
    }

    //메서드
    public int getValue(){   //겟메서드
        return a;
    }
/*    public String getString(){
        return b;
    }*/
    abstract public String getString();  //396p 이게 추상메서드의 선언, 추상메서드는 중괄호{}를 사용하지 않는다. 사용한다면 일반 메서드를 쓴다는 것이다.

/*
    public void method1(){
        //do nothing // 추상메서드와의 구분을 위해 중괄호를 넣어주는 것이다. 출력을 위해 일은 하지만 내용이 없다 아무런 값이 없다.
    }
*/

public void setValue(int a){ // 세터(setter)메서드
    this.a = a;
}
public void setString(String b){   // 세터(setter)메서드
    this.b = b;
}

}

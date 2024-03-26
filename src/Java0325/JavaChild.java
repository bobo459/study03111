package Java0325;

public class JavaChild extends JavaAbstract{   //JavaAbstract의 구현채이다.397p
    public JavaChild(){   //인친구 없을 경우에 자동으로 만들어 준다.
        super();
    }
    public JavaChild(int a, String b){  //이용할거면 만들기 없어도 상관은 없음
        super(a,b);
    }

    @Override
    public String getString() {  //필수!!오버라이드하지 않으면 작동이 안된다. 위에 있는 생성자 만들때 주의
        return super.b;   //"이것은 자식 클래스" 라는 고정값에서 b라고 수정해서 원하는 결과값을 입력하면 출력되게 변경해주었다.
    }                     //지금은 b의 값이 따로 없어서 super을 안써도 바로 부모로 인식해 주지만, super를 붙여주므로서 b의 값을 어떻게 사용할지를 지정해준다.

    public void setValue(int a) {
        super.setValue(a);//자바스타일. 자바느느 세터와 게터를 사용하는 것을 추천함!!
        //super.a = a;   //라고도 사용할수도 있다. 하지만 비추천, 자바스타일 아님.자바를 사용하는 개발자는 잘 사용안한다.
    }
    public void setString(String b){
        super.setString(b);
    }

}

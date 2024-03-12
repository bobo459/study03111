public class Member {
    static int name;  //스택틱

    int age;         //인스티스

    static {
        name = 10000;  //정적 초기화 블록.값의 초기화
    }

    public Member() {

    }

    public Member(int age) {    //인스터스 요소만 헨들링 가능하다
        this.age = age;
    }
}

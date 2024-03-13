package Java0313;

class Human {
    String name;
    int age;
    void eat() {
    }
    void sleep() {
    }
}

class Student extends Human{
    int studentID;
    void goToSchool () {}
}
class Worker extends Human{
    int workerID;
    void goToWork(){}
}

public class java20240313 {   //메인이 되는 파일 명은 하나인데, 메인클래스 안에 다른 클래스를 만들어 에러가 난것이다. 에러가 난다면 클래스명의 위치를 잘 확인해보자
    public static void main(String[] args) {  //기본적으로 디폴트 패키지로 만들어 지는데 같은 패키지 안에 같은 이름의 다른 클래스가 생성되면 에러

        Human h = new Human();
        h.name = "김현지";
        h.age = 11;
        h.eat();
        h.sleep();

        Student s = new Student();
        s.name = "김민성";
        s.age = 16;
        s.studentID = 128;
        s.eat();
        s.sleep();
        s.goToSchool();

        Worker w = new Worker();
        w.name = "봉윤정";
        w.age = 45;
        w.workerID = 128;
        w.eat();
        w.sleep();
        w.goToWork();
    }

}

package StudyGroup.Java0524;

public class HW01 {
    public static void main(String[] args) {
        //문제 1. Students 클래스에 이름,나이,지역 필드를 생성하시오.
        //문제 2. 생성한 필드를 호출하여 각 필드에 Alex,26,대전을 입력하시오.

        Students students = new Students();

        String name = students.toName("Alex");
        int age = students.toAge(26);
        String area = students.toArea("대전");

        System.out.println(name +" "+ age + " " +area);

    }
}

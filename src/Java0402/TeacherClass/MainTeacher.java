package Java0402.TeacherClass;

import java.util.ArrayList;

/*
1. Teacher클래스
-User의 로그임 ID처럼 teacherld 필요
-이름필드 필요
-기타 필요한 필드는 각자 만들어주세요.

2. LectureTeacher 클래스
   -어느 teacher가 어느 과목을 가르치는 지 관계를 저장하는 클래스

3. 관련 메서드 만들기
   3-1)getTeacherByLectureld : 특정 과목 ID로 해당 과목을 가르치는 Teacher의 이름 출력
   3-2)getLecureTitleListByTeacherld : 특정 teacher가  가르치는 과목명 리스트 출력
                                       (반드시 String[] 또는 List<String>에 담아서 리턴)
 */
public class MainTeacher {
    static ArrayList<User> users;
    static ArrayList<Lecture> lectures;
    static ArrayList<LectureRegistration> lectureRegistrations;


    public static void main(String[] args) {
        InfoCreate.createInfos();
//특정 과목 ID로 해당 과목을 가르치는 Teacher의 이름 출력
        getTeacherByLectureld(2);

//특정 teacher가  가르치는 과목명 리스트 출력
                getLecureTitleListByTeacherld("tom");
    }

    public static void getTeacherByLectureld(int lectureId) {
        for (int i = 0; i < lectureRegistrations.size(); i++) {
            if (lectureRegistrations.get(i).getLecterId() == lectureId) {
                System.out.println("선생님 이름 : " + lectureRegistrations.get(i).getName());
            }
        }
    }
    public static void getLecureTitleListByTeacherld(String name) {
        for (int i = 0; i < lectureRegistrations.size(); i++) {
            if (lectureRegistrations.get(i).getName().equals(name)) {
               int lecturId = lectureRegistrations.get(i).lecterId;
               for (int j =0; j<lectures.size();j++){
                   if (lectures.get(j).getLectureId()==lecturId){
                       String title = lectures.get(j).getTitle();
                       System.out.println("가르치는 과목명 : "+ title);
                   }
               } System.out.println("해당 과목을 가르치는 선생님 : " + name + " 선생님");
            }
        }
    }


}

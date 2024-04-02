package Java0402.TeacherClass;

import java.time.LocalDate;
import java.util.ArrayList;

public class InfoCreate {
    public static void createInfos(){

        MainTeacher.users = new ArrayList<>();
        MainTeacher.users.add(new User("tom", "국어선생님","apfhsk459",
                LocalDate.of(1995,01,17),"apfhsk459@naver.com","12345678910"));
        MainTeacher.users.add(new User("Steve", "영어선생님","Endqk123",
                LocalDate.of(1987,05,22),"Endqk123@naver.com","82941238450"));

        MainTeacher.lectures = new ArrayList<>();
        MainTeacher.lectures.add(new Lecture(1,"국어",60,"String","초급"));
        MainTeacher.lectures.add(new Lecture(2,"영어",120,"Programmin","중급"));

        MainTeacher.lectureRegistrations = new ArrayList<>();
        MainTeacher.lectureRegistrations.add(new LectureRegistration(1,"tom"));
        MainTeacher.lectureRegistrations.add(new LectureRegistration(2,"Steve"));


    }
}

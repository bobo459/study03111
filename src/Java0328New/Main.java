package Java0328New;

import Java0328Next.InfoCreate;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    static ArrayList<User> users;
    static ArrayList<Lecture> lectures;
    static ArrayList<LectureRegistration> lectureRegistrations;

    public static void main(String[] args) {

        InfoCreate.createInfos();

        // 강의 ID로 수강하는 학생의 loginId 찾기
        getLoginIdByLectureId(2);
        // 유저의 loginId로 강의명 찾기
/*        getTitleByLoginId("hero11");
        // 강의명으로 수강생들의 이메일 찾기
        getEmailByLectureTitle("Javascript");*/


        ArrayList<User> users = new ArrayList<>();
        users.add(new User("tom", "메로나", "apfhsk123",
                LocalDate.of(1980, 01, 17), "aofgsj123@gmail.com", "456789123126"));
        users.add(new User("steve", "awd458", "votmdnjem",
                LocalDate.of(1999, 10, 11), "awd458@naver.com", "123456789"));
        users.add(new User("susie", "뚱바나나", "Endqksksk456",
                LocalDate.of(2001, 05, 05), "Endqk783@daum.net", "159845612378"));
        users.add(new User("song", "오렌지", "dhfpswl452!",
                LocalDate.of(1895, 04, 26), "dhfpswl259@naver.com", "65945687631"));
        users.add(new User("jung", "qeen42", "qeen1534!!",
                LocalDate.of(1962, 8, 15), "qeen1@daum.net", "6208153225483"));


        ArrayList<Lecture> lectures = new ArrayList<>();
        lectures.add(new Lecture(1, "Java", "Programming", 120, "초급"));
        lectures.add(new Lecture(2, "Spring", "sing", 60, "중급"));
        lectures.add(new Lecture(3, "Array", "ArratList", 25, "고급"));


/*        System.out.println(steve.toString());
        System.out.println(lecture1.toString());*/

        ArrayList<LectureRegistration> lectureRegistrations = new ArrayList<>();
        lectureRegistrations.add(new LectureRegistration("awd458", 1));
        lectureRegistrations.add(new LectureRegistration("메로나", 2));
        lectureRegistrations.add(new LectureRegistration("뚱바나나", 1));
        lectureRegistrations.add(new LectureRegistration("오렌지", 3));
        lectureRegistrations.add(new LectureRegistration("qeen", 1));


/*        System.out.println("2. 강의1번 수강생의 loginId 찾기");

        for (int i = 0; i < lectureRegistrations.size(); i++) {
            if (lectureRegistrations.get(i).getLectureId() == 1) {
                System.out.println(lectureRegistrations.get(i).getUserID());
            }
        }*/

    }

    public static void getLoginIdByLectureId(int lectureId) {
        for (int i=0; i<lectureRegistrations.size(); i++){
            if (lectureRegistrations.get(i).getLectureId() == lectureId) {
                System.out.println("1. 로그인ID : "
                        + lectureRegistrations.get(i).getLectureId());
            }
        }
    }
}

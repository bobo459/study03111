package Java0328New;

import java.time.LocalDate;
import java.util.ArrayList;

public class InfoCreate {

    public static void createInfos() {

        ArrayList<User> users;
        users = new ArrayList<>();
        users.add(new User("tom", "메로나", "apfhsk123",
                LocalDate.of(1980, 1, 17), "aofgsj123@gmail.com", "456789123126"));
        users.add(new User("steve", "awd458", "votmdnjem",
                LocalDate.of(1999, 10, 11), "awd458@naver.com", "123456789"));
        users.add(new User("susie", "뚱바나나", "Endqksksk456",
                LocalDate.of(2001, 5, 5), "Endqk783@daum.net", "159845612378"));
        users.add(new User("song", "오렌지", "dhfpswl452!",
                LocalDate.of(1895, 4, 26), "dhfpswl259@naver.com", "65945687631"));
        users.add(new User("jung", "qeen42", "qeen1534!!",
                LocalDate.of(1962, 8, 15), "qeen1@daum.net", "6208153225483"));


        ArrayList<Lecture> lectures = new ArrayList<>();
        lectures.add(new Lecture(1, Category01.ARRAY, "Programming", 120, "초급"));
        lectures.add(new Lecture(2, Category01.JAVA, "sing", 60, "중급"));
        lectures.add(new Lecture(3, Category01.SPRING, "ArratList", 25, "고급"));


        Main.lectureRegistrations = new ArrayList<>();
        Main.lectureRegistrations.add(new LectureRegistration("awd458", 1));
        Main.lectureRegistrations.add(new LectureRegistration("메로나", 2));
        Main.lectureRegistrations.add(new LectureRegistration("뚱바나나", 1));
        Main.lectureRegistrations.add(new LectureRegistration("오렌지", 3));
        Main.lectureRegistrations.add(new LectureRegistration("qeen", 1));
    }
}


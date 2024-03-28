package Java0328;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        User tom = new User("tom","awd458","votmdnjem","awd458@naver.com",
                LocalDate.of(1999,1,1),"123456123456");*//*

        User steve = new User("steve","메로나","apfhsk123","aofgsj123@gmail.com","456789123126");
        User susie = new User("susie","뚱바나나","Endqksksk456","Endqk783@daum.net","159845612378");




        steve.displayAll();
        susie.displayAll();
    }
 */
        ArrayList<User> users = new ArrayList<>();
        User tom = new User("tom", "메로나", "apfhsk123",
                LocalDate.of(1980, 01, 17), "aofgsj123@gmail.com", "456789123126");
        users.add(tom);
        User steve = new User("steve", "awd458", "votmdnjem",
                LocalDate.of(1999, 10, 11), "awd458@naver.com", "123456789");
        users.add(steve);
        User susie = new User("susie", "뚱바나나", "Endqksksk456",
                LocalDate.of(2001, 05, 05), "Endqk783@daum.net", "159845612378");
        users.add(susie);
        User song = new User("song", "오렌지", "dhfpswl452!",
                LocalDate.of(1895, 04, 26), "dhfpswl259@naver.com", "65945687631");
        users.add(song);
        User jung = new User("jung", "qeen42", "qeen1534!!",
                LocalDate.of(1962, 8, 15), "qeen1@daum.net", "6208153225483");
        users.add(jung);

        ArrayList<Lecture> lectures = new ArrayList<>();
        Lecture lecture1 = new Lecture(1, "Java", "Programming", 120, "초급");
        lectures.add(lecture1);
        Lecture lecture2 = new Lecture(2, "Spring", "sing", 60, "중급");
        lectures.add(lecture2);
        Lecture lecture3 = new Lecture(3, "Array", "ArratList", 25, "고급");
        lectures.add(lecture3);

/*        System.out.println(steve.toString());
        System.out.println(lecture1.toString());*/

        ArrayList<LectureRegistration> lectureRegistrations = new ArrayList<>();
        LectureRegistration lectureRegistration1 = new LectureRegistration("awd458", 1);
        lectureRegistrations.add(lectureRegistration1);
        LectureRegistration lectureRegistration2 = new LectureRegistration("메로나", 2);
        lectureRegistrations.add(lectureRegistration2);
        LectureRegistration lectureRegistration3 = new LectureRegistration("뚱바나나", 1);
        lectureRegistrations.add(lectureRegistration3);
        LectureRegistration lectureRegistration4 = new LectureRegistration("오렌지", 3);
        lectureRegistrations.add(lectureRegistration4);
        LectureRegistration lectureRegistration5 = new LectureRegistration("qeen", 1);
        lectureRegistrations.add(lectureRegistration5);

        System.out.println("2. 강의1번 수강생의 loginId 찾기");

        for (int i = 0; i < lectureRegistrations.size(); i++) {
            if (lectureRegistrations.get(i).getLectureId() == 1) {
                System.out.println(lectureRegistrations.get(i).getUserID());
            }
        }
        System.out.println();

        System.out.println("3. 유저의 loginId로 강의명 찾기");

        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력해주세요. : ");
        String userID = sc.nextLine();

        int search = -1;  //같은 ID를 찾지 못한경우를 위한 안내자

        for (int j = 0; j < lectureRegistrations.size(); j++) {
            if (userID.equals(lectureRegistrations.get(j).getUserID())) { //유저ID와 lectureRegistrations의 getUserID 같다면  [equals: 문자일때 같다는 표시(==)를 글로 써준것]
                search = lectureRegistrations.get(j).getLectureId();      //search 에 대입을 해주고
                System.out.println("강의번호: " + lectureRegistrations.get(j).getLectureId());  //출력할 내용은 getLectureId 를 보여줄거야
                break;    //맞으면 빠져나올거구 아니면 반복해서 찾을거야
            }
        }
        if (search < 0) {    //만약 search가 0보다 크다면 여기로 올거야
            System.out.println("없는 아이디 입니다.");
        }
        for (int k = 0; k < lectures.size(); k++) {
            if (search == lectures.get(k).getLectureId()) {    //만약 search 와 lectures의 getLectureId가 같다면
                System.out.println("강의명: " + lectures.get(k).getTitle());  //getTitle을 출력할거야
            }
        }

        System.out.println();
        System.out.println("4.강의명으로 수강생들의 이메일 찾기");

        for (int i = 0; i < lectureRegistrations.size(); i++) {
            if (userID.equals(lectureRegistrations.get(i).getUserID())) {
                search = lectureRegistrations.get(i).getLectureId();
                System.out.println("강의번호: " + lectureRegistrations.get(i).getLectureId());
            }
        }
        if (search < 0) {
            System.out.println("없는 아이디 입니다.");
        }
        for (int j = 0; j < lectures.size(); j++) {
            if (search == lectures.get(j).getLectureId()) {
                System.out.println("강의명: " + lectures.get(j).getTitle());
            }
        }
        for (int k = 0; k < lectures.size(); k++) {



        }
    }
}

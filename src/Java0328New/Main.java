package Java0328New;

import Java0329.Category;

import java.time.LocalDate;
import java.util.ArrayList;



public class Main {
    static ArrayList<LectureRegistration> lectureRegistrations;
    //static ArrayList<LectureRegistration> lectureRegistrations = new ArrayList<>();
    public static void main(String[] args) {

        // 정보 초기화
        InfoCreate.createInfos();
        // 강의 ID로 수강하는 학생의 loginId 찾기
        /*Method.getLoginIdByLectureId();*/

        System.out.println(lectureRegistrations.get(0).lectureId);
    }

}

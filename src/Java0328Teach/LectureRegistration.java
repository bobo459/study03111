package Java0328Teach;

public class LectureRegistration { //관계를 표시하는 클래스는 무지막지하게 심플해야한다.
    String userId;
    int lectureId;

    public LectureRegistration() {
    }

    public LectureRegistration(String userId, int lectureId) {
        this.userId = userId;
        this.lectureId = lectureId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }
}

package Java0328;

public class LectureRegistration {
    String userID;
    int lectureId;

    public LectureRegistration() {
    }

    public LectureRegistration(String userID, int lectureId) {
        this.userID = userID;
        this.lectureId = lectureId;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

}

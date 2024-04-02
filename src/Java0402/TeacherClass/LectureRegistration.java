package Java0402.TeacherClass;

public class LectureRegistration {
    int lecterId;
    String name;

    public LectureRegistration() {
    }

    public LectureRegistration(int lecterId, String name) {
        this.lecterId = lecterId;
        this.name = name;
    }

    public int getLecterId() {
        return lecterId;
    }

    public void setLecterId(int lecterId) {
        this.lecterId = lecterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name +" 선생님";
    }
}

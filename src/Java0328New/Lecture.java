package Java0328New;

public class Lecture {
    int lectureId; //유니크한 필드가 없어도 꼭 만들어줘야함
    String kategorie; //카테고리
    String title; //강의명
    int duration; //강의시간
    String difficulty; //초급 중급 고급

    //생산자
    public Lecture() {
    }

    //일반생산자
    public Lecture(int lectureId, String kategorie, String title, int duration, String difficulty) {
        this.lectureId = lectureId;
        this.kategorie = kategorie;
        this.title = title;
        this.duration = duration;
        this.difficulty = difficulty;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return  "강의번호: " + lectureId + '\n' +
                "카테고리: " + kategorie + '\n' +
                "강의명: " + title + '\n' +
                "강의시간: " + duration + '분'+ '\n' +
                "강의레벨: " + difficulty + '\n' ;
    }
}

package Java0328New;

public class Lecture {
    int lectureId; //유니크한 필드가 없어도 꼭 만들어줘야함
    Category01 Category; //카테고리
    String title; //강의명
    int duration; //강의시간
    String difficulty; //초급 중급 고급

    //생산자
    public Lecture() {
    }

    //일반생산자
    public Lecture(int lectureId, Category01 Category, String title, int duration, String difficulty) {
        this.lectureId = lectureId;
        this.Category = Category;
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

    public Category01 getCategory() {
        return Category;
    }

    public void setCategory(Category01 Category) {
        this.Category = Category;
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
                "카테고리: " + Category + '\n' +
                "강의명: " + title + '\n' +
                "강의시간: " + duration + '분'+ '\n' +
                "강의레벨: " + difficulty + '\n' ;
    }
}

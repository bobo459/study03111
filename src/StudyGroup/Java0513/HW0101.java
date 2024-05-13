package StudyGroup.Java0513;
class B{
    void test2(int[]name) {
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < name.length; i++) {
            sum = sum + name[i];
        }
        avg = sum / name.length;
        System.out.println(" 총점은 " + sum + " 점, 평균은 " + avg + " 점 입니다.");
    }
}
public class HW0101 {
    public static void main(String[] args) {
        //아래 배열은 학생 각각의 점수들을 담고 있는 배열이다. -> 순서는 국어, 수학, 영어, 사회 과학
        int [] tomGrade = new int[] {40,57,84,75,96};
        int [] saraGrade = new int[] {75,84,98,63,75};
        int [] davidGrade = new int[] {88,45,75,62,51};
        int[] name = new int[5];

        name = davidGrade;
        B b = new B();
        b.test2(name);
    }
}


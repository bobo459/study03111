package StudyGroup.Java0524;

import java.util.Scanner;

public class Students {
    String name;
    int age;
    String area;

    public Students() {
    }

    public Students(String name, int age, String area) {
        this.name = name;
        this.age = age;
        this.area = area;
    }
    public String toName(String name) {
        return name;
    }
    public int toAge(int age) {
        return age;
    }
    public String toArea(String area) {
        return area;
    }

    public int[] grade(int[] student){
        Scanner scanner = new Scanner(System.in);
        System.out.println("국어, 수학, 사회, 과학 순으로 점수를 적어주세요;");
        for (int i = 0; i < 4 ; i++) {
            student[i] = scanner.nextInt();
        }return student;
    }
    public double average(int[] student){
        double sum =0;
        double average;
        for (int i = 0; i < student.length ; i++) {
            sum = sum+student[i];
        }average = sum /student.length;
        return average;
    }
    public double averageAll (double[] student){
        double sum =0;
        double average02 = 0;
        for (int i = 0; i < student.length ; i++) {
            sum = sum+student[i];
        }average02 = sum /student.length;
        return average02;
    }
}

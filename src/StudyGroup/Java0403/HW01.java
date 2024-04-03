package StudyGroup.Java0403;


import java.util.Arrays;

//(본인 이름) 학생의 국어점수는 100점, 수학점수는 40점, 영어점수는 60점이다.
//(본인 이름) 학생의 총점은 (연산하시오.)이다.
//(본인 이름) 학생의 평균은 (연산하시오.)이다.
public class HW01 {
    public static void main(String[] args) {

        int lang = 100;
        int math = 40;
        int Eng = 60;

        int sum = 0;
        int count = 0;
        int mul=0;


        for (int i =0; i<3;i++){
            sum = lang+math+Eng;
            count++;
        }System.out.println(sum);
        System.out.println(count);


        for (int j =0; j<count ;j++){
            mul = sum/count;
        }
        System.out.println(mul);


    }
}

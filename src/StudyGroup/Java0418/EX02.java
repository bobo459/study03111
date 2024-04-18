package StudyGroup.Java0418;

//(본인이름)의 교과점수가 저장되는 배열을 만들고 평균 점수를 구하시오.
//조건 : 국어(80점), 수학(60), 영어(70) ,사회(55), 과학(42)
public class EX02 {
    public static void main(String[] args) {
        int[] score = new int[]{80,60,70,55,42};
        float sum = 0;
        float ave ;

        for (int i = 0; i < score.length; i++) {
            sum = sum+ score[i];
        }
        ave = sum / score.length;

        System.out.println(sum);
        System.out.println(ave);



    }
}

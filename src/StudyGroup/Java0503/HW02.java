package StudyGroup.Java0503;
/*문제2.  각 반에 ‘김’씨 성을 가진 학생이 몇명인지를 구하시오.
A반 학생
[김개똥,이무기,이짱구,김맹구,신형만, 이진철, 김사랑, 신양철]
B반 학생
[이맹지, 김망중, 이배철, 신하람,신해성,민지성,이인아]
C반 학생
[홍익사,이안경,안철구,김민주,신이삼,김아경,민진아,이알구]*/
public class HW02 {
    public static void main(String[] args) {
        String[] classA = {"김개똥","이무기","이짱구","김맹구","신형만", "이진철", "김사랑", "신양철"};
        String[] classB = {"이맹지", "김망중", "이배철", "신하람","신해성","민지성","이인아"};
        String[] classC = {"홍익사","이안경","안철구","김민주","신이삼","김아경","민진아","이알구"};
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < classA.length; i++) {
            if (classA[i].contains("김")) {
                a++;
            }
        }
        for (int i = 0; i < classB.length; i++) {
            if (classB[i].contains("김")) {
                b++;
            }
        }
        for (int i = 0; i < classC.length; i++) {
            if (classC[i].contains("김")) {
                c++;
            }
        }
        System.out.println("A반의 김씨는 : "+a+" 명");
        System.out.println("A반의 김씨는 : "+b+" 명");
        System.out.println("A반의 김씨는 : "+c+" 명");


    }
}

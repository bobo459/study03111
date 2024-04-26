package StudyGroup.Java0426;

import java.util.Scanner;

// 유저에게 나이를 입력 받고,
// 나이에 맞는 학년을 출력하시오.
/*
초등학생
1학년 = 8살
2학년 = 9살
3학년 = 10살
4학년 = 11살
5학년 = 12살
6학년 = 13살
중학생
1학년 = 14살
2학년 = 15살
3학년 = 16살
고등학생
1학년 = 17살
2학년 = 18살
3학년 = 19살

20살부터는 모두 성인으로 출력
 */
public class HW04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 적어주세요 : ");
        int age = sc.nextInt();
        if (age>=8 && age<=13){       //8~13살까지이면
            int staAge = 8;           //8 부터 시작하는 변수를 만들고
            for (int i = 0; ; i++) {    //if의 조건에 해당하면 반복문을 실행한다.
                int g = i + 1;          //학년은 for문이 한번씩 돌때마다 1씩 증가할거고
                if (staAge == age) {       //8부터 시작한 숫자가 입력한 나이와 같으면 실행한 것이다.
                    System.out.println("초등학생 " + g + "학년");  //staAge와 입력받은 나이와 같아지면 그동안 돌았던 g을 출력한다.
                    break;             //실행이 되면 가까운 for문을 탈출한다.
                }
                staAge++;               //안에 if가 실행하지 않으므로 8부터 시작한 숫자는 +1씩 증가 한다.
            }
        } else if (age>=14 && age <= 16) {
            int staAge = 14;
            for (int i = 0; ; i++) {
                int g = i+1;
                if (staAge == age){
                    System.out.println("중학생 " + g + "학년");
                    break;
                }
                staAge++;
            }
        } else if (age >=17 && age <= 19){
            int staAge = 17;
            for (int i = 0; ; i++) {
                int g = i +1;
                if (staAge == age) {
                    System.out.println("고등학생 " + g + "학년");
                    break;
                }
                staAge++;
            }
        }

    }
}

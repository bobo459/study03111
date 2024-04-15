package StudyGroup.Java0415;

public class Example {
    //1번부터 5번까지 if문 활용
        public static void main(String[] args) {
//1. a가 100일때 true 출력하는 코드를 작성하시오. (a = 100)
            int a = 100;
            if (a==100){
                System.out.println("true");
            }

/*2. age가 0보다 작을때 : false, 0부터 7까지 중 하나일 때는 유치원, 8부터 13중 하나일 때는 초등학생,
 14부터 16까지 중 하나일때는 중학생, 17부터 19까지중 하나일 때는 고등학생, 나머지일때는 성인을 출력하는코드를 작성하시오.*/
            int age =0;
            if(age<0) {
                System.out.println("false");
            }else if (0<= age && age <= 7){
                System.out.println("유치원");
            }else if(8<= age && age <= 13){
                System.out.println("초등학생");
            }else if (14<= age && age <= 16) {
                System.out.println("중학생");
            }else if (17<= age && age <= 19) {
                System.out.println("고등학생");
            }else {
                System.out.println("성인");
            }

//3. boolean이 true면 참, false일때 거짓을 출력하는 코드를 작성하시오.
            if (true){
                System.out.println("참");
            }else {
                System.out.println("거짓");
            }


/* 4.num1은 10, num2는 20, num3은 100, num4는 50일때,
    합이 50이상이면 true, 이외는 fales를 출력하는 코드를 작성하시오.*/
            int num1 = 10, num2= 20, num3= 100, num4= 50;
            int sum =num1+num2+ num3+ num4;
            if (sum <= 50){
                System.out.println("참");
            }else {
                System.out.println("거짓");
            }


//5. num1과 num2의 곱이 num3과 num4의 합의 크기보다 큰것이 맞다면 true, 틀리다면 false를 출력하는 코드를 작성하시오.
            int mul = num1 *num2;
            int sum2 = num3+ num4;
            if (mul>sum2){
                System.out.println("true");
            }else {
                System.out.println("false");
            }

//6번부터 10번까지 for문 활용  
//6. 철수는 13까지 숫자를 세었고 34까지의 숫자를 세어야 한다면 철수가 세어야 할 남은 숫자들을 출력하는 코드를 작성하시오.
            for (int i = 13; i < 34; i++) {
                System.out.print(i+1 +", ");
            }
            System.out.println();
            
//7. 0부터 5까지 숫자에 +3을 한 모든 수를 출력하시오
            for (int i = 0; i < 5; i++) {
                System.out.print(i+3 + " ");
            } System.out.println();

//8. 100부터 90까지의 숫자를 출력하시오
            for (int i = 100; i > 0; i--) {
                if (i==89){
                    break;
                }
                System.out.print(i + " ");
            } System.out.println();

//9. 5번 반복해서 55,66,77,88,99을 출력하는 코드를 작성하시오.
                 for (int j = 5; j < 10; j++) {
                    System.out.print(j *11 + " ");
                } System.out.println();

//10.(o,p)o은 0부터 10까지,p은 100부터 90까지 출력하는 코드를 작성하시오.
                  int o =0;
                  int p = 0;
             for (int i = 0; i <= 10; i++) {
                 System.out.print(i + " ");
            } System.out.println();
             for (int i = 100; i >= 90; i--) {
                System.out.print(i + " ");
            }System.out.println();

//11번부터 15번까지 while문 활용
//11. 철수는 13까지 숫자를 세었고 34까지의 숫자를 세어야 한다면 철수가 세어야 할 남은 숫자들을 출력하는 코드를 작성하시오.
            int b=14;
             while (b <= 34){
                 System.out.print(b + " ");
                 b++;
             }System.out.println();

//12. 0부터 5까지 숫자에 +3을 한 모든 수를 출력하시오
            int c=0;
            while (c < 5){
                System.out.print( c + 3 + " ");
                c++;
            }System.out.println();

//13. 100부터 90까지의 숫자를 출력하시오
            int d=100;
            while (d >= 90){
                System.out.print(d + " ");
                d--;
            }System.out.println();


//14. 5번 반복해서 55,66,77,88,99을 출력하는 코드를 작성하시오.
            int e=5;
            while (e < 10){
                System.out.print(e *11 + " ");
                e++;
            }System.out.println();

//15. (q,w)q은 0부터 10까지,w은 100부터 90까지 출력하는 코드를 작성하시오.
            int q =0;
            int w = 100;
            while (q <= 10){
                System.out.print(q + " ");
                q++;
            }System.out.println();
            while (w >= 90){
                System.out.print(w + " ");
                w--;
            }System.out.println();

//16번부터 20번까지 do-while문 활용
//16. 철수는 13까지 숫자를 세었고 34까지의 숫자를 세어야 한다면 철수가 세어야 할 남은 숫자들을 출력하는 코드를 작성하시오.
            int t=14;
            do {
                System.out.print(t + " ");
                t++;
            }while (t <= 34);
            System.out.println();

//17. 0부터 5까지 숫자에 +3을 한 모든 수를 출력하시오
            int u=0;
            do {
                System.out.print(u+3 + " ");
                u++;
            }while (u < 5);
            System.out.println();

//18. 100부터 90까지의 숫자를 출력하시오
            int i=100;
            do {
                System.out.print(i + " ");
                i--;
            }while (i >= 90);
            System.out.println();

//19. 5번 반복해서 55,66,77,88,99을 출력하는 코드를 작성하시오.
            int h=5;
            do {
                System.out.print(h*11 + " ");
                h++;
            }while (h < 10);
            System.out.println();

//10. (z,x)z은 0부터 10까지,x은 100부터 90까지 출력하는 코드를 작성하시오.
            int z=0;
            int x=100;
            do {
                System.out.print(z + " ");
                z++;
            }while (z <= 10);
            do {
                System.out.print(x + " ");
                x--;
            }while (x >= 90);

            System.out.println();

//21번부터 22번까지는 switch문 활용
//21. f가 10이고 g가 5일때 두 변수를 곱한 값이 false 'false', true 'true'를 출력하는 코드를 작성하시오.
            int f=10;
            int g=5;
            int m;
            int mul2 = f * g ;
            if (mul2==50) {
                m=2;
            }else {
                m=1;
            }
                switch (m) {
                    case 1: {
                        System.out.println("true");
                        break;
                    }
                    case 2: {
                        System.out.println("false");
                        break;
                    }
                }

/*
            int f=10;
            int g=5;
            int mul2 = f*g;
            switch (mul2){
                case 50: {
                    System.out.println("50입니다");
                    break;
                }
                case 60: {
                    System.out.println("60입니다");
                    break;
                }
            }
*/

//22. numf는 100, nums는 50일때 두 수를 더한 값이 150이 맞다면 true, 틀리다면 false를 출력하는 코드를 작성하시오.
           int numf= 100;
           int nums= 50;
           int k;
           int sum5 = numf + nums;
           if (sum5==150){
               k=3;
           }else {
               k=4;
           }
           switch (k){
               case 3: {
                   System.out.println("true");
                   break;
               }
               case 4: {
                   System.out.println("false");
                   break;
               }
           }




    }
}

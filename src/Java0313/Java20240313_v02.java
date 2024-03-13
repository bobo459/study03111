package Java0313;

public class Java20240313_v02 {
            public static void main(String[] args) {

          /*      A aa = new A();//중간단계가 생략된거라 이런구조로 써준것. 돌아다니다가 A를 B로 바꿔져야 할 경우가 생길때 사용
                B b =(B)aa;
                C c = (c)aa;  //A -> C 다운캐스팅 (수동변환) : 불가능

                A ab = new B();//중간단계가 생략된거라 이런구조로 써준것. 돌아다니다가 A를 B로 바꿔져야 할 경우가 생길때 사용
                B b =(B)ab;
                C c = (c)ab;  //A -> C 다운캐스팅 (수동변환) : 불가능    //c를 찾을 수 없다는 에러가 나온다.아래 instanceof에서 작동할수있게 만들어줌


                B bd = new D();
                D d = (D)bd;
                A ad = new D();
                B b1 = (B)ad;
                D d1 = (D)ad;


                //----------instanceof 326P-----------

                A aa = new A();//중간단계가 생략된거라 이런구조로 써준것. 돌아다니다가 A를 B로 바꿔져야 할 경우가 생길때 사용
                B b =(B)aa;
                C c = (c)aa;

                A ab = new B();
                //10000라인의 코드가 있음
                //아래에서 ab변수를 B 또는 C 타입으로 캐스팅이 필요할 경우!!!
                if (ab instanceof B){    //A ab = new B();면 여기서 동작될것이고
                    B b =(B)ab;
                }else if (ab instanceof C){  //A ab = new C();면 위에꺼 제치고 여기서 동작할것이다
                    C c = (c)ab;
                }else {
                    System.out.println("둘 다 아니네...망했음"); //여기까지 내려오면 코드를 잘못짠거라 망한것이다.
                                                              //앞으로 코드짤때 else를 만들고 강력한 문구를 넣어 너가 잘못짠것을 확인해보렴...
                }

*/
            }
        }

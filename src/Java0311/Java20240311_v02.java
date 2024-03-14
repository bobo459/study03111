package Java0311;

public class Java20240311_v02 { //7.2.5 가변 길이배열 243p
    static int a = 1;

    static int b = 2;


    //스택틱이 다 붙어 있는 이유는 main에서 이용하는건 스택틱이 붙은 친구들을 사용하여야 한다.
    //-이유 : 인스턴스화 하지 않아도 사용가능한 이유는 스택틱을 사용하므로 정적으로 만들어준것.
    //       같은 클래스 안에 있는 친구는 new로 객체를 만들수 없어서 전부 스택틱을 붙여줄수 밖에 없는것
    public static void main(String[] args) {
        System.out.println(plusNums());     //프린트 라인이 오버로딩 되어 있어서 이름이 같아도
        System.out.println(plusNums(4, 5));
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println(plusNums(intArray, intArray.length)); //System.out.println(plusNums(intArray)); 에서
                                                                 // 안써도 되지만 뒤에  intArray.length를 붙여줘도 된다.
        System.out.println(plusNums(1,2,3,4,5,6)); //배열의 값으로 변함
    }

    //메소드의 오버로딩 - 이름이 같아도 시그니처가 달라서 사용가능한 것. 만약 시그니처가 같다면 에러가 날것이다
    //짧고 간단하게 설명이 가능해야한다
    //비슷한 이름의 오버라이딩도 있다. 둘은 다른거지만 이름이 비슷해서 면접시 질문을 많이함
    public static int plusNums() {
        return a + b;
    }

    public static int plusNums(int x, int y) {
        return x + y;
    }

    public static int plusNums(int[] intArray, int length) { //public static int plusNums(int[] intArray) 에서
        int sum = 0;                                         //int length 을 넣어 주므로 에러를 해결해준다.
        for (int i = 0; i < intArray.length; i++) {
            sum = sum + intArray[i];
        }
        return sum;
    }

    // 타입이 같으면 한번에 몰아서 해주자해서 가변 길이 배열 매소드를 해준다.
/*
    *//* 메소드를 한땀한땀 풀어서 적어봤다~ *//*
    public static int plusNums(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }
    public static int plusNums(int a, int b, int c, int d, int e, int f) {
        return a + b + c + d + e + f;
    }
  */
    /* 이제 가변길이 배열 메소드를 해보자 -몇 개가 오든 int의 형태면 몇 개든 받게 만들어 주겠다. */
    //잘 사용하지 않는다.
    public static int plusNums(int... values) { //위에 만든 이름과 배열이 같아서 에러가 났다
        int sum = 0;
        for (int i=0; i< values.length; i++) {
            sum = sum + values[i];
        }
        return sum;


    }
}


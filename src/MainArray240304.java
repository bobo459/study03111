public class MainArray240304 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //배열의 기본 선언법
        int[] intArray1 = {1,2,3,4,5};   // 값을 지정하지 않아도 갯수를 지정하지 않아도 표시됨으로 heep 이 됨
        System.out.println(intArray1[0]);

        int[] intArray2 = new int[5];    // 값이 없어서 갯수를 표시 해줘야함
        //intArray2 = {1,2,3,4,5};  //오류
        intArray2[0] = 1;
        intArray2[1] = 2;
        intArray2[2] = 3;
        intArray2[3] = 4;
        intArray2[4] = 5;
        System.out.println(intArray2[4]);

//        int[] intArray3 = new int[5];
//        //int[[ intArray3 = 가변의 길이를 가진 배열을 저장함
//        for (int i=0; i<5; i++) {
//            intArray3[i] = i+1;
//            System.out.print(intArray3[i] + " ");
//        }
//        System.out.println();

        int[] intArray3 = new int[50];
        //int[[ intArray3 = 가변의 길이를 가진 배열을 저장함
        for (int i=0; i<intArray3.length; i++) {    //.은 참조형 객체에만 .을 사용할수있다, 길이가 얼마나 됬건 갯수만큼 돌릴수 있다.
            intArray3[i] = i+1;
            System.out.print(intArray3[i] + " ");
        }
        System.out.println();

        int[] intArray4 = new int[] {1,2,3,4,5};
        System.out.println(intArray4[0]);

        //배열의 복사 (=참조복사)
        String[] str1 = {"black", "rad", "blue"};
        String[] str2 = str1;
        System.out.println("1" + str2[0]);
        str2[0] = "white";
        System.out.println("2" + str2[0]);
        System.out.println("3" + str1[0]);

        // 기본자료형의 복사는 ( = 값복사)    //어래인지는 값 공유 안함. heep은 값을 복사 하지만 항상은 아니다..
        int a = 3;
        int b = a;
        System.out.println("1 " + b);
        b = 6;
        System.out.println("2 " + b);
        System.out.println("3 " + a);


    }
}

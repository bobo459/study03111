public class java20240305String {
    public static void main(String[] args) {
        //String 클래스의 첫번째 특징
        //객체의 값을 변경하면 새로운 객체를 생성 (주소값이 새로운 주소로 변경)
        //String 객체 변수는 값이 수정되지 않고 항상 새로운 값을 만듬!!
        String str1 = new String("Start");
        String str2 = str1;
        System.out.println(str1);
        System.out.println(str2);
        str1 = "end";
        System.out.println(str1);
        System.out.println(str2);

        // String 클래스의 두번째 특징
        //리터럴로 입력하는 경우 해당 문자열을 재사용(=공유)함
        //리터럴로 입력되는 값은 런타임이전에 이미 메모리에 만들어짐
        String str5 = new String("Start");
        String str3 = "Start";
        String str4 = "Start";
        System.out.println(str3 == str4);
        System.out.println(str3 == str5);   //주소값의 비교한다.참조형이라서
        System.out.println(str3.equals(str5)); //문자열자체를 비교하면 true
                                               //주소값을 비교하지 않고 값을 비교하기 때문에 같은 문자값이라 true 로뜬다.
                                               // str3,str4,str5의 문자가 같은 글씨라
        //문자열의 '+' 연산
        String a1 = "Hello";
        String a2 = "world";
        System.out.println(a1 + " " + a2);   //196p내용. Hello + "띄어쓰기" + World 를 합치겠다는 내용
      /*  String a3 = a1 + a2;*/

        //문자열과 숫자의 '+' 연산
        System.out.println(1 + "Hi");        // 1Hi
        System.out.println(1 + 2 + "Hi");    // 3Hi  - 숫자먼저 나와 있으면 연산먼저 하기 때문에 더셈 먼저하고 글씨가 나오는것
        System.out.println("Hi" + 1 + 2);    // Hi12 - 글씨먼저 나와서 전체적으로 숫자도 글씨로 인식하므로 더셈을 안함
        System.out.println("Hi" + ( 1 + 2)); // Hi3  - 글씨 뒤에 연산을 해주고 싶으면 따로 계산하도록 따로 감싸줘야한다.
    }
}

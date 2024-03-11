public class java20240311main_v03 {   //247p 생성자
    public static void main(String[] args) {

        //클래스의 생성자가 없는 경우 => 기본생성자가 자동으로 만들어짐
        //매개변수가 있는 생성자만 있는 경우 => 기본생성자는 만들어지지 않는다!! - 뭔소리지..??
        //생성자의 오버로딩
        Student a = new Student();  //Student 클래스의 생성자를 지워도 에러는 나지 않는다. 생성자를 자동을 만들어준다.
        Student tom = new Student("tom", 20,"Seowl", "12345"); //기본 생성자를 만들어주지 않으면 사용할수 없다.
        Student steve = new Student("steve", 25 , "LA");


        //무조건 2개는 만들자!!-외우기!!
       /* 기본생성자와 일반생성자는 2개를 거의 세트로 만들어서 자주 사용하기때문에 */
/*        //기본생성자 구간
    public Student() {    //기본생성자- 서버 만들때 특별한 대우를 받음
        }

        //일반생성자 구간
    public Student(String name, int age, String address, String personalNum) {  //기본값을 주면서 만들수 있게 해줌.
            this.name = name;
            this.age = age;
            this.address = address;
            this.personalNum = personalNum;

         //오버레이가 가능하다
    public Student(String name, int age, String address) {  //기본값을 주면서 만들수 있게 해줌.
        this.name = name;
        this.age = age;
        this.address = address;
        this.personalNum = personalNum;
    }
        }*/


    }
}

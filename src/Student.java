public class Student {   //240313 - 클래스 패키지를 만들고 나중에 옮겨주면 인식을 새로 만든 패키지 student 클래스를 자동으로 사용한다고 처리되기 때문에
                                   //같은 디폴트패키지 안에서 에러가 난다면 student 앞에 패키지 이름이 붙어서 에러를 내는지 확인해봐야한다.
                                   //해결방안은 그냥 일일히 이름을 지원서 원상태로 복구해주기
    private String name;
    private int age;
    private String address;
    private String personalNum;  //자격이 있는 사람(=본인)만 확인해야하는 정보(예시 주민번호) - 앞에 private(개인적인) 붙이면 정보를 숨긴다.
                                 //읽을려면 getter,setter를 만들어주면된다.
    //기본생성자 구간
    public Student() {    //기본생성자- 서버 만들때 특별한 대우를 받음
    }

    //일반생성자 구간
    public Student(String name, int age, String address, String personalNum) {  //기본값을 주면서 만들수 있게 해줌.
        this.name = name;
        this.age = age;
        this.address = address;
        this.personalNum = personalNum;
    }

    //java20240311main_v03.java  -  생성자의 오버레이가 가능하다 ex)steve
    public Student(String name, int age, String address) {  //기본값을 주면서 만들수 있게 해줌.
        this.name = name;
        this.age = age;
        this.address = address;
        this.personalNum = personalNum;
    }

    //GETTER,SETTER는 일반생성자 구간의 끝에서 오른버튼 Generate - Constructor 으로 만들어준다
    public String getName() {   //필드하나당 GETTER, SETTER 가 생겨서 지금 총 6개의 코드가 생성됨
        return name;            //값을 받을 준비하고 GET을 해줘야한다.
    }                           //변수 앞에 GET,SET 이 붙음
                                //return은 메소드 마지막에 붙는다
    public void setName(String name) {  //void(보이드) = 비어있다. 데이터 타입 또는 보이드가 붙어야한다.
        this.name = name;
    }

    public int getAge() {  //괄호안에 없는이유 그냥 리턴만 읽어주면 되기에 값이 따로 필요없음
        return age;
    }

    public void setAge(int age) { //괄호안에 내용이 있는 이유는 뭘 어떻게 할지 내용을 알려줘야함.
        this.age = age;           // 매개변수 (= 파라미터) : 값을 외부에서 주겠다는 내용
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPersonalNum() {   //getter만 남기고 setter를 지워주면 변경할수 없다.
        return personalNum;            // 생성시에만 값을 넣을수 있고 수정안됨-주민번호는 태어날때만 생성되고 변경할수없을때 사용

    }

    //일반생성자 구간

    //메소드 구간
    public void displayname(){       // 메소드 [public (퍼블릭)을 붙이게 공식처럼 일단 외우기]
        System.out.println(this.name);  //이름을 출력하기 위한 코드, call매소드 라고 부름
    }

    public void displayage(){
        System.out.println(this.age);   //this를 붙이는게 정석이다.
    }

    public void displataddress() {
        System.out.println(this.address);
    }

    public void displayAll() {
        System.out.println(this.name + " " + this.age + " " + this.address);
    }


}

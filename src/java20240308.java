public class java20240308 {
    public static void main(String[] args) {

        //모든 참조형이 이런 구조로 되어있다.
        //1번 방법
        Student tom = new Student("Tom", 18, "Deajeon", "123456");
        //Student라는 클래스를 사용하겠다, 문구는 tom = new 새로운 내용을 정의하겠다, Student 클래스를 쓸것이다(힙에 생성되는 내용값을 입력해주겠다)
        Student steve = new Student("steve", 25, "Seoul", "123456");
        Student paul = new Student();
//        //2번 방법 - private 을 붙이면 더이상 이 코드로는 읽을 수 없어진다.
//        paul.name ="Paul";
//        paul.age = 22;
//        paul.address = "Incheon";

        //getter,setter
        paul.setName("Paul");
        paul.setAge(22);
        paul.setAddress("Incheon");
        tom.displayAll();
        steve.displayAll();
        paul.displayAll();
        System.out.println(tom.getPersonalNum()); //에러난다면 다시 지우고 쓰면 나옴.getter를 이용해 읽음

/*        System.out.println(tom.name);
        System.out.println(tom.age);
        System.out.println(tom.address);
        */
//
//        tom.displayname();   //메소드의 역활-특정한 코드만 실행시키기위해 만들어준것 System.out.println(tom.name); 을 줄이기 위해 짠것
//        tom.displayage();
//        tom.displataddress();
//        tom.displayAll();
//
//        steve.displayname();
//        steve.displayage();
//        steve.displataddress();
//        steve.displayAll();

        //메소드 호출
        int[] numberList = {12, 34, 56, 32, 84, 99, 73, 69};
        int[] numberList2 = {123,345,235,7898,467};
        getSumAvg(numberList); //어그먼트 =인수, 인수를던지는 입장
        getSumAvg(numberList2);
    }

    public static void getSumAvg(int[] numberList) {  //인수를 받아줄 뭔가가 필요하다, 이름이 같아도 다른 친구다
                                                   //public 모든 클래스에 쓰게 만들거면 붙여주면된다, static으로 시작한 클래스는 모두 static으로 메인시작해줘야함
/*        // 7. 아래 배열의 총합과 평균을 출력
        int[] numberList = {12, 34, 56, 32, 84, 99, 73, 69};
        int sum = 0;
        for (int i = 0; i < numberList.length; i++) {
            sum = sum + numberList[i];
        }
        int average = sum / numberList.length;
        System.out.println(sum + " " + average);
    */
        // 7. 아래 배열의 총합과 평균을 출력
        int sum = 0;
        for (int i = 0; i < numberList.length; i++) {
            sum = sum + numberList[i];
        }
        int average = sum / numberList.length;
        System.out.println(sum + " " + average);


    }
}

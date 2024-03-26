package Java0325;

public class Main {
    public static void main(String[] args) {
      //  JavaAbstract javaAbstract = new JavaAbstract();  //추상클래스는 인스턴스화 안됨
        JavaChild javeChild = new JavaChild();  //추상클래스를 상속한 클래스는 인스턴스화 가능
        System.out.println(javeChild.getValue());   //초기값이라 부모가 설정한 값만 나오게 된다.
        System.out.println(javeChild.getString());

/*        JavaAbstract javaAbstract1 = new JavaAbstract(20,"Apple");
        System.out.println(javaAbstract1.getValue());
        System.out.println(javaAbstract1.getString());*/


        JavaChild javaChild1 = new JavaChild(20,"Apple"); //10개라면 순서대로 적어줘야한다.
        System.out.println(javaChild1.getValue());
        System.out.println(javaChild1.getString());

        JavaChild javaChild2 = new JavaChild();  //세터는 10개라도 각각이 독립적이라 순서 상관없이 적어도 된다.
        javaChild2.setValue(999);
        javaChild2.setString("Banana");
        System.out.println(javaChild2.getValue());
        System.out.println(javaChild2.getString());

    }
}

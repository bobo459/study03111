package Study20240729;



class B{
    int m1, m2, m3, m4;
    B(){
        m1=1;
        m2=2;
        m3=3;
        m4=4;
    }
    B(int a){
        this();
        m1=a;
    }
    B(int a, int b){
        this(a);
        m2=b;
    }
    void print(){
        System.out.println(m1+" ");
        System.out.println(m2+" ");
        System.out.println(m3+" ");
        System.out.println(m4);
        System.out.println();
    }
}
public class Java20240730 {
    public static void main(String[] args) {
        B b1=new B();
        B b2=new B(10);
        B b3=new B(20, 20);
        b1.print();
        b2.print();
        b3.print();


    }
}

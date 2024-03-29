package Java0326P.Java0326Example2;

public class Main {  //삼각형 구하기~~
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5,5);
        System.out.println("Area: "+ triangle.TrianglecalculateArea());
        System.out.println("Perimeter: "+ triangle.TriangcalculatePerimeter());
    }
}

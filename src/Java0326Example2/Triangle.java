package Java0326Example2;

//삼각형을 면,둘레를 구하는 식을 만들어보자
public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle() {
    }

    public Triangle(int length, int width) {
        this.base = base;
        this.height = height;
    }



    @Override
    public double TrianglecalculateArea() {
        return base * height * 0.5;  //나누기가 시간이 더 걸려서 곱하기를 주로 쓰고 나누기를 사용안한다.
    }

    @Override
    public double TriangcalculatePerimeter() {
        return 3*base ;
    }
}

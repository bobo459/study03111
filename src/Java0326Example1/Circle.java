package Java0326Example1;

public class Circle implements Shape {  //3.원의 면적과 둘레
    private double radius;  //반지름
    private final double PI = 3.14159265358979;  //파이값. 상수일경우는 대문자를 사용.더블형태가 편하므로 사용

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * (radius * radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * PI;
    }
}

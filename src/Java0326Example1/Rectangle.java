package Java0326Example1;

public class Rectangle implements Shape { //2.직사각형
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length; // 길이
        this.width = width;   // 너비
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

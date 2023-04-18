package src.shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {}

    public double getArea() {
        System.out.println("rectangle");
        return length * width;
    }

    public double getPerimeter() {
        System.out.println("rectangle");
        return 2 * length + 2 * width;
    }
}

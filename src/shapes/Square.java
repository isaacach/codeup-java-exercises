package src.shapes;

public class Square extends Rectangle{

    public Square(double side) {
        super(side, side);
    }

    public double getArea() {
        System.out.println("square");
        return this.length * this.length;
    }

    public double getPerimeter() {
        System.out.println("square");
        return 4 * this.length;
    }
}

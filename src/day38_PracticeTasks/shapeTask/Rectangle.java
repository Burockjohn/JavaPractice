package day38_PracticeTasks.shapeTask;

public class Rectangle extends Shape {

    private double width, length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.err.println("Invalid value");
            System.exit(0);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {

        if (length <= 0) {
            System.err.println("Invalid value");
            System.exit(0);
        }
        this.length = length;
    }

    @Override
    public double calcArea() {
        return getLength() * getWidth();
    }

    @Override
    public double calcPerimeter() {
        return (getLength() + getWidth()) * 2;
    }
}

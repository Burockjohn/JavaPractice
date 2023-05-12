package day38_PracticeTasks.shapeTask;

public class Circle extends Shape {

    private double radius;
    private static double pi = 3.14;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.err.println("Invalid value");
            System.exit(0);
        }
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return getRadius() * getRadius() * pi;
    }

    @Override
    public double calcPerimeter() {
        return getRadius() * 2 * pi;
    }
}

/*

r
	pi

	toString(): name, r, pi, area, perimeter

 */
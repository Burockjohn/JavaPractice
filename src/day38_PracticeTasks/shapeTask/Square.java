package day38_PracticeTasks.shapeTask;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            System.err.println("Invalid value");
            System.exit(0);
        }
        this.side = side;
    }

    @Override
    public double calcArea() {
        return getSide() * getSide();
    }

    @Override
    public double calcPerimeter() {
        return getSide() * 4;
    }


}

/*

Square
	s

	toString(): name, s, area, perimeter

 */
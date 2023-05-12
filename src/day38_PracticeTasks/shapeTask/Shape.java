package day38_PracticeTasks.shapeTask;

public class Shape {

    private String name;

    public Shape(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calcArea() {
        return 0;
    }

    public double calcPerimeter() {
        return 0;
    }

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                " area= " + calcArea() +
                " perimeter= " + calcPerimeter() +
                '}';
    }
}

/*

Shape:
	variable:
		name

	Add A constructor to set the filed

	Methods:
		area(){return 0}
		perimeter{return 0}
		toString(): name, area, perimeter


Circle
	r
	pi

	toString(): name, r, pi, area, perimeter

Square
	s

	toString(): name, s, area, perimeter

Rectangle
	l
	w

	toString(): name, l, w, area, perimeter


 */
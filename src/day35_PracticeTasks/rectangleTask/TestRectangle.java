package day35_PracticeTasks.rectangleTask;

public class TestRectangle {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(4, 5);
        System.out.println(rect1);

        rect1.setWidth(8);
        rect1.setLength(2.5);

        System.out.println(rect1.getWidth());
        System.out.println(rect1.getLength());
        System.out.println(rect1);

    }
}

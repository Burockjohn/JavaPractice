package day35_PracticeTasks.squareTask;

import day35_PracticeTasks.squareTask.Square;

public class TestSquare {

    public static void main(String[] args) {

        Square square1 = new Square(5);

        System.out.println(square1);

        square1.setSide(10);
        System.out.println(square1.getSide());

        System.out.println(square1);

    }
}

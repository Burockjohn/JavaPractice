package day19_PracticeTasks;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean flag = true;

        while (flag) {

            System.out.println("Enter the length of the Rectangle:");
            int length = input.nextInt();

            if (length <= 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }

            System.out.println("Enter the length of the Rectangle:");
            int width = input.nextInt();

            if (width <= 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }

            int area = length * width;
            int perimeter = 2 * (length + width);

            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another Rectangle?");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid entry, please re-enter");
                answer = input.next();
            }

            if (answer.equals("no")) flag = false;

        }

        System.out.println("Thank you for using Cydeo Rectangle Calculator APP");

        input.close();
    }


}


/*

3. Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message
				"Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message
				"Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */
package day18_PracticeTasks;

import java.util.Scanner;

public class Calculate2Numbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {


            System.out.println("Enter your first number");
            int num1 = input.nextInt();
            System.out.println("Enter your second number");
            int num2 = input.nextInt();

            System.out.println("Enter your math operator");
            char operator = input.next().charAt(0);

            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.err.println("Invalid Operator, please re-enter:");
                operator = input.next().charAt(0);
            }

            double result = 0;

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else {
                result = num1 / num2;
            }

            System.out.println("result = " + result);
            System.out.println("Would you like to continue?");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid answer, Would you like to continue?");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")) {
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }


        }

        input.close();
    }
}

/*

3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */
package day17_PracticeTasks;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = input.nextInt();

        System.out.println("Enter second number");
        int num2 = input.nextInt();

        System.out.println("Entre math operator");
        char operator = input.next().charAt(0);

        while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
            System.out.println("Invalid operator, please re-enter");
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

    }
}

/*

    3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)

 */
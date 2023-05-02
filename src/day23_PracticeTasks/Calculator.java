package day23_PracticeTasks;

public class Calculator {

    public static void calculator(int num1, int num2, char operator) {

        String result = "Invalid";

        if (operator == '-' || operator == '+' || operator == '*' || operator == '/') {

            if (operator == '-') {
                result = "Subtraction: " + (num1 - num2);
            } else if (operator == '+') {
                result = "Addition: " + (num1 - num2);
            } else if (operator == '*') {
                result = "Multiplication: " + (num1 * num2);
            } else {
                result = "Division: " + (num1 / num2);
            }

        }

        System.out.println(result);

    }
}

/*

	15. create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result

 */
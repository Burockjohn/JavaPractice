package day16_PracticeTasks;

import java.util.Scanner;

public class MultiplyTwoNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = input.nextInt();
        while (num1 < 0) {
            System.out.println("Invalid, please re-enter");
            num1 = input.nextInt();
        }

        System.out.println("Enter second number");
        int num2 = input.nextInt();
        while (num2 < 0) {
            System.out.println("Invalid, please re-enter");
            num2 = input.nextInt();
        }

        int result = 0;

        for (int i = 0; i < num2; i++) {
            result += num1;

        }

        System.out.println("result = " + result);


    }
}

/*

3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200
 */
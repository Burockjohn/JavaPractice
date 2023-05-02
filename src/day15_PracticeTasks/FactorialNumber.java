package day15_PracticeTasks;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();
        int total = 1;

        for (int i = num; i >= 1; i--) {
            total *= i;
        }

        System.out.println("total = " + total);

        input.close();

    }
}

/*

	4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */
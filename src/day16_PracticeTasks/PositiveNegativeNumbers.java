package day16_PracticeTasks;

import java.util.Scanner;

public class PositiveNegativeNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int countPositive = 0,
                countNegative = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Enter " + i + ". number");
            int number = input.nextInt();

            if (number > 0) {
                countPositive++;
            } else if (number < 0) {
                countNegative--;
            }
        }

        System.out.println("countPositive = " + countPositive);
        System.out.println("countNegative = " + countNegative);

        input.close();

    }


}

/*

1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative

 */

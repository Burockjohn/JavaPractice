package day15_PracticeTasks;

public class SumOfOdd {

    public static void main(String[] args) {

        int sumOfEven = 0, sumOfOdd = 0;

        for (int i = 1; i < 101; i++) {

            if (i % 2 == 0) {
                sumOfEven += i;
            } else {
                sumOfOdd += i;
            }

        }

        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("sumOfEven = " + sumOfEven);

    }
}

/*

	1. Write a program that can return the sum of even numbers between 1 to 100

	2. Write a program that can return the sum of odd numbers between 1 to 100

 */
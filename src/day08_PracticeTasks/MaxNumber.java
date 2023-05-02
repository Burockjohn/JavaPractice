package day08_PracticeTasks;

public class MaxNumber {

    public static void main(String[] args) {


        /*
        Write a program that can print the maximum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number

         */

        int n1 = 100,
                n2 = 200;

        boolean max = n1 > n2,
                min = n2 > n1,
                eq = n1 == n2;

        if (max) {

            System.out.println(n1 + " is maximum number");
        }

        if (min) {
            System.out.println(n2 + " is maximum number");
        }

        if (eq) {
            System.out.println(n1 + " and " + n2 + " are equal" );
        }
    }
}

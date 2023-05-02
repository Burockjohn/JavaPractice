package day17_PracticeTasks;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int a = 12,
                b = 6,
                counter = 0;

        while (a >= b) {

            a -= b;
            counter++;
        }

        System.out.println("counter = " + counter);

    }
}

/*

1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.

 */
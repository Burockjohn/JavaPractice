package day23_PracticeTasks;

public class OddNumbers1To100 {

    public static void odd(int num1, int num2) {

        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) System.out.print(i + "\t");
        }

        System.out.println();

    }
}


/*

1. create a method that can print odd numbers between 1~100 in a same line saperated by space

 */
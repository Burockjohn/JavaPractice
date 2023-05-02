package day21_PracticeTasks;

import java.util.Arrays;

public class DescendingOrder {

    public static void main(String[] args) {

        int numbers[] = {1, 4, 8, 2, 6, 9};
        int result[] = new int[numbers.length];

        Arrays.sort(numbers);

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = numbers[i];
        }

        System.out.println(Arrays.toString(result));

    }
}

/*

1. Write a program that sort the array of integer in descending order

 */
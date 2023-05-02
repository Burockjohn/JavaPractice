package day24_PracticeTasks;

import java.util.Arrays;

public class MaximumNumber {

    //returns the maximum number from integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }


    //returns the maximum number from double array
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }




}

/*

2. create a method that can return the maximum number from an array of integers

 */

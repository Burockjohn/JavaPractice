package day24_PracticeTasks;

import java.util.Arrays;

public class MinimumNumber {
    //returns the minimum number from integer array
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }


    //returns the minimum number from double array
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

}


/*

3. create a method that can return the minimum number from an array of integers

 */
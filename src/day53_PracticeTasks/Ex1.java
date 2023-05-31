package day53_PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//1. Create a functional interface named ListFunction that contains the following abstract method:
//R apply(List<T>  list);

interface ListFunction<T, R> {
    R apply(List<T> list);
}

public class Ex1 {

    public static void main(String[] args) {

        // 1.1 Create a function that can return the maximum number from a list of Integer
        ListFunction<Integer, Integer> maxNumber = list -> Collections.max(list);

        // 1.2 Create a function that can return the minimum number from a list of Integer
        ListFunction<Integer, Integer> minNumber = list -> Collections.min(list);

        // 1.3 Create a function that can return the longest String from a List of String
        ListFunction<String, String> longestString = list -> {
            String longest = list.get(0);
            for (String each : list) {
                if (each.length() > longest.length()) longest = each;
            }

            return longest;
        };

        // 1.4 Create a function that can return the shortest String from a List of String
        ListFunction<String, String> shortestString = list -> {
            String shortest = list.get(0);
            for (String each : list) {
                if (each.length() < shortest.length()) shortest = each;
            }

            return shortest;
        };

        // 1.5 Create a function that can convert List of integer to int array
        ListFunction<Integer, int []> convertToIntArray = list -> {
            int[] array = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                array[i] = list.get(i);
            }
            return array;
        };

        // 1.6 Create a function that can convert List of double to double array
        ListFunction<Double, double []> convertToDoubleArray = list -> {
            double[] array = new double[list.size()];
            for (int i = 0; i < list.size(); i++) {
                array[i] = list.get(i);
            }
            return array;
        };


    }

}

/*

1. Create a functional interface named ListFunction that contains the following abstract method:

		R apply(List<T>  list);

	Use ListFunction functional interface to:
		1.1 Create a function that can return the maximum number from a list of Integer

		1.2 Create a function that can return the minimum number from a list of Integer

		1.3 Create a function that can return the longest String from a List of String

		1.4 Create a function that can return the shortest String from a List of String

		1.5 Create a function that can convert List of integer to int array

		1.6 Create a function that can convert List of double to double array


 */
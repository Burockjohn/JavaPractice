package day53_PracticeTasks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class Ex4 {

    public static void main(String[] args) {

        // 4.1 Create a function that can return the sum of digits from a string
        Function<String, Integer> sumOfDigits = str -> {
            Integer result = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isDigit(ch)) result += Character.getNumericValue(ch);
            }
            return result;
        };

        //System.out.println(sumOfDigits.apply("B1u2r3a4k"));

        // 4.2 Create a function that can convert a Set of Integers to List of Integers
        Function<Set<Integer>, List<Integer>> convertSetToList1 = set -> {
            List<Integer> list = new LinkedList<>();
            for (Integer each : set) {
                list.add(each);
            }
            return list;
        };

        // 4.3 Create a function that can convert a Set of String to List of String
        Function<Set<String>, List<String>> convertSetToList2 = set -> {
            List<String> list = new LinkedList<>();
            for (String each : set) {
                list.add(each);
            }
            return list;
        };

        // 4.4 Create a function that can return the reversed version of an int array
        Function<int[], int[]> reverse1 = arr -> {
            int reversed[] = new int[arr.length];
            for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
                reversed[j] = arr[i];
            }
            return reversed;
        };

        // 4.5 Create a function that can return the reversed version of a String array
        Function<String[], String[]> reverse2 = arr -> {
            String reversed[] = new String[arr.length];
            for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
                reversed[j] = arr[i];
            }
            return reversed;
        };

        // 4.6 Create a function that can return the sorted (descending) version of an int array
        // Note: you can use the reverse function you created at 4.4
        Function<int[], int[]> descending1 = arr -> {
            Arrays.sort(arr);
            return reverse1.apply(arr);
        };
        //System.out.println(Arrays.toString(descending.apply(new int[]{1, 3, 8, 4, 2})));

        // 4.7 Create a function that can return the sorted (decending) version of a String array
        // Note: you can use the reverse function you created at 4.5
        Function<String[], String[]> descending2 = arr -> {
            Arrays.sort(arr);
            return reverse2.apply(arr);
        };

    }
}

/*

4. Use Function functional interface to:
		4.1 Create a function that can return the sum of digits from a string

		4.2 Create a function that can convert a Set of Integers to List of Integers

		4.3 Create a function that can convert a Set of String to List of String

		4.4 Create a function that can return the reversed version of an int array

		4.5 Create a function that can return the reversed version of a String array

		4.6 Create a function that can return the sorted (decending) version of an int array
				Note: you can use the reverse function you created at 4.4

		4.7 Create a function that can return the sorted (decending) version of a String array
				Note: you can use the reverse function you created at 4.5

 */
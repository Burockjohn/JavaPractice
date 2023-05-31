package day53_PracticeTasks;

interface ArrayFunction<T, R> {
    R apply(T[] array);
}


public class Ex2 {

    public static void main(String[] args) {

        // 2.1 Create a function that can return the maximum number from an array of Integers

        ArrayFunction<Integer, Integer> maxNumber = arr -> {
            Integer max = Integer.MIN_VALUE;
            for (Integer each : arr) {
                if (each > max) max = each;
            }
            return max;
        };

        // 2.2 Create a function that can return the minimum number from an array of Integers
        ArrayFunction<Integer, Integer> minNumber = arr -> {
            Integer min = Integer.MAX_VALUE;
            for (Integer each : arr) {
                if (each > min) min = each;
            }
            return min;
        };

        // 2.3 Create a function that can return the longest String from an array of String
        ArrayFunction<String, String> longestString = arr -> {
            String longest = arr[0];
            for (String each : arr) {
                if (each.length() > longest.length()) longest = each;
            }

            return longest;
        };

        // 2.4 Create a function that can return the shortest String from an array of String
        ArrayFunction<String, String> shortestString = arr -> {
            String shortest = arr[0];
            for (String each : arr) {
                if (each.length() > shortest.length()) shortest = each;
            }

            return shortest;
        };

    }
}

/*

2. Create a functional interface named ArrayFunction that contains the following abstract method:

		R apply(T[] array);

	Use the ArrayFunction interface to:

		2.1 Create a function that can return the maximum number from an array of Integers

		1.2 Create a function that can return the minimum number from an array of Integers

		1.3 Create a function that can return the longest String from an array of String

		1.4 Create a function that can return the shortest String from an array of String

 */
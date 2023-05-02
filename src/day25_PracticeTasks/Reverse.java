package day25_PracticeTasks;

public class Reverse {

    public static int[] reverse(int arr[]) {

        int reverse[] = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }

        return reverse;

    }


    public static double[] reverse(double arr[]) {

        double reverse[] = new double[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }

        return reverse;

    }


    public static char[] reverse(char arr[]) {

        char reverse[] = new char[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }

        return reverse;

    }


    public static String[] reverse(String arr[]) {

        String reverse[] = new String[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }

        return reverse;

    }


}

/*

Task 4:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array

 */
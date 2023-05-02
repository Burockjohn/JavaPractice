package day25_PracticeTasks;

public class MergeTwoArrays {

    private static double arr2;

    public static int[] merge(int arr1[], int arr2[]) {

        int result[] = new int[arr1.length + arr2.length];

        int j = 0;

        for (int each : arr1) {
            result[j++] = each;
        }

        for (int each : arr2) {
            result[j++] = each;
        }

        return result;

    }

    public static double[] merge(double arr1[], double arr2[]) {

        double result[] = new double[arr1.length + arr2.length];

        int j = 0;

        for (double each : arr1) {
            result[j++] = each;
        }

        for (double each : arr2) {
            result[j++] = each;
        }

        return result;

    }

    public static char[] merge(char arr1[], char arr2[]) {

        char result[] = new char[arr1.length + arr2.length];

        int j = 0;

        for (char each : arr1) {
            result[j++] = each;
        }

        for (char each : arr2) {
            result[j++] = each;
        }

        return result;

    }

    public static String[] merge(String arr1[], String arr2[]) {

        String result[] = new String[arr1.length + arr2.length];

        int j = 0;

        for (String each : arr1) {
            result[j++] = each;
        }

        for (String each : arr2) {
            result[j++] = each;
        }

        return result;

    }

}

/*

Task1:
	1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.

 */
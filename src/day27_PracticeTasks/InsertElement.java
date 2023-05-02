package day27_PracticeTasks;

import java.util.Arrays;

public class InsertElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(insertElement(arr, 2, 100)));

    }

    public static int[] insertElement(int arr[], int n, int newElement) {

        if (n < 0 || n >= arr.length) {
            System.err.println("Invalid Index: " + n);
            System.exit(0);
        }

        int result[] = new int[arr.length + 1];
        int j = 0;

        result[n] = newElement;

        for (int i = 0; i < arr.length; i++) {
            if (i == n) j++;
            result[j++] = arr[i];
        }

        return result;

    }


    public static double[] insertElement(double arr[], int n, double newElement) {

        if (n < 0 || n >= arr.length) {
            System.err.println("Invalid Index: " + n);
            System.exit(0);
        }

        double result[] = new double[arr.length + 1];
        int j = 0;

        result[n] = newElement;

        for (int i = 0; i < arr.length; i++) {
            if (i == n) j++;
            result[j++] = arr[i];
        }

        return result;

    }


    public static char[] insertElement(char arr[], int n, char newElement) {

        if (n < 0 || n >= arr.length) {
            System.err.println("Invalid Index: " + n);
            System.exit(0);
        }

        char result[] = new char[arr.length + 1];
        int j = 0;

        result[n] = newElement;

        for (int i = 0; i < arr.length; i++) {
            if (i == n) j++;
            result[j++] = arr[i];
        }

        return result;

    }


    public static String[] insertElement(String arr[], int n, String newElement) {

        if (n < 0 || n >= arr.length) {
            System.err.println("Invalid Index: " + n);
            System.exit(0);
        }

        String result[] = new String[arr.length + 1];
        int j = 0;

        result[n] = newElement;

        for (int i = 0; i < arr.length; i++) {
            if (i == n) j++;
            result[j++] = arr[i];
        }

        return result;

    }

}

/*

1. Insert Task:
		1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element. the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array

 */
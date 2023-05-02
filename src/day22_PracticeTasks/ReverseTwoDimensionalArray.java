package day22_PracticeTasks;

import java.util.Arrays;

public class ReverseTwoDimensionalArray {

    public static void main(String[] args) {

        int arr[][] = {{1, 2, 3}, {4, 5, 6,7}, {8,9,10,11,12,13}};
        int reverse[][] = new int[arr.length][];

        for (int i = arr.length - 1, x = 0; i >= 0; i--, x++) {
            reverse[x] = new int[arr[i].length];
            for (int j = arr[i].length - 1, y = 0; j >= 0; j--, y++) {
                reverse[x][y] = arr[i][j];
            }
        }

        System.out.println(Arrays.deepToString(reverse));

        //alternative solution

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};
        int[] arr3 = {8, 9, 10, 11, 12, 13};

        int[][] arr2D = new int[3][];
        arr2D[0] = arr1;
        arr2D[1] = arr2;
        arr2D[2] = arr3;

        int[][] result = new int[arr2D.length][];

        for (int i = 0; i < arr2D.length; i++) {
            int[] temp = new int[arr2D[i].length]; // temporary array variable to hold the elements
            for (int j = 0; j < arr2D[i].length; j++) {
                temp[(temp.length - 1) - j] = arr2D[i][j]; // getting the last elements of each 1D array and assigning to the beginning indexes of temp array
            }
            result[(arr2D.length - 1) - i] = temp; // assign the 1D temp array to each index of the 2D array
        }

        System.out.println(Arrays.deepToString(result));


    }

}

/*

1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};

 */
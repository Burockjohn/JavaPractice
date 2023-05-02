package day24_PracticeTasks;

import java.util.Arrays;

public class ReversedArray {

    public static int[] reversedArray(int arr[]) {

        int reversedArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }

        return reversedArr;

        /*

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

         */

    }

}

/*

8. Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}

 */
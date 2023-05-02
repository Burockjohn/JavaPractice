package day24_PracticeTasks;

import java.util.Arrays;

public class RemoveElement {

    public static int[] removeElement(int arr[], int number) {

        if(number < 0 || number > arr.length-1){
            System.err.println("Invalid Index: "+number);
            System.exit(0);
        }

        int removed[] = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == 2) {
                continue;
            }

            removed[j++] = arr[i];
        }

        return removed;

    }

    public static void main(String[] args) {


        int arr[] = {10, 20, 30, 40, 50, 60};

        System.out.println(Arrays.toString(removeElement(arr, 2)));

    }

}

/*

10. create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}

 */

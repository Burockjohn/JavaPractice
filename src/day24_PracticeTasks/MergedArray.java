package day24_PracticeTasks;

import java.util.Arrays;

public class MergedArray {

    public static int[] mergedArray(int arr1[], int arr2[]) {

        int mergedArr[] = new int[arr1.length + arr2.length];

        int i = 0;

        for (int each : arr1) {
            mergedArr[i++] = each;
        }

        for (int each : arr2) {
            mergedArr[i++] = each;
        }

        return mergedArr;

    }


}

/*


	7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}

 */
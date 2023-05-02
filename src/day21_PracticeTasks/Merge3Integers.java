package day21_PracticeTasks;

import java.util.Arrays;

public class Merge3Integers {

    public static void main(String[] args) {

        int nums1[] = {30, 10, 20};
        int nums2[] = {15, 40, 25, 35, 64};
        int nums3[] = {8, 9, 17, 5, 4, 1};

        int mergedRegular[] = new int[nums1.length + nums2.length + nums3.length];

        int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            mergedRegular[j] = nums1[i];
            j++;
        }

        for (int i = 0; i < nums2.length; i++) {
            mergedRegular[j] = nums2[i];
            j++;
        }

        for (int i = 0; i < nums3.length; i++) {
            mergedRegular[j] = nums3[i];
            j++;
        }

        System.out.println(Arrays.toString(mergedRegular));

        // harder one

        System.out.println("-".repeat(60));

        int mergedConsecutively[] = new int[nums1.length + nums2.length + nums3.length];

        int num1 = nums1.length,
                num2 = nums2.length,
                num3 = nums3.length;

        int x = 0,
                y = 0,
                z = 0,
                k = 0;
        while (x < num1 && y < num2 && z < num3) {
            mergedConsecutively[k++] = nums1[x++];
            mergedConsecutively[k++] = nums2[y++];
            mergedConsecutively[k++] = nums3[z++];
        }
        while (x < num1) {
            mergedConsecutively[k++] = nums1[x++];
            if (y < num2) {
                mergedConsecutively[k++] = nums2[y++];
            }
            if (z < num3) {
                mergedConsecutively[k++] = nums3[z++];
            }
        }
        while (y < num2) {
            mergedConsecutively[k++] = nums2[y++];
            if (z < num3) {
                mergedConsecutively[k++] = nums3[z++];
            }
        }
        while (z < num3) {
            mergedConsecutively[k++] = nums3[z++];
        }

        System.out.println(Arrays.toString(mergedConsecutively));

    }
}

/*

5. Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}


 */
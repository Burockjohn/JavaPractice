package day20_PracticeTasks;

public class CommonElements {

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5},
                arr2[] = {4, 5, 6, 7, 8};

        String common = "";

        for (int i = 0; i < arr1.length; i++) {
            int each = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                int num = arr2[j];

                if (num == each) common += num + " ";
            }
        }

        System.out.println("common = " + common.trim());

    }
}

/*

7. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5

 */
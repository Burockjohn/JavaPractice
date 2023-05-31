package day53_PracticeTasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;

public class Ex5 {

    public static void main(String[] args) {

        /*
        5.1 Create a function that can check if two array are equal and contains the same elemnts
        ex: arr1 = {3,2,1}
        arr2 = {2,1,3}

        output: true
        */
        BiPredicate<int[], int[]> isEqual1 = (arr1, arr2) -> {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        };

        /*
        5.2 Create a function that can check if the first array contains all the elements of the second array:
				ex: arr1 = {1,2,3,4,5,6}
					arr2 = {7,8}

				output: false
        */
        BiPredicate<int[], int[]> contains1 = (arr1, arr2) -> {
            for (int num : arr2) {
                boolean flag = false;
                for (int i : arr1) {
                    if (num == i) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    return false;
                }
            }
            return true;
        };

        /*
        5.3 Create a function that can check if two List of Integers are equal and contains the same elemnts
				ex: list1 = {3,2,1}
					list2 = {2,1,3}

				output: true
         */
        BiPredicate<List<Integer>, List<Integer>> isEqual2 = (list1, list2) -> {
            Collections.sort(list1);
            Collections.sort(list2);
            return list1.equals(list2);
        };

        /*
        5.4 Create a function that can check if the first List contains all the elements of the second List:
				ex: list1 = {1,2,3,4,5,6}
					list2 = {7,8}

				output: false
         */
        BiPredicate<List<Integer>, List<Integer>> contains2 = (list1, list2) -> {
            return list1.containsAll(list2);
        };

    }

}

/*

5. Use BiPredicate functional interface to:

 */

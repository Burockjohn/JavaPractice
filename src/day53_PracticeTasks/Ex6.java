package day53_PracticeTasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;

public class Ex6 {

    public static void main(String[] args) {

        /*

       6.1 Create a function that can returns the common characters of two strings
				ex: str1 = "Python"
					str2 = "Wooden Spoon"

				output: on
         */
        BiFunction<String, String, String> commonCharacters = (str1, str2) -> {
            String result = "";
            for (int i = 0; i < str1.length(); i++) {
                String ch = str1.substring(i, i + 1);
                for (int j = 0; j < str2.length(); j++) {
                    String each = str2.substring(j, j + 1);
                    if (ch.equals(each)) {
                        if (!result.contains(ch)) result += ch;
                    }
                }
            }
            return result;
        };

        //System.out.println(commonCharacters.apply("Python", "Wooden Spoon"));

        //6.2 Create a function that can return the common elements of two integer arrays
        BiFunction<int[], int[], int[]> commonElements1 = (arr1, arr2) -> {
            List<Integer> commonList = new LinkedList<>();

            for (int num : arr1) {
                for (int num2 : arr2) {
                    if (num == num2) {
                        commonList.add(num);
                        break;
                    }
                }
            }

            int[] result = new int[commonList.size()];
            for (int i = 0; i < commonList.size(); i++) {
                result[i] = commonList.get(i);
            }
            return result;
        };

        // 6.3 Create a function that can return the common elements of two String arrays
        BiFunction<String[], String[], String[]> commonElements2 = (arr1, arr2) -> {
            List<String> commonList = new LinkedList<>();

            for (String str : arr1) {
                for (String str2 : arr2) {
                    if (str.equals(str2)) {
                        commonList.add(str);
                        break;
                    }
                }
            }

            String[] result = new String[commonList.size()];
            for (int i = 0; i < commonList.size(); i++) {
                result[i] = commonList.get(i);
            }

            return result;
        };

        // 6.4 Create a function that can return the common elements of two Lists of Integers
        BiFunction<List<Integer>, List<Integer>, List<Integer>> commonElements3 = (list1, list2) -> {
            List<Integer> commonList = new LinkedList<>();

            for (Integer num : list1) {
                if (list2.contains(num)) {
                    commonList.add(num);
                }
            }
            return commonList;
        };

        // 6.5 Create a function that can return the common elements of two Lists of Strings
        BiFunction<List<String>, List<String>, List<String>> commonElements4 = (list1, list2) -> {
            List<String> commonList = new LinkedList<>();

            for (String str : list1) {
                if (list2.contains(str)) {
                    commonList.add(str);
                }
            }

            return commonList;
        };


    }
}

/*

6. Use BiFunction functional interface to:

 */
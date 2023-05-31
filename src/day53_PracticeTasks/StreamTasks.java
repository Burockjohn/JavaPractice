package day53_PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTasks {

    public static void main(String[] args) {

        // 1. Write a program that can remove the duplicated elements of an array of String
        String[] array = {"apple", "banana", "orange", "apple", "grape", "banana"};
        String result[] = Arrays.stream(array)
                .distinct()
                .toArray(String[]::new); // toArray(size -> new String[size]); -> size parametresi, dizinin boyutunu temsil eder ve lambda ifadesi içinde kullanılarak yeni bir String[] dizisi oluşturulur.


        // 2. Write a program that can remove the duplicated elements of a List of String
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "apple", "grape", "banana"));
        System.out.println(list.stream()
                .distinct()
                .collect(Collectors.toList()));

        /*
        3. Write a program that can count how many "java" and "python" does the array has:
			ex: array = {"Java", "jAVa", "pythON"}

			output:
				countJava = 2
				countPython = 1
         */
        List<String> names = new ArrayList<>(Arrays.asList("Java", "jAVa", "pythON"));
        int countJava = (int) names.stream()
                .filter(p -> p.equalsIgnoreCase("java"))
                .count();
        int countPython = (int) names.stream()
                .filter(p -> p.equalsIgnoreCase("python"))
                .count();
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

        /*
        4. Write a program that can count how many negative numbers does the array has
		ex: arr = {1,2,3,4,-4,5,-5}

		output:
			2
         */
        int numbers[] = {1, 2, 3, 4, -4, 5, -5};
        int negatives = (int) Arrays.stream(numbers)
                .filter(p -> p < 0).count();
        System.out.println("negatives = " + negatives);

        /*
        5. Write a program that can count how many Positive numbers does the List has
		ex: List = {1,2,3,4,-4,5,-5}

		output:
			5
         */
        int positives = (int) Arrays.stream(numbers)
                .filter(p -> p > 0).count();
        System.out.println("positives = " + positives);

        /*
        6. Write a program that can return all the negative numbers of the array as a new array
		ex:
			arr = {1,2,3,4,-4,5,-5}

		output:
			{-4, -5}
         */

        int negativeNumbers[] = Arrays.stream(numbers)
                .filter(p -> p < 0).toArray();
        System.out.println(Arrays.toString(negativeNumbers));

        /*
        7. Write a program that can return all the positive numbers of List without the duplcaites
		ex:
			list = {1,2,3,4,-4,5,-5,1,2,3,4}

		output:
			{1,2,3,4,5}
         */
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, -4, 5, -5, 1, 2, 3, 4));
        nums = nums.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(nums);

        /*
        8. Write a program that can return the palindrome Strings from a list:
		Ex:
			list = {"Java", "level", "Anna", "Wooden Spoon"};

		output:
			{"level", "Anna"}
         */
        List<String> words = new ArrayList<>(Arrays.asList("Java", "level", "Anna", "Wooden Spoon"));
        words = words.stream()
                .filter(p -> p.equalsIgnoreCase(new StringBuilder(p).reverse().toString()))
                .collect(Collectors.toList());
        System.out.println(words);

        /*
        9. Write a program that can return the unique elements of an array as a new array:

		Ex: arr = {1,1,2,3,3,4,5,5,6};

		output:
			{2,4,6}
         */
        int[] arr = {1, 1, 2, 3, 3, 4, 5, 5, 6};
        int[] uniqueArr = Arrays.stream(arr)
                .filter(num -> {
                    int count = 0;
                    for (int i : arr) {
                        if (num == i) count++;
                    }
                    return count == 1;
                })
                .toArray();

        System.out.println(Arrays.toString(uniqueArr));

    }
}

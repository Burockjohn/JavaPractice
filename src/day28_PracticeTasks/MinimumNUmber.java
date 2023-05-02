package day28_PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinimumNUmber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(Collections.min(list));

    }
}

/*

6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1

 */
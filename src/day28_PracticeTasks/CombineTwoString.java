package day28_PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoString {

    public static void main(String[] args) {

        String str1[] = {"A", "B", "C"};
        String str2[] = {"D", "E", "F", "G"};

        ArrayList<String> combined = new ArrayList<>(Arrays.asList(str1));
        combined.addAll(Arrays.asList(str2));

        System.out.println(combined);

        //alternative solution

        ArrayList<String> list = new ArrayList<>();

        for (String each : str1) {
            list.add(each);
        }

        for (String each : str2) {
            list.add(each);
        }

        System.out.println("list = " + list);

    }
}
/*

4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */
package day28_PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicated {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 7, 3, 4, 4, 5, 6, 7, 7));

        for (Integer each : list) {
            int counter = 0;
            for (Integer element : list) {
                if (each == element) counter++;
            }

            if (counter > 1) {
                System.out.println("first duplicated element is: " + each);
                break;
            }
        }

    }
}

/*

7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2

 */

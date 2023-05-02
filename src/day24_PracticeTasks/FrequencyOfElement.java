package day24_PracticeTasks;

public class FrequencyOfElement {

    public static int frequencyOfElement (int arr [], int element) {

    int counter = 0;

        for (int each : arr) {
            if (each == element) counter++;
        }

        return counter;

    }
}

/*

5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5

 */
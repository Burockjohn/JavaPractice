package day25_PracticeTasks;

public class MaxNumber {

    public static int maxNumber(int arr[]) {

        int maxNumber = arr[0];

        for (int each : arr) {
            if (each > maxNumber) maxNumber = each;
        }

        return maxNumber;

    }


    public static double maxNumber(double arr[]) {

        double maxNumber = arr[0];

        for (double each : arr) {
            if (each > maxNumber) maxNumber = each;
        }

        return maxNumber;

    }


    public static long maxNumber(long arr[]) {

        long maxNumber = arr[0];

        for (long each : arr) {
            if (each > maxNumber) maxNumber = each;
        }

        return maxNumber;

    }


    public static short maxNumber(short arr[]) {

        short maxNumber = arr[0];

        for (short each : arr) {
            if (each > maxNumber) maxNumber = each;
        }

        return maxNumber;

    }


    public static float maxNumber(float arr[]) {

        float maxNumber = arr[0];

        for (float each : arr) {
            if (each > maxNumber) maxNumber = each;
        }

        return maxNumber;

    }


    public static byte maxNumber(byte arr[]) {

        byte maxNumber = arr[0];

        for (byte each : arr) {
            if (each > maxNumber) maxNumber = each;
        }

        return maxNumber;

    }

}

/*

Task 2:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array


 */
package day21_PracticeTasks;

public class EvenAndOddNumbers {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int countOdd = 0,
                countEven = 0;

        for (int i : arr) {
            if(i % 2 == 0) countEven++;
            else countOdd++;
        }

        System.out.println("countEven = " + countEven);
        System.out.println("countOdd = " + countOdd);
    }
}

/*

2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop

 */
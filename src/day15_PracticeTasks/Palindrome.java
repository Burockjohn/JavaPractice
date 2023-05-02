package day15_PracticeTasks;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = input.nextLine();
        int num = word.length();
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {

            reverse += word.charAt(i);
        }

        if (word.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }


    }
}

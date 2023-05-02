package day13_PracticeTasks;

import java.util.Scanner;

public class StringWithThreeCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String word = input.nextLine();

        input.close();

        String result = "";

        if (word.isEmpty()) {
            result = "string is empty";
        } else if (word.length() > 3) {
            result = "" + word.charAt(word.length() - 3) + "" + word.charAt(word.length() - 2) + "" + word.charAt(word.length() - 1);
        } else {
            result = word;
        }

        System.out.println(result);
    }
}

/*

5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

 */
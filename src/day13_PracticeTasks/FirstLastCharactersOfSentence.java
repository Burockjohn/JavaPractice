package day13_PracticeTasks;

import java.util.Scanner;

public class FirstLastCharactersOfSentence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = input.nextLine();

        System.out.println(sentence.charAt(0) + " " + sentence.charAt(sentence.length() - 1));

        input.close();

    }


}

/*

1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence

 */
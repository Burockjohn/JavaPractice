package day14_PracticeTasks;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word1 = input.next();

        System.out.println("Enter an another word");
        String word2 = input.next();

        input.close();

        System.out.println(word1.substring(1) + word2.substring(1));
    }
}

/*

  1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

 */
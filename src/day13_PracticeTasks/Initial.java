package day13_PracticeTasks;

import java.util.Scanner;
import java.util.SortedMap;

public class Initial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word1 = input.next();

        System.out.println("Enter an another word");
        String word2 = input.next();

        input.close();

        char word1_initial = word1.charAt(0),
                word2_initial = word2.charAt(0);

        String initials = word1_initial + "." + word2_initial;

        System.out.println(initials.toUpperCase());

    }
}

/*

4. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output


 */

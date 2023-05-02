package day13_PracticeTasks;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word1 = input.next();

        System.out.println("Enter an another word");
        String word2 = input.next();

        String result;

        if (word1.length() > word2.length() ) {
            System.out.println(word1);
        } else if (word2.length() > word1.length()){
            System.out.println(word2);
        } else {
            System.out.println("Both have same length");
        }

        input.close();


    }
}

/*

2. write a program that asks user to enter two strings, and print out the longest string

 */
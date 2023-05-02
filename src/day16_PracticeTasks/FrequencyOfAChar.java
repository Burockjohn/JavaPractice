package day16_PracticeTasks;

import java.util.Scanner;

public class FrequencyOfAChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string and char");
        String str = input.nextLine();
        char ch = input.next().charAt(0);

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (each == ch) {
                frequency++;
            }

        }

        System.out.println("frequency = " + frequency);

        input.close();

    }

}

/*

2. Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4

 */
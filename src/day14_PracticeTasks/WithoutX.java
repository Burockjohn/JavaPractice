package day14_PracticeTasks;

import java.util.Scanner;

public class WithoutX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();
        String result = word;

        input.close();

        if(word.startsWith("x")) {
            result = word.substring(1);
        }

        System.out.println(result);

    }
}
/*

 3. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code

 */
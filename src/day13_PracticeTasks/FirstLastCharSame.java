package day13_PracticeTasks;

import java.util.Scanner;

public class FirstLastCharSame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.next();

        input.close();

        char firstChar = word.charAt(0),
                lastChar = word.charAt(word.length() - 1);

        if(firstChar == lastChar){
            System.out.println("Same");
        }else {
            System.out.println("Not same");
        }



    }
}
/*

3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same

 */
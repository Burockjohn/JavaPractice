package day14_PracticeTasks;

import java.util.Locale;
import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email address");
        String email = input.nextLine();

        input.close();

        // burak_can@turktelekom.com.tr

        String firstName = email.substring(0, email.indexOf("_")).toUpperCase();
        char first_initial = firstName.charAt(0);
        String rest_of_first = firstName.substring(1).toLowerCase();
        firstName = first_initial + rest_of_first;

        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@")).toUpperCase();
        char second_initial = lastName.charAt(0);
        String rest_of_second = lastName.substring(1).toLowerCase();
        lastName = second_initial + rest_of_second;


        String domain = email.substring(email.indexOf("@") + 1,email.indexOf("."));

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);

    }
}

/*

 8. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple


 */
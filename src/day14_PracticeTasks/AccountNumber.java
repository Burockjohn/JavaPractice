package day14_PracticeTasks;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your account number");
        String account = input.next();

        input.close();

        if (account.startsWith("2")) {
            if (account.length() != 7) {
                System.out.println("Invalid number");
            }
        } else if (account.startsWith("5")) {
            if (account.length() != 10) {
                System.out.println("Invalid number");
            }
        }


    }
}
/*

Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”

 */
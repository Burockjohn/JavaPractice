package day13_PracticeTasks;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String user = input.next();

        System.out.println("Enter your password");
        String pass = input.next();

        input.close();

        String username = "Cydeo",
                password = "WoodenSpoon";

        if (username.equals(user) && password.equals(pass)) {
            System.out.println("Logged in.");
        } else {
            System.out.println("Incorrect username or password");
        }


    }

}


/*

8. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method

 */

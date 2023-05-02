package day18_PracticeTasks;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;

        while (true) {

            System.out.println("Which type of room do you want to reserve?");
            System.out.println("\t\tKing Bed == $120");
            System.out.println("\t\tQueen Bed == $100");
            System.out.println("\t\tSingle Bed == $80");

            String answer = input.nextLine().toLowerCase();

            while (!(answer.equals("king bed") || answer.equals("queen bed") || answer.equals("single bed"))) {
                System.out.println("Invalid Entry, Please Re-Enter");
                answer = input.nextLine().toLowerCase();
            }

            total += answer.equals("king bed") ? 120 : (answer.equals("queen bed")) ? 100 : 80;

            System.out.println("Would you like to select another room? Yes/No");
            String answer2 = input.next().toLowerCase();

            while (!(answer2.equals("yes") || answer2.equals("no"))) {
                System.out.println("Invalid Entry, please re-enter");
                System.out.println("Would you like to select another room?");
                answer2 = input.next().toLowerCase();
            }

            if (answer2.equals("no")) {
                System.out.println("Your total price is : $" + total);
                break;
            }

        }

        input.close();

    }

}

/*

2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */
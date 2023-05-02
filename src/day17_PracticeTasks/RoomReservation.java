package day17_PracticeTasks;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to reserve a room?");
        String answer = input.next();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {

            System.out.println("Invalid answer, please re-enter");
            answer = input.next();
        }

        if (answer.equalsIgnoreCase("no")) {
            System.out.println("Have a nice day");
            System.exit(0);
        }

        System.out.println("Which type of room do you want to reserve?");
        System.out.println("\t\tKing Bed == $120");
        System.out.println("\t\tQueen Bed == $100");
        System.out.println("\t\tSingle Bed == $80");
        String answer2 = input.nextLine().toLowerCase();

        while (!(answer2.equals("king bed") || answer2.equals("queen bed") || answer2.equals("single bed"))) {
            System.out.println("Invalid Entry, Please Re-Enter");
            answer2 = input.nextLine().toLowerCase();
        }

        int total = (answer2.equals("king bed")) ? 120 : (answer2.equals("queen bad")) ? 100 : 80;

        System.out.println("Your total price is: $" + total);

        input.close();

    }
}

/*

5. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */

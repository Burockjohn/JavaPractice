package day17_PracticeTasks;

import java.util.Scanner;
import java.util.SortedMap;

public class InsuranceQuote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.nextLine();

        System.out.println("Enter your gender. F/M");
        char gender = input.next().toLowerCase().charAt(0);
        while (!(gender == 'f' || gender == 'm')) {
            System.out.println("Invalid entry, please re-enter");
            gender = input.next().charAt(0);
        }

        System.out.println("Are you married? Yes/No");
        String isMarried = input.next().toLowerCase();
        while (!(isMarried.equals("yes") || isMarried.equals("no"))) {
            System.out.println("Invalid entry, please re-enter");
            isMarried = input.next().toLowerCase();
        }

        System.out.println("Enter your age");
        int age = input.nextInt();
        while (!(age >= 1 || age <= 120)) {
            System.out.println("Invalid entry, please re-enter");
            age = input.nextInt();
        }

        System.out.println("How many miles do you drive in a day?");
        int miles = input.nextInt();
        while (!(miles >= 5)) {
            System.out.println("Invalid entry, please re-enter");
            miles = input.nextInt();
        }

        input.nextLine();
        System.out.println("Do you want full coverage or liability insurance?");
        String coverage = input.nextLine().toLowerCase();
        while (!(coverage.equals("full coverage") || coverage.equals("liability"))) {
            System.out.println("Invalid answer, please re-enter");
            coverage = input.next();
        }

        System.out.println("Did you have any accidents or claims in past 5 years? Yes/No");
        String accident = input.next();
        while (!(accident.equalsIgnoreCase("yes") || accident.equalsIgnoreCase("no"))) {
            System.out.println("Invalid answer, please re-enter");
            accident = input.next();
        }

        System.out.println("Does your car have an anti-theft device? Yes/No");
        String anti_theft = input.next().toLowerCase();
        while (!(anti_theft.equals("yes") || anti_theft.equals("no"))) {
            System.out.println("Invalid answer, please re-enter");
            anti_theft = input.next();
        }

        input.close();

        int total = 0;


        if (coverage.equals("liability")) {
            if (age < 25) {
                total += 90;
            } else {
                total += 50;
            }

            if (miles <= 10) {
                total += 10;
            } else if (miles > 10 && miles <= 50) {
                total += 30;
            } else {
                total += 50;
            }
        } else {

            if (age < 25) {
                total += 160;
            } else {
                total += 120;
            }

            if (miles <= 10) {
                total += 20;
            } else if (miles > 10 && miles <= 50) {
                total += 40;
            } else {
                total += 70;
            }

        }

        if (anti_theft.equals("yes")) {
            total *= 0.95;
        }

        if (accident.equals("yes")) {
            total *= 1.15;
        } else {
            total *= 0.9;
        }

        if (isMarried.equals("yes")) {
            total *= 0.95;
        }

        System.out.println("total = " + total);


    }
}

/*

  6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the
  following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount


 */

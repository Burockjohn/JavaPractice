package day08_PracticeTasks;

public class EligibleToBuyCigarettes {

    public static void main(String[] args) {

        /*
         Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes
         */

        String name = "Burak";
        int age = 24;

        boolean isEligible = age >= 18;

        if (isEligible) {

            System.out.println(name + " is eligible to buy Cigarettes");
        }

        if (!isEligible) {

            System.out.println(name + " is not eligible to buy Cigarettes");
        }

    }
}

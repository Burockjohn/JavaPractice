package day12_PracticeTasks;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hourly rate");
        double hourlyRate = input.nextDouble();

        System.out.println("How many hours do you work in a week?");
        int hours = input.nextInt();

        System.out.println("Enter your state tax (in percentage)");
        double stateTaxRate = input.nextDouble();

        System.out.println("Enter your Federal tax (in percentage)");
        double federalTaxRate = input.nextDouble();

        double salary = hourlyRate * hours * 52,
                stateTax = salary * stateTaxRate,
                federalTax = salary * federalTaxRate,
                totalTax = stateTax + federalTax,
                netIncome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);

        input.close();


    }

}

/*

3. SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome

 */

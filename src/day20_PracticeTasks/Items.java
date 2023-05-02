package day20_PracticeTasks;

import java.io.FilterOutputStream;

public class Items {

    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        String report = "";
        boolean hasIpad = false;
        int index = -1;

        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            int ID = itemIDs[i];

            if (item.equalsIgnoreCase("gloves")) {
                index = i;
            }

            if (item.equalsIgnoreCase("ipad")) {
                hasIpad = true;
            }

            report += item + " - " + prices[i] + " - " + ID + "\n";
        }

        System.out.println("index = " + index);
        System.out.println("hasIpad = " + hasIpad);
        System.out.println(report);

    }
}

/*

3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID

 */

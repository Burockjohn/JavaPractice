package day12_PracticeTasks;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the speed limit");
        int speed_limit = input.nextInt();

        System.out.println("Enter your current speed");
        int current_speed = input.nextInt();

        if (current_speed >= speed_limit) {
            System.out.println("You're driving " + (current_speed - speed_limit) + " mph over the limit. Slow down!");
        }

        input.close();


    }
}


/*

2. Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed,
if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!



 */

package day09_PracticeTasks;

public class OxygenTank {

    public static void main(String[] args) {

        int level = 48;
        String result;

        if (level >= 90) {
            result = "Your tank is full";
        } else if (level >= 80) {
            result = "Still okay";
        } else if (level >= 70) {
            result = "Don't go too far";
        } else if (level >= 60) {
            result = "Start to head back";
        } else  {
            result = "Be careful now you at 50%";
        }

        System.out.println("result = " + result);


    }
}
/*
Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number)
and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
 */

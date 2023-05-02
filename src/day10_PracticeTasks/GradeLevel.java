package day10_PracticeTasks;

public class GradeLevel {

    public static void main(String[] args) {

        byte num = 8;
        String gradeLevel;

        if (num >= 1 && num <= 18) {

            if (num <= 5) {
                gradeLevel = "Elementary school";
            } else if (num <= 8) {
                gradeLevel = "Middle school";
            } else if (num <= 12) {
                gradeLevel = "High school";
            } else if (num <= 16) {
                gradeLevel = "College";
            } else {
                gradeLevel = "Grad school";
            }

        } else {
            gradeLevel = "Invalid grade level given";
        }

        System.out.println(gradeLevel);


    }


}




/*
Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
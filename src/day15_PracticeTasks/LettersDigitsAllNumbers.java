package day15_PracticeTasks;

public class LettersDigitsAllNumbers {

    public static void main(String[] args) {

        String str = "mn@#123Ab!",
                letters = "",
                digits = "",
                specials = "";

        for (int i = 0; i < str.length(); i++) {

            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {

                letters += str.charAt(i);
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                digits += str.charAt(i);
            } else {
                if (str.charAt(i) != ' ') {
                    specials += str.charAt(i);
                }
            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specials = " + specials);

    }
}


/*

    5. write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */
package day27_PracticeTasks;

public class LetterDigitSpecialChar {

    public static void main(String[] args) {

        String str = "Wooden Spoon 123!";

        characterTypes(str);

    }

    public static void characterTypes(String str) {

        String letters = "",
                digits = "",
                specialChars = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (Character.isLetter(each)) {
                letters += each;
            } else if (Character.isDigit(each)) {
                digits += each;
            } else {
                specialChars += each;
            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }
}
/*

3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";


 */

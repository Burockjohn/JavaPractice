package day53_PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Ex3 {

    public static void main(String[] args) {

        // 3.1 Create a function that can verify if a String contains duplicated characters
        Predicate<String> hasDuplicatedChars = str -> {
            boolean result = false;
            List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
            for (String ch : list) {
                if (Collections.frequency(list,ch) > 1) result = true;
            }
            return result;
        };

        // 3.2 Create a function that can verify if a password is a strong password.
        Predicate<String> isStrongPassword = str -> {
            if (str.length() < 8 || str.contains(" ")) return false;
            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasSpecialCharacters = false;
            boolean hasDigit = false;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(ch)) {
                    hasLowerCase = true;
                } else if (!Character.isLetterOrDigit(ch)) {
                    hasSpecialCharacters = true;
                } else if (Character.isDigit(ch)) {
                    hasDigit = true;
                }
            }

            return hasUpperCase && hasLowerCase && hasSpecialCharacters && hasDigit;
        };

    }
}

/*

3. Use Predicate Functional interface to:
		3.1 Create a function that can verify if a String contains duplicated characters

		3.2 Create a function that can verify if a password is a strong password. Characteristics of strong passwords are:
		        1 Password must be at least have 8 characters long, and should not contain space
		        2 PassWord should at least contain one upper case letter
		        3 PassWord should at least contain one lower case letter
		        4 Password should at least contain one special characters
		        5 Password should at least contain a digit

 */
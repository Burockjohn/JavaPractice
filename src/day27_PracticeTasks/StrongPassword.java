package day27_PracticeTasks;

public class StrongPassword {

    public static void main(String[] args) {

        String password = "Cydeo.123";

        boolean isStrong = false;

        if (password.length() >= 8 && !password.contains(" ")) {
            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasDigit = false;
            boolean hasSpecialChar = false;

            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(ch)) {
                    hasLowerCase = true;
                } else if (Character.isDigit(ch)) {
                    hasDigit = true;
                } else if (!Character.isLetterOrDigit(ch)) {
                    hasSpecialChar = true;
                }
            }

            isStrong = hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
        }

        System.out.println(isStrong);


    }

}



/*

 Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit


 */

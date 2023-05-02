package day27_PracticeTasks;

public class UpperLowerEqual {

    public static void main(String[] args) {

        String str = "JAVA java";

        System.out.println(isUpperLowerEqual(str));

    }

    private static boolean isUpperLowerEqual(String str) {

        int upper = 0,
                lower = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLowerCase(ch)) {
                lower++;
            } else if (ch >= 'A' && ch <= 'Z') {
                upper++;
            }
        }

        return lower == upper;

    }
}

/*

4. Write program that returns true if the total number of upper case characters are equal to total number of
Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true

 */
package day24_PracticeTasks;


public class İsPalindrome {

    public static boolean isPalindrome(String str) {

        return Reverse.reverse(str).equalsIgnoreCase(str);

    }
}

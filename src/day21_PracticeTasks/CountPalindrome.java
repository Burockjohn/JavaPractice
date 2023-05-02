package day21_PracticeTasks;

public class CountPalindrome {

    public static void main(String[] args) {

        String words[] = {"anna", "level", "Java"};
        int counter = 0;

        for (int i = 0; i < words.length; i++) {

            String result = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                char ch = words[i].charAt(j);
                result += ch;
            }

            if (result.equals(words[i])) counter++;
        }

        System.out.println(counter);
    }
}

/*

 4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2

 */
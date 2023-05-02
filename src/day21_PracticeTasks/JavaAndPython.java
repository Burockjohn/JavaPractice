package day21_PracticeTasks;

public class JavaAndPython {

    public static void main(String[] args) {

        String sentence = "java java python python java python";
        String[] words = sentence.toLowerCase().split(" ");

        int countJava = 0,
                countPython = 0;

        for (String word : words) {
            if (word.equals("java")) countJava++;
            if (word.equals("python")) countPython++;
        }

        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);

    }
}

/*

6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)

 */

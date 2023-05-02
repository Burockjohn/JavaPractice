package day16_PracticeTasks;

public class FrequencyOfJava {

    public static void main(String[] args) {

        String sentence = "Java Java Java JAVA"; // 0-4, 1-5, 2-6, ...... 10-14 --> after 10, it is going to give an error
        // because of that there is not char(15)
        int counter = 0;

        for (int i = 0; i <= sentence.length() - 4; i++) {

            String fourLetter = sentence.substring(i, i + 4);
            if (fourLetter.equalsIgnoreCase("Java")) {
                counter++;
            }

        }

        System.out.println(counter);
    }
}

/*

4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create

 */
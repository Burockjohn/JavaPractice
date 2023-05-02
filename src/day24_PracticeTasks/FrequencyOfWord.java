package day24_PracticeTasks;

public class FrequencyOfWord {

    public static int frequencyOfWord(String sentence, String word) {

        String str[] = sentence.split(" ");

        int counter = 0;

        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            counter++;
        }

        return counter;

    }
}

/*

1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns
the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3

 */

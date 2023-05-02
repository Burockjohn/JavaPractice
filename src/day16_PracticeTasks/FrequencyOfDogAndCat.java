package day16_PracticeTasks;

public class FrequencyOfDogAndCat {

    public static void main(String[] args) {

        String sentence = "cat DoG cAt dOG Cat DOG dog CAT";
        int dogCounter = 0,
                catCounter = 0;

        for (int i = 0; i <= sentence.length() - 3; i++) {
            String str = sentence.substring(i, i + 3);

            if (str.equalsIgnoreCase("dog")) {
                dogCounter++;
            } else if (str.equalsIgnoreCase("cat")) {
                catCounter++;
            }
        }

        System.out.println(dogCounter == catCounter);


    }
}

/*

5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true

 */

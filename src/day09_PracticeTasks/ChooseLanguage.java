package day09_PracticeTasks;

public class ChooseLanguage {

    public static void main(String[] args) {

        int n = 3;
        String language = "";

        if (n == 1) {
            language = "Hello, thanks for your call";
        } else if (n == 2) {
            language = "Hola, gracias para llamar";
        } else if (n == 3) {
            language = "Merhaba, aradiginiz icin tesekkurler";
        } else if (n == 4) {
            language = "Privet, spasibo za vash zvonok";
        } else if (n == 5) {
            language = "Merci ,pour votre appel";
        }

        System.out.println(language);


    }
}
/*
Create a class called ChooseLanguage, Given an integer variable named n that has a number between 1~5,
Write a program that can select the language based on the number that's given in n and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel
 */
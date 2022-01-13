package day09_IfStatements;
/* Creata a class called ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel */

public class ChooseLanguage {

    public static void main(String[] args) {

        int number= 3;

        boolean isEnglish = number == 1;
        boolean isSpanish = number == 2;
        boolean isTurkish = number == 3;
        boolean isRussian = number == 4;
        boolean isFrench = number == 5;

        if(isEnglish){
            System.out.println("Hello, thank for your call");
        }else if(isSpanish){
            System.out.println("Hola, gracias para llamar");
        }else if(isTurkish){
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        }else if(isRussian){
            System.out.println("Privet, spasibo za vash zvonok");
        }else{
            System.out.println("Merci ,pour votre appel");
        }










    }
}

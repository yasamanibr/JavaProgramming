package day09_IfStatements;
/* 1. Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

 */

public class NumberToWord {

    public static void main(String[] args) {

        int num = 5;

        boolean isOne = num == 1;
        boolean isTwo = num == 2;
        boolean isThree = num == 3;
        boolean isFour = num == 4;
        boolean isFive = num == 5;
        boolean isSix = num == 6;
        boolean isSeven = num == 7;
        boolean isEight = num == 8;
        boolean isNine = num ==9;

        if(isOne){
            System.out.println("One");
        }else if(isTwo){
            System.out.println("Two");
        }else if(isThree){
            System.out.println("Three");
        }else if(isFour){
            System.out.println("Four");
        }else if(isFive){
            System.out.println("Five");
        }else if(isSix){
            System.out.println("Six");
        }else if(isSeven){
            System.out.println("Seven");
        }else if(isEight){
            System.out.println("Eight");
        }else{
            System.out.println("Nine");
        }



    }
}

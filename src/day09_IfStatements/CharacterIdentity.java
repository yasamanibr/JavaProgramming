package day09_IfStatements;

/* Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table

 */

public class CharacterIdentity {

    public static void main(String[] args) {

        int character = 93;
        boolean isNumber = (character >= 48 && character <= 57);
        boolean isAlphabet = (character >= 65 && character <= 90 || character >= 97 && character <= 122);

        if (isNumber){
            System.out.println("Digit");
        }else if(isAlphabet){
            System.out.println("Alphabetic Character");
        }else{
            System.out.println("Special Character");
        }











    }
}

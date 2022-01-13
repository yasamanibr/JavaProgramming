package day09_IfStatements;

/* Create a class called FizzBuzz, an integer variable named number is given to you, write a program that prints "Fizz" if the number is divisible by 3, prints "Buzz" if the number is divisible by 5, and prints FizzBuzz if the number is divisible by both 3 and 5.

            Ex:
                number 15

            Output:
                FizzBuzz

 */

public class FizzBuzz {

    public static void main(String[] args) {

        int num1 = 15;
        boolean ifFizz = num1 % 3 == 0 && num1 % 5 != 0;
        boolean ifBuzz = num1 % 5 == 0 && num1 % 3 != 0;
        boolean ifFizzBuzz = num1 % 3 == 0 && num1 % 5 == 0;




        if (ifFizz){
            System.out.println("Fizz");
        }else if(ifBuzz){
            System.out.println("Buzz");
        }else if(ifFizzBuzz){
            System.out.println("FizzBuzz");
        }else{
            System.out.println(num1 + " is not divisible neither by 3 nor by 5");
        }




    }
}

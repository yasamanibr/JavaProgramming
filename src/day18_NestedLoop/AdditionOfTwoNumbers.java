package day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class AdditionOfTwoNumbers {

    public static void main(String[] args) {

        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your first number:");
            int num1 = scan.nextInt();
            System.out.println("Enter your second number:");
            int num2 = scan.nextInt();
            System.out.println("Addition = " + (num1 + num2));
            System.out.println("Would you like to continue?");
            String str = scan.next().toLowerCase();
            while(! (str.equals("yes")|| str.equals("no"))){
                System.out.println("Invalid Entry, Please re enter");
                str = scan.next().toLowerCase();
            }



            if(str.equals("no")){
                break;
            }


            scan.close();

        }








    }
}

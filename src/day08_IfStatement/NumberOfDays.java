package day08_IfStatement;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 2;

        boolean has28Days = number == 2;
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;
        boolean has31days = !has28Days && !has30Days;


        if(has28Days){
            System.out.println("28 days");
        }
        if(has30Days){
            System.out.println("30 days");
        }
        if(has31days){
            System.out.println("31 days");
        }


    }
}
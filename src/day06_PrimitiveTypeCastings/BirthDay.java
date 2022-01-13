package day06_PrimitiveTypeCastings;

/* Create a class called BirthDay and create the following variable
        name, birthDay(int), birthMonth(String), birthYear(int)

        use concatenation to display the birthday of the person
        if  name = "John"
        birthDay = 25
        birthMonth = "April"
        birthYear = 1995;

        output:
        John was born on April/25/1995.

 */

public class BirthDay {


    public static void main(String[] args) {

        String name = "Yasaman";
        int birthDay = 20;
        String birthMonth = "August";
        int birthYear = 1993;

        String birthDate = birthMonth + "/" + birthDay + "/" + birthYear;



        System.out.println(name + " was born on " + birthDate + ".");



    }
}

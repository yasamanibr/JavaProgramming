package day06_PrimitiveTypeCastings;

/* integer / integer ----> integer
integer / decimal-------> decimal
decimal / integer -----> decimal
decimal / decimal ----> decimal */

public class ArithmeticOperators {


    public static void main(String[] args) {

        System.out.println("12" + 1); // 121 concatenation
        System.out.println(100-50); // 50 subtraction
        System.out.println(10 + 20); // 30 addition
        System.out.println(10 * 6); // 60 multiplication

        System.out.println(100 / 3); // 33 (in java because the numbers are integers)
        System.out.println(10.0/4); // or System.out.println((double)10/4) or System.out.println(10/4.0)
        System.out.println(10d/4); // or as you see adding d for being decimal


        int a = 100;
        double b = a/6; // 16 ,because both 100 & 6 are integer numbers

        double c = a/6.0;  // or double c = a/6d or double c = (double)a/6

        System.out.println(b);
        System.out.println(c);


    }
}

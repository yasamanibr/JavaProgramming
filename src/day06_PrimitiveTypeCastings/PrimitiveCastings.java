package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {


    public static void main(String[] args) {

        byte a = 100;
        short b = a;

        int c = b;
        long d = c;
        float e = d;
        double f = e;

        // double > float > long > int > short > byte

        long j = 1000000;
        short k = (short)j;

        System.out.println(j + ":" + k);

        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println(d1 + ":" + s1);

        float f1 = 30.5F;
        long l1 = (long) f1;

        System.out.println(f1 + ":" + l1);

    }
}

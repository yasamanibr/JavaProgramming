package day04_Variables;

public class Circle {


    public static void main(String[] args) {


        //radius, pi, area, perimeter

        double radius = 5;
        double pi = 3.14;
        double diameter = radius * 2;

        double area = radius * radius * pi;
        double perimeter = pi * diameter;

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);







    }
}

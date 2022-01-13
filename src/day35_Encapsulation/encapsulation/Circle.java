package day35_Encapsulation.encapsulation;

public class Circle {

    private double radius;
    public static double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            return;
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }


    public double calcArea(){
        return radius*radius*pi;
    }

    public double calcPerimeter(){
        return 2*radius*pi;
    }



    public String toString() {
        return "Circle{" +
                "radius=" + radius + " : " +
                "perimeter=" + calcPerimeter() + " : " +
                "area=" + calcArea() +
                '}';
    }
}

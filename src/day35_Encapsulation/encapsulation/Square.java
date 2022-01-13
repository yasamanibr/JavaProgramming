package day35_Encapsulation.encapsulation;

public class Square {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side>0){
            System.err.println("Side of the square should be negative.");
            System.exit(0);
        }
        this.side = side;
    }

    public Square(double side) {
        setSide(side);
    }

    public double calcArea(){
        return side*side;
    }

    public double calcPerimeter(){
        return side*4;
    }

    public String toString() {
        return "Square{" +
                "side = " + side + " - " +
                "perimeter = " + calcPerimeter() + " - " +
                "area = " + calcArea() +
                '}';
    }
}

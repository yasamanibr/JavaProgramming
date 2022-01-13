package day35_Encapsulation.encapsulation;

public class Rectangle {

    private double width,length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width>0){
            System.err.println("Length and width of the rectangle should be negative.");
            System.exit(0);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length>0){
            System.err.println("Length and width of the rectangle should be negative.");
            System.exit(0);
        }
        this.length = length;
    }

    public Rectangle(double width, double length) {
        setLength(length);
        setWidth(width);
    }

    public double calcArea(){
        return length*width;
    }

    public double calcPerimeter(){
        return (width+length)*2;
    }

    public String toString() {
        return "Rectangle{" +
                "width = " + width +
                ", length = " + length +
                ", area = " + calcArea() +
                ", perimeter = " + calcPerimeter() +
                '}';
    }
}

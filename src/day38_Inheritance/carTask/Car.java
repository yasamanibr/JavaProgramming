package day38_Inheritance.carTask;

public class Car {

    public String brand, model;
    public int year;
    public double price;
    public String color;
    public double miles;

    public Car(String brand, String model, int year, double price, String color, double miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public void start(){
        System.out.println(model + " " + brand + " is starting");
    }

    public void drive(){
        System.out.println(model + " " + brand + " is driving " + miles + " miles");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }
}
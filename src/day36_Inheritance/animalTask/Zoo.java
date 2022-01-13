package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.setInfo("Max", "Husky", 'M', 2, "Small", "Black");

        dog1.eat();
        dog1.drink();
        dog1.sleep();
        dog1.move();

        dog1.bark();

        System.out.println(dog1);


        Cat cat1 = new Cat();

        cat1.setInfo("Tarchin", "British", 'M', 3, "Small", "brown");

        cat1.eat();
        cat1.sleep();
        cat1.drink();
        cat1.move();

        cat1.meow();
        cat1.scratch();

        System.out.println(cat1);

        Tiger tiger1 = new Tiger();

        tiger1.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "brown");

        tiger1.eat();
        tiger1.sleep();
        tiger1.drink();
        tiger1.move();

        tiger1.roar();
        tiger1.hunt();

        System.out.println(tiger1);
    }


}

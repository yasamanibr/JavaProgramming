package day35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAge(25);
        person1.setName("Daniel");

        System.out.println(person1.getName() + " : " + person1.getAge());
    }
}

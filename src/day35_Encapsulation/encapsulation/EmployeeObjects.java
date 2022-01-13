package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Adam", 'M', 25, 150000);

        employee1.setAge(32);

        System.out.println(employee1);

        Employee employee2 = new Employee("Aygun", 'F', 35, 115000);

        employee2.setName("Elvira");

        employee2.setSalary(employee2.getSalary() + 15000);

        System.out.println(employee2);
    }
}

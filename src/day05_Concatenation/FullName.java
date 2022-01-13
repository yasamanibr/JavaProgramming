package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {


        String firstName = "Yasaman";
        String lastNAme = "Ibrahimova";
        int age = 28;

        String fullName = firstName + " " + lastNAme;


        System.out.println("Full name of the person is " + fullName + " is " + age + " years old");

        //FullName is Jobtitle +, works at + CompanyName, and FullName' salary is Salary

        String jobTitle ="Developer";
        double salary = 100000.58;
        String companyNAme = "Aplle Inc";


        System.out.println(fullName + " is " + jobTitle + ", works at " + companyNAme + ", and " + fullName + "'s salary is $" + salary);


    }
}

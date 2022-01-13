import java.util.Scanner;

public class Party {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
String name1 = "";


        while (true) {
            System.out.println("Please enter guest name");
            name1 = scan.next();

            System.out.println("Do you want to enter new guest name:");
            String str = scan.next();

            while((str.equals("yes"))){

                System.out.println("Please enter guest name");
                name1 += " " + scan.next();
                System.out.println("Do you want to enter new guest name:");
                str = scan.next();

            }

            System.out.println("Guest's list:" + name1 );

            if (str.equals("no"))
                break;


        }


scan.close();
    }


}
import java.util.Scanner;

public class Inhabitants {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int inhabitants = scan.nextInt();
        int day= -1;


        for (int j = inhabitants+inhabitants; j >= 0; j--) {
            j = j - j / 2;
            day++;


            if (j == 0) {
                System.out.println("---- EXTINCT ----");
                break;
            }
            System.out.println("Day " + day + " [" + j + "]");


        }

    }
}









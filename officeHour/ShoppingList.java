import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        while (true) {
            System.out.println("Enter Item1 and its price:");
            item = scan.next();
            price = scan.nextDouble();

            System.out.println("Add one more item?");
            countinue = scan.next();

            while(countinue.equals("yes")){
                System.out.println("Enter Item1 and its price:");
                item += " " + scan.next();
                price += scan.nextDouble();
                System.out.println("Add one more item?");
                countinue = scan.next();

            }


            System.out.println(item + price);
            System.out.println(totalPrice);

    if(countinue.equals("no")){
    break;
}

        }



    }
}

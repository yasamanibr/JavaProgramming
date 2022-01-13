package day09_IfStatements;

public class MaximumNumber {

    public static void main(String[] args) {
        int a = 30;
        int b = 20;

        boolean aIsMaximum = a>b;
        boolean bIsMaximum = b>a;

        if (aIsMaximum) {
            System.out.println(a + " is the maximum number");
        }else{
            System.out.println(b + " is the maximum number");
        }






    }
}

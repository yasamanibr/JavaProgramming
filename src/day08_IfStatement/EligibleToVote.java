package day08_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Josh";
        int age = 17;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA";

        //eligible
        if(isEligible){

            System.out.println("Eligible");
        }

        //not eligible
        if(!isEligible){

            System.out.println("Not Eligible");
        }






    }
}

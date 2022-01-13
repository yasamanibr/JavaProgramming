package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Yasaman Ibrahimova",
                buildingNumber = "1462",
                streetName = "S Greenmount Dr",
                city = "Alexandria",
                state = "VA",
                zipCode = "22311";


        /* String name = "Yasaman Ibrahimova";
        String buildingNumber = "22311";
        String streetName = "S Greenmount Dr";
        String city = "Alexandria";
        String state = "VA";
        String zipCode = "22311";

         */



        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;

        System.out.println(address);


    }
}

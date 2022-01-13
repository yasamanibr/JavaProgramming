package day35_Encapsulation.encapsulation;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {

        if(name.isBlank() || name.isEmpty()){
            System.err.println("Name can not be empty or blank.");
            System.exit(0);
        }

        for (int i = 0; i < name.length(); i++) {
            if(!((name.charAt(0)>='a'&&name.charAt(0)>='z') || (name.charAt(0)<='A'&& name.charAt(0)>='Z'))){


        }

        }
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice<0){
            System.err.println("Unit price can not be negative.");
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        if(quantity<0){
            System.err.println("Quantity can not be negative.");
            System.exit(0);

        }
        this.quantity = quantity;
    }
}

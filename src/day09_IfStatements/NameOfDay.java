package day09_IfStatements;

public class NameOfDay {
    public static void main(String[] args) {


        int n = 7; // 1~7

        boolean isMonday = n == 1;
        boolean isTuesday = n == 2;
        boolean isWednesday = n == 3;
        boolean isThursday = n == 4;
        boolean isFriday = n == 5;
        boolean isSaturday = n == 6;
        boolean isSunday = n == 7;

        if (isMonday){
            System.out.println("Monday");
        }else if(isTuesday){
            System.out.println("Tuesday");
        }else if(isWednesday){
            System.out.println("Wednesday");
        }else if(isThursday){
            System.out.println("Thursday");
        }else if(isFriday){
            System.out.println("Friday");
        }else if(isSaturday){
            System.out.println("Saturday");
        }else{
            System.out.println("Sunday");
        }


    }

}

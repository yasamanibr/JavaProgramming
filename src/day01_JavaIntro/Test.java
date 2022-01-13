package day01_JavaIntro;

import utilities.StringUtility;

public class Test {
    public static void main(int[] args) {
        int x= 7;
        if(available(x)) {                // Line 1
            System.out.println("Java SE");
        }else {
            System.out.println("Java EE");
        }

    }
    public static boolean available(int x) {
        return x > 1 ? true : false;
}
}

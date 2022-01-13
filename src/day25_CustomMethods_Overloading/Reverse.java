package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

       int[] arr = {1,2,3,4,5};

       int[] arr1 = reverseArray(arr);

        System.out.println(Arrays.toString(arr1));


    }





    public static int[] reverseArray(int[] array){

    int[] result = new int[array.length];

    for (int i = array.length-1, j = 0; i>=0; i-- , j++) {
        result[j]=array[i];
    }

    return result;

}

    public static String[] reverseArray(String[] array){

        String[] result = new String[array.length];

        for (int i = array.length-1, j = 0; i>=0; i-- , j++) {
            result[j]=array[i];
        }

        return result;

    }

    public static double[] reverseArray(double[] array){

        double[] result = new double[array.length];

        for (int i = array.length-1, j = 0; i>=0; i-- , j++) {
            result[j]=array[i];
        }

        return result;

    }

    public static char[] reverseArray(char[] array){

        char[] result = new char[array.length];

        for (int i = array.length-1, j = 0; i>=0; i-- , j++) {
            result[j]=array[i];
        }

        return result;

    }




}

/* Task 6:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array */

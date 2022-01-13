package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};

        int[] arr3 = mergeArrays(arr1,arr2);

        System.out.println(Arrays.toString(arr3));

        System.out.println("---------------");

        double[] arr4 = {1.5,2.5};
        double[] arr5 = {3.5,4.5};

        double[] arr6 = mergeArrays(arr4,arr5);

        System.out.println( Arrays.toString(arr6) );

        System.out.println("---------------");

        String[] arr7 = {"Yasaman", "Ramil"};
        String[] arr8 = {"Mireya"};

        String[] arr9 = mergeArrays(arr7,arr8);

        System.out.println( Arrays.toString(arr9)  );

        System.out.println("---------------");

        char[] arr10 = {'a','b'};
        char[] arr11 = {'c', 'd'};

        char[] arr12 = mergeArrays(arr10,arr11);

        System.out.println( Arrays.toString(arr12) );
    }





public static int[] mergeArrays(int[] arr1, int[] arr2){

    int[] result = new int[arr1.length + arr2.length];


    int e = 0;

    for (int i = 0; i< arr1.length ; i++) {
        result[e] = arr1[i];
        e++;
    }

    for (int j = 0; j< arr2.length ; j++) {
        result[e] = arr2[j];
        e++;

    }

return result;

}

    public static double[] mergeArrays(double[] arr1, double[] arr2) {

        double[] result = new double[arr1.length + arr2.length];

        int e = 0;

        for (int i = 0; i < arr1.length; i++) {
            result[e] = arr1[i];
            e++;
        }

        for (int j = 0; j < arr2.length; j++) {
            result[e] = arr2[j];
            e++;

        }

        return result;

    }

    public static String[] mergeArrays(String[] arr1, String[] arr2) {

        String[] result = new String[arr1.length + arr2.length];

        int e = 0;

        for (int i = 0; i < arr1.length; i++) {
            result[e] = arr1[i];
            e++;
        }

        for (int j = 0; j < arr2.length; j++) {
            result[e] = arr2[j];
            e++;

        }

        return result;

    }

    public static char[] mergeArrays(char[] arr1, char[] arr2) {

        char[] result = new char[arr1.length + arr2.length];

        int e = 0;

        for (int i = 0; i < arr1.length; i++) {
            result[e] = arr1[i];
            e++;
        }

        for (int j = 0; j < arr2.length; j++) {
            result[e] = arr2[j];
            e++;

        }

        return result;

    }

}


/* Task3:
	1. create a method that can merge two integer arrays.  		merger(int[] arr1, int[] arr2)

	2. create a method that can merge two double arrays.  		merge(double[] arr1, double[] arr2)

	3. create a method that can merge two char arrays.   		merge(char[] arr1, char[] arr2)

	4. create a method that can merge two String arrays.  		merge(String[] arr1, String[] arr2)

			merge() */
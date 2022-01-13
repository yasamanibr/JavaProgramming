package day25_CustomMethods_Overloading;


import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};

        ArraysUtility.printEachElement(arr1);

        System.out.println("---");

        double[] arr2 = {2.5,5.6,8.9};

        ArraysUtility.printEachElement(arr2);

        System.out.println("---");

        char[] arr3 = {'a','b','c'};

        ArraysUtility.printEachElement(arr3);

        System.out.println("---");

        String[] arr4 = {"One","Two","Three","Four"};

        ArraysUtility.printEachElement(arr4);

        System.out.println("---");

        int[] num1 = {10,5,84,5};

        int max1 = ArraysUtility.max(num1);

        System.out.println(max1);

        System.out.println("---");

        double[] num2 = {5.5,9.5,20.5};

        double max2 = ArraysUtility.max(num2);

        System.out.println(max2);

        System.out.println("---");

        int[] a1 = {5,6,7,8};

        boolean r1 = ArraysUtility.contains(a1,9);

        System.out.println(r1);

        System.out.println("---");

        double[] a2 = {1.1,2.2,3.3};

        boolean r2 = ArraysUtility.contains(a2,2.2);

        System.out.println(r2);

        System.out.println("---");

        char[] a3 = {'a','b', 'c', 'd'};

        boolean r3 = ArraysUtility.contains(a3,'f');

        System.out.println(r3);

        System.out.println("---");

        String[] a4 = {"Yasaman", "Ramil", "Mireya"};

        boolean r4 = ArraysUtility.contains(a4,"Mireya");

        System.out.println(r4);






    }

}

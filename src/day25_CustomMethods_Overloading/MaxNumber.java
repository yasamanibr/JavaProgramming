package day25_CustomMethods_Overloading;

public class MaxNumber {
    public static void main(String[] args) {


        int[] arr = {5, 11, 8, 9};
        int max = maxNumber(arr);

        System.out.println(max);

    }





    public static int maxNumber(int[] array){

        int max = 0;

        for (int each : array) {
            if(each>max){
                max = each;
            }

        }

        return max;
    }

    public static double maxNumber(double[] array){

        double max = 0;

        for (double each : array) {
            if(each>max){
                max = each;
            }

        }

        return max;
    }

    public static long maxNumber(long[] array){

        long max = 0;

        for (long each : array) {
            if(each>max){
                max = each;
            }

        }

        return max;
    }

    public static short maxNumber(short[] array){

        short max = 0;

        for (short each : array) {
            if(each>max){
                max = each;
            }

        }

        return max;
    }

    public static float maxNumber(float[] array){

        float max = 0;

        for (float each : array) {
            if(each>max){
                max = each;
            }

        }

        return max;
    }

    public static byte maxNumber(byte[] array){

        byte max = 0;

        for (byte each : array) {
            if(each>max){
                max = each;
            }

        }

        return max;
    }





}


/* Task 4:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array */

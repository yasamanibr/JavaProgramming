package day25_CustomMethods_Overloading;

public class MinNumber {
    public static void main(String[] args) {

        int[] arr = {22,3,4,5};

        int min = minNumber(arr);

        System.out.println(min);

    }





    public static int minNumber(int[] array){

        int min = array[0];

        for (int each : array) {
            if(each<min){
                min=each;
            }

        }

return  min;



    }

    public static double minNumber(double[] array){

        double min = array[0];

        for (double each : array) {
            if(each<min){
                min=each;
            }

        }

        return  min;



    }

    public static long minNumber(long[] array){

        long min = array[0];

        for (long each : array) {
            if(each<min){
                min=each;
            }

        }

        return  min;



    }

    public static short minNumber(short[] array){

        short min = array[0];

        for (short each : array) {
            if(each<min){
                min=each;
            }

        }

        return  min;



    }

    public static float minNumber(float[] array){

        float min = array[0];

        for (float each : array) {
            if(each<min){
                min=each;
            }

        }

        return  min;



    }

    public static byte minNumber(byte[] array){

        byte min = array[0];

        for (byte each : array) {
            if(each<min){
                min=each;
            }

        }

        return  min;



    }



}

/* Task 5:
	1. create a method that can return the min number from an integer array

	2. create a method that can return the min number from double array

	3. create a method that can return the min number from long array

	4. create a method that can return the min number from short array

	5. create a method that can return the min number from float array

	6. create a method that can return the min number from byte array */

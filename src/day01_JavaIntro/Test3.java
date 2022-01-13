package day01_JavaIntro;

import utilities.ArraysUtility;

import java.time.chrono.MinguoDate;
import java.util.Arrays;
import java.util.Locale;

public class Test3 {

    public static void main(String[] args) {

    int count = 0;

        for (int i = 0; i < 4; i++) {
            if(i==3) continue;

        for (int b = i+1; b < 5; b++) {
            count++;
            if(b==3) break;
        }
        }
        System.out.println(count);

        int a[] = {1,2,3,4,5};
        int b[] = {7,8,9,10};

        int[] c = ArraysUtility.merge(a,b);

        System.out.println(Arrays.toString(c) );


    }
}

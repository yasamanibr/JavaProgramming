package practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class DinnerTask5 {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        Arrays.sort(nums);

        ArrayList<Integer> list = new ArrayList<>();

        for(int each: nums){
            list.add(each);
        }

        int max = list.get(list.size()-1);

        System.out.println(max);



        /* Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5

         */



    }
}

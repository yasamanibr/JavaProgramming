package practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class DinnerTask7 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));
        ArrayList<Integer> list1 = new ArrayList<>();

        for(Integer each:list){
            if(list.indexOf(each)!=list.lastIndexOf(each)){
                list1.add(each);
            }
        }

        System.out.println(list1.get(0));









    }
}

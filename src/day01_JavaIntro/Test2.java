package day01_JavaIntro;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Test2 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("One","Two","Three"));

        System.out.println(names);

        ArrayList<String> reverse = new ArrayList<>();


        for (int i = names.size() - 1; i >= 0; i--) {
            reverse.add(names.get(i));
        }

        System.out.println(reverse);

    }
}

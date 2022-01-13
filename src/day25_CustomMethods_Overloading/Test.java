package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;
import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String str = "Wooden Spoon";

        StringUtility.printEachChar(str);

        System.out.println("------------");
        
        String s1 = "Cydeo School";

        String reverse = StringUtility.reverse(s1);

        System.out.println(reverse);

        System.out.println("------------");
        
        String word = "Java";
        
        boolean palindrome = StringUtility.isPalindrome(word);

        System.out.println("palindrome = " + palindrome);

        System.out.println("------------");

        String[] names = {"Anna", "Mom", "racecar", "Yasaman", "Chinara"};

        int result = 0;

        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                result++;
            }

        }
        System.out.println(result);

        System.out.println("------------");

        String word1 = "aaabbbcccddddeee";

        String newWord1 = StringUtility.removeDuplicates(word1);

        System.out.println(newWord1);




        }


    }


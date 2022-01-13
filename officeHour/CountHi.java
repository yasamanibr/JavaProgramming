import java.util.Locale;
import java.util.Scanner;

public class CountHi {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something:");
        String str = scan.nextLine();
int result = 0;
            for (int i = 0; i < str.length()-1; i++) {


                String subs = str.substring(i,i+2).toLowerCase();


                if(subs.charAt(0) == 'h' && subs.charAt(1) == 'i')
                    result++;



            }
        System.out.println(result);

        }
    }

/* Print out the number of times that the string "hi" appears anywhere in the given string. Only lowercase "hi" should be counted.

Example:

input: abc hi how hi

output: 2
input: abc hi how hi

output: 2
Example:

input: hi code java please

output: 1 */
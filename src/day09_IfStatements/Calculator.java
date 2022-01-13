package day09_IfStatements;
/* Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30 */


public class Calculator {

    public static void main(String[] args) {


        double n1 = 5;
        double n2 = 4;
        char mathOperator = '*';

        boolean addOperator = mathOperator == '+';
        boolean minusOperator = mathOperator == '-';
        boolean multiplyOperator = mathOperator == '*';
        boolean divideOperator = mathOperator == '/';

        if(addOperator){
            System.out.println(n1 + n2);
        }else if(minusOperator) {
            System.out.println(n1 - n2);
        }else if(multiplyOperator){
            System.out.println(n1 * n2);
        }else if(divideOperator){
            System.out.println(n1 / n2);
        }else{
            System.out.println("Invalid Operator");
        }

    }
}

package scannerClass;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in); // rule. remember that

        System.out.println("Enter first number");
        double num1 = user.nextDouble();

        System.out.println("Enter arithmetic operator: / * + - %");
        String aritmeticOperator = user.next();

        System.out.println("Enter second number");
        double num2 = user.nextDouble();

        if (aritmeticOperator.equals("/") && num2 > 0) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
        else if (aritmeticOperator.equals("*")) {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        }
        else if (aritmeticOperator.equals("-")) {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }
        else if (aritmeticOperator.equals("+")) {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }
        else if (aritmeticOperator.equals("%")) {
            System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        }
        else {
            System.out.println("The operator is invalid, please enter / * - + %");
        }
    }
}

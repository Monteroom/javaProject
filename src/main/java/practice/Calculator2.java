package practice;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

        Scanner calculator = new Scanner(System.in);

        System.out.println("Enter first number");
        double num1 = calculator.nextDouble();

        System.out.println("Enter an arithmetic operator: / + - * %");
        String arithmeticOperator = calculator.nextLine();

        System.out.println("Enter second number");
        double num2 = calculator.nextDouble();

        if (arithmeticOperator.equals("/")) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
        else if (arithmeticOperator.equals("+")) {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }
        else if (arithmeticOperator.equals("-"))  {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }
        else if (arithmeticOperator.equals("*")) {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        }
        else if (arithmeticOperator.equals("%")){
            System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        }
        else {
            System.out.println("Invalid arithmetic operator");
        }
    }
}

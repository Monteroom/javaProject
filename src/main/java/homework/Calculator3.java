package homework;

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean yesNo = true;

        do {
            System.out.println("Enter a first number");
            int num1 = sc.nextInt();

            System.out.println("Enter an operator: + - / * %");
            String str = sc.next();

            System.out.println("Enter second number");
            int num2 = sc.nextInt();

            if (str.equals("+")) {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            }
            else if (str.equals("-")) {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            }
            else if (str.equals("/")) {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
            else if (str.equals("*")) {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            }
            else if (str.equals("%")) {
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
            }
            else {
                System.out.println("Invalid operator");
            }
            System.out.println("Want to try again : true / false");
            yesNo = sc.nextBoolean();
        }while (yesNo);
    }
}

package homework;

import java.util.Scanner;

public class Calculator4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean yesNo = true;

        do {
            System.out.println("Enter a first number");
            int num1 = sc.nextInt();

            System.out.println("Enter an operator: + - / * %");
            String str = sc.next();

            System.out.println("Enter a second number");
            int num2 = sc.nextInt();

            switch (str) {
                case "+":
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case "-":
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case "*":
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                case "/":
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case "%":
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                    break;
                default:
                    System.out.println("Invalid operator");
                    break;
            }
            System.out.println("Do you want to continue: true / false");
            yesNo = sc.nextBoolean();
        }while (yesNo);
    }
}

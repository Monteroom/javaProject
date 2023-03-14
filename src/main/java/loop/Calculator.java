package loop;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
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
            if (str.equals("+")) {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            }
            else if (str.equals("-")) {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            }
            else if (str.equals("*")) {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            }
            else if (str.equals("/")) {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
            else if (str.equals("%")) {
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
            }
            System.out.println("Do you want to continue? true/false");
            yesNo = sc.nextBoolean();
        }while (yesNo);
    }
}

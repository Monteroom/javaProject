package scannerClass;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);              // String name1 = name.nextLine()
        System.out.println("Enter first number");           // short num1 = name.nextShort()
        int num1 = name.nextInt();                          // int num1 = name.nextInt()
        System.out.println("Enter second number");          // long num1 = name.nextLong()
        int num2 = name.nextInt();                          // float num1 = name.nextFloat()
        System.out.println("Enter third number");           // double num1 = name.nextDouble()
        int num3 = name.nextInt();                          // container should match .next
        System.out.println("The multiplication of all numbers is: " + (num1 * num2 * num3));

    }
}

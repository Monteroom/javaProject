package homework;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int num = sc.nextInt();
        int result = 1;

        int a = 1;
        while (a <= num) {
            result *= a;
            a++;
        }
        if (num <= 0) {
            System.out.println("Input must be positive. Please try again");
        }
        else {
            System.out.println("The factorial of a number " + num + " is " + result);
        }
    }
}

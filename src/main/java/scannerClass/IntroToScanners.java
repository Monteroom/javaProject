package scannerClass;


import java.util.Scanner;

public class IntroToScanners {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = name.nextInt();
        System.out.println("Enter second number");
        int num2 = name.nextInt();
        System.out.println("The sum :" + (num1 +num2));
    }
}

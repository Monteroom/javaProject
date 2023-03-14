package homework;

import primitiveDataTypes.PracticeBoolean;

public class HomeWorkIfElseClass {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 10;
        int num3 = 10;

        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Two numbers are equal");
        }
        else {
            System.out.println("None of them are equal");
        }

        num1 = 112;

        if (num1 % 3 == 0 || num1 % 5 == 0) {
            System.out.println("Number is multiple of 3 or 5");
        }
        else {
            System.out.println("Number is not multiple of 3 or 5");
        }

        num1 = 10;
        num2 = 134;

        if ((num1 + num2) % 2 == 0) {
            System.out.println("The sum is even");
        }
        else {
            System.out.println("The sum is odd");
        }

        num1 = 123;
        boolean isPrime = true;

        for (int a = 2; a < num1; a++) {
            if (num1 % a == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime) {
            System.out.println("Number is prime");
        }
        else {
            System.out.println("Number is not prime");
        }
    }
}

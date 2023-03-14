package homework;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
        int number = sc.nextInt();

        boolean isPrime = true;

        for (int a = 2; a < number; a++) {
            if (number % a == 0) {
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
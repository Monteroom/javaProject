package homework;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0;

        int a = 1;
        while (a <= num) {
            sum += a;
            a += 2;
        }
        if (num <= 0) {
            System.out.println("Invalid input. Enter a positive number");
        }
        else {
            System.out.println("The sum of odd integers up to " + num + " is " + sum);
        }

    }
}

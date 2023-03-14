package practice;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;
        int numOfNumbers = 0;

        do {
            System.out.println("Enter a positive number (or negative to quit)");
            number = sc.nextInt();
            if (number > 0) {
                sum += number;
                numOfNumbers++;
            }

        }while (number > 0);
        System.out.println("The sum of numbers: " + sum);
        System.out.println("The average of numbers " + (double)(sum / numOfNumbers));
    }
}

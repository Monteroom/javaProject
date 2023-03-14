package loop;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num1;
        int numOfNumbers = 0;
        do {
            System.out.println("Enter a positive number (or negative to quit)");
            num1 = sc.nextInt();
            if (num1 > 0) {
                sum += num1;
                numOfNumbers++;
            }
        }
        while (num1 > 0);
        System.out.println("The sum of all numbers: " + sum);
        System.out.println("The average of all numbers: " + (double)(sum / numOfNumbers));
    }
}

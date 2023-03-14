package homework;

import java.util.Scanner;

public class PracticeForLoops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get a factorial");
        int number = sc.nextInt();
        int result = 1;

        for (int a = 1; a <= number; a++) {
            result *= a;
        }
        System.out.println("The factorial of " + number + " is: " + result);

//        ====================================

        System.out.println("Enter a number");
        int num1 = sc.nextInt();

        int sum = 0;
        for (int b = num1; b > 0; b /= 10) {
            sum += b % 10;
        }
        System.out.println("The sum of all digits in number is: " + sum);

//        =========================================

        for (int c = 100; c >= 0; c--) {
            if (c % 2 == 1) {
                System.out.println(c + " - odd");
            }
        }

//        ==========================================

        for (int d = 1; d <= 31; d++) {
            System.out.println(d + " March 2023");
        }
//        ===========================================

        for (int i = 50; i >= 1; i--) {
            if (i % 8 == 0) {
                System.out.println(i + " - divisible by 8");
            }
        }
    }
}

package homework;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a number");
            number = sc.nextInt();
            for (int a = 1; a <= number; a++) {
                if (a % 3 == 0 & a % 5 != 0) {
                    System.out.println(a);
                }
            }
            if (number <= 0) {
                System.out.println("Enter a positive number");
            } else if (number > 0 && number <= 2) {
                System.out.println("There is no positive integers that can be divided by 3, but not by 5");
            }
        }while (number < 0);
    }
}

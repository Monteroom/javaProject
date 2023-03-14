package loop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
            int m = 1;
        while (m <= 100) {
            System.out.println(m);
            m++;
        }
        int k = 1;
        while (k <= 10) {
            System.out.println("Good morning everyone");
            k++;
        }

        for (int a = 1; a <= 10; a++){
            System.out.println("Good morning everyone");
        }

        int o = 100;
        while (o > 0) {
            if (o % 2 != 0) {
                System.out.println(o);
            }
            o--;
        }

        for (int a = 100; a >= 1; a--) {
            if (a % 2 != 0) {
                System.out.println(a);
            }

        }

        int p = 1;
        while (p <= 31) {
            System.out.println(p + " January 2023");
            p++;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = sc.nextInt();
        boolean isPrime = true;

        int num1 = 2;
        while (num1 < number) {
            if (number % num1 == 0) {
                isPrime = false;
                break;
            }
            num1++;
        }
        if (isPrime) {
            System.out.println("The number is prime");
        }
        else {
            System.out.println("Number is not prime");
        }

    }
}

package loop;

import java.util.Scanner;

public class BreakPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        for (int a = 1; a <= sum; a++) {
            if (a == 45) {
                break;
            }
            System.out.println(a);
        }


    }
}

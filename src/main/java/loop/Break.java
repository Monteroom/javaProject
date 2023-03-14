package loop;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        int limit = 40;

        for (int a = 0; a <= number; a++) {

            if (a > limit) {
                break; // stop and jump out of loop
            }
            System.out.println(a);
        }

    }
}

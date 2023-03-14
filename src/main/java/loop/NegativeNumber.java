package loop;

import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Enter negative number");
            number = sc.nextInt();
            if (number >= 0) {
                System.out.println("");
            }

        }
        while (number >= 0);
    }
}

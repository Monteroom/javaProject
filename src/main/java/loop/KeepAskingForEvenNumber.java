package loop;

import java.util.Scanner;

public class KeepAskingForEvenNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Enter even number");
            number = sc.nextInt();
            if (number % 2 != 0) {
                System.out.println("Wrong number");
            }
        }while (number % 2 != 0);
    }
}

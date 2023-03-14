package homework;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int amountOfDigits;

        do {
            System.out.println("Enter a string");
            String str = sc.nextLine();
            amountOfDigits = 0;
            for (int a = 0; a < str.length(); a++) {
                char c = str.charAt(a);
                if ("1234567890".indexOf(c) != -1) {
                    amountOfDigits++;
                }
            }
            System.out.println("The amount of digits: " + amountOfDigits);
            if (amountOfDigits == 3) {
                System.out.println("You entered a string with 3 digits");
            }
        }while (amountOfDigits != 3);
    }
}

package scannerClass;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("Enter an input");
        int num1 = user.nextInt();

        if (num1 >= 1 && num1 <= 10) {
            System.out.println("Valid input");
        }
        else {
            System.out.println("Invalid input");
        }
    }
}

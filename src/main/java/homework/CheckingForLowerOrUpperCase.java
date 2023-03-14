package homework;

import java.util.Scanner;

public class CheckingForLowerOrUpperCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);

        if (!Character.isLetter(ch)) {
            System.out.println("Invalid character");
        }
        else if (Character.isUpperCase(ch)) {
            System.out.println("The character is in upper case");
        }
        else {
            System.out.println("The character in lower case");
        }
    }
}



package homework;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a palidrom");
        String str = sc.nextLine().replace(" ", "");
        String reverse = "";
        for (int a = str.length() - 1; a >= 0; a--) {
            reverse += str.charAt(a);

        }
        if (str.equalsIgnoreCase(reverse)) {
            System.out.println("It's palidrome");
        }
        else {
            System.out.println("It's not a palidrome");
        }
        /*
        String str = "affsf"
        String reverse = "";
        for (int a = str.length() - 1; a >= 0; a--) {
        reverse += str.charAt(a);
        }
        if (str.equals(reverse)) {


         */
    }

}
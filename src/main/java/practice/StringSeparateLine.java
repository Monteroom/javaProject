package practice;

import java.util.Scanner;

public class StringSeparateLine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter something");
        String str = sc.nextLine();

        for (int a = 0; a < str.length(); a++) {
            char c = str.charAt(a);
            System.out.println(c);
        }
    }
}

package loop;

import java.util.Scanner;

public class ReverseStringClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        String str = sc.nextLine();

        String reverse = "";
        for (int a = str.length() - 1; a >= 0; a--) {
                reverse += str.charAt(a);
        }
        System.out.println("The word in reverse: " + reverse);
    }
}

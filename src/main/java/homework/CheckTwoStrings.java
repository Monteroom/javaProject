package homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckTwoStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string");
        String str1 = sc.nextLine();

        System.out.println("Enter second string");
        String str2 = sc.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Both strings are equal");
        }
        else {
            System.out.println("Strings are different");
        }
    }
}

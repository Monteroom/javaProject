package homework;

import java.util.Scanner;

public class IfElseLogicalOperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a single character");
        String letter = sc.nextLine().toLowerCase();

        if (letter.equalsIgnoreCase("a" ) || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("e")
                || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("u")) {
            System.out.println("This is the vowel");
        }
        else {
            System.out.println("Consonant");
        }
//================================================================
        System.out.println("Enter your grade");
        int grade = sc.nextInt();

        if (grade <= 60) {
            System.out.println("Your grade is F");
        }
        else if (grade > 60 && grade <= 70) {
            System.out.println("Your grade is D");
        }
        else if (grade > 70 && grade <= 80) {
            System.out.println("Your grade is C");
        }
        else if (grade > 80 && grade <= 90) {
            System.out.println("Your grade is B");
        }
        else if (grade > 90 && grade <= 100) {
            System.out.println("Your grade is A");
        }
        else {
            System.out.println("Invalid grade");
        }
//===================================================
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
//        ====================================
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age < 21) {
            System.out.println("You are not eligible to vote. Grow up");
        }
        else {
            System.out.println("Your vote is important to us");
        }
//        ===========================================

        System.out.println("Enter first string");
        String str1 = sc.next();

        System.out.println("Enter second string");
        String str2 = sc.next();

        if (str1.equals(str2)) {
            System.out.println("Both strings are equal");
        }
        else {
            System.out.println("Strings are different");
        }
    }
}

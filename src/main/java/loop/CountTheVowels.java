package loop;

import java.util.Scanner;

public class CountTheVowels {
    public static void main(String[] args) {
/*
write a program that will ask user to enter a string
and output the number of vowel that string has.
keep asking user to enter string and outputting the number of vowels,
until user enters a string with 10 vowels      | a i e o u
 */
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int vowelAmount;

        do {
            System.out.println("Enter string");
            String str = sc.nextLine();
            vowelAmount = 0;
            for (int a = 0; a < str.length(); a++) {
                char c = str.charAt(a);
                if ("aeoiuAEOUI".indexOf(c) != -1) {
                    vowelAmount++;
                }
            }
            System.out.println("The number is of vowels is: " + vowelAmount);

        }while (vowelAmount != 10);
    }
}

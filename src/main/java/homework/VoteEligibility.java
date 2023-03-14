package homework;

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age < 21) {
            System.out.println("You are not eligible to vote. Grow up");
        }
        else {
            System.out.println("Your vote is important to us");
        }
    }
}

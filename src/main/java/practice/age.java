package practice;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {

        Scanner userage = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = userage.nextInt();
        if (age <= 18) {
            System.out.println("You are young");
        }
        else {
            System.out.println("You are eligible to drive ");
        }

    }
}

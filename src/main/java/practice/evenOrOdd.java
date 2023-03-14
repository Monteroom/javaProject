package practice;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {

        Scanner evenOdd = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = evenOdd.nextInt();

        if (num == 0) {
            System.out.println("Invalid number");
        }
        else if (num % 2 == 0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }

    }
}

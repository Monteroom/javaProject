package loop;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int random = new Random().nextInt(1, 100);
        System.out.println(random);
        Scanner  sc = new Scanner(System.in);
            int num1 = 0;
        do {
            System.out.println("Guess the number");
            num1 = sc.nextInt();
            if (num1 > random) {
                System.out.println("Too high, try again");
            }
            else if (num1 < random) {
                System.out.println("Too low, try again");
            }
            else {
                System.out.println("You guessed the number");
            }
            if (num1 < 1 || num1 > 100) {
                System.out.println("Enter a number in range of 1 to 100");
            }
        }while (num1 != random);


    }
}

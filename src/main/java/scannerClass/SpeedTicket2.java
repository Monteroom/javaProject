package scannerClass;

import java.util.Scanner;

public class SpeedTicket2 {
    public static void main(String[] args) {
        Scanner driver = new Scanner(System.in);

        System.out.println("Enter speed");
        int speed = driver.nextInt();
        System.out.println("Is it your birthday today? true/false");
        boolean isBirthday = driver.nextBoolean();

        if (!isBirthday) {
            if (speed <= 60) {
                System.out.println("Have a nice day");
            }
            else if (speed > 60 && speed <= 80) {
                System.out.println("Small ticket");
            }
            else if (speed > 80 && speed <= 100) {
                System.out.println("Medium ticket");
            }
            else {
                System.out.println("Large ticket");
            }
        }
        else {

            if (speed > 60 && speed <= 80) {
                System.out.println("Have a nice day");
            }
            else if (speed > 80 && speed <= 100) {
                System.out.println("Small ticket");
            }
            else {
                System.out.println("Medium ticket");
            }

        }
    }
}

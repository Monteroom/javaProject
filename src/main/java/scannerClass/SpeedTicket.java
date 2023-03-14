package scannerClass;

import java.util.Scanner;

public class SpeedTicket {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("what was the speed");
         int speed = user.nextInt();
        System.out.println("Is it your birthday today?");
         boolean isBirthday = user.nextBoolean();

         if (speed <= 60) {
             System.out.println("No ticket, Have a nice day");
         }
         else if (speed > 60 && speed <= 80) {
             System.out.println("Small ticket, slow down");
             if (isBirthday == true) {
                 System.out.println("Happy Birthday, drive safe");
             }
         }
         else if (speed > 80 && speed <= 100) {
             System.out.println("Medium ticket, last warning");
             if (isBirthday == true) {
                 System.out.println("Happy Birthday, but here is your ticket");
             }
         }
         else if (speed > 100) {
             System.out.println("Large ticket, you gonna go to jail");
             if (isBirthday == true) {
                 System.out.println("Happy Birthday, that's your lucky day");
             }
         }



    }
}

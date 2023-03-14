package homework;

import java.util.Scanner;

public class WeekDayOrWeekendDay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day");
        String str = sc.nextLine().toLowerCase();
        switch (str) {
            case "monday", "tuesday", "wednesday", "thursday", "friday":
                System.out.println("It's a week day");
                break;
            case "saturday", "sunday":
                System.out.println("It's a weekend");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}

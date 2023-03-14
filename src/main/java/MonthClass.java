import java.util.Scanner;

public class MonthClass {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("Enter the month");
        String month = user.nextLine();

        if (month.equalsIgnoreCase("January")
                || month.equalsIgnoreCase("February") || month.equalsIgnoreCase("December")) {
            System.out.println("Winter time");
        }
        else if (month.equalsIgnoreCase("March")
                || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
            System.out.println("Spring time");
        }
        else if (month.equalsIgnoreCase("June")
                || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
            System.out.println("Summer time");
        }
        else if (month.equalsIgnoreCase("September")
                || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
            System.out.println("Fall time");
        }
        else {
            System.out.println("Go to school and learn month");
        }
    }
}

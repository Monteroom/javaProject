package ifElse;

public class IfElseDay2 {
    public static void main(String[] args) {

        int day = 3;

        if (day == 1) {
            System.out.println("Monday");
        }
        else if (day == 2) {
            System.out.println("Tuesday");
        }
        else if (day == 3) {
            System.out.println("Wednesday");
        }
        else if (day == 4) {
            System.out.println("Thursday");
        }
        else if (day == 5) {
            System.out.println("Friday");
        }
        else if (day == 6) {
            System.out.println("Saturday");
        }
        else if (day == 7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("Invalid day");
        }

        String day1 = "Monday";

        if (day1.equalsIgnoreCase("Monday")) {
            System.out.println("1");
        }
        else if (day1.equalsIgnoreCase("Tuesday")) {
            System.out.println("2");
        }
        else if (day1.equalsIgnoreCase("Wednesday")) {
            System.out.println("3");
        }
        else if (day1.equalsIgnoreCase("Thursday")) {
            System.out.println("4");
        }
        else if (day1.equalsIgnoreCase("Friday")) {
            System.out.println("5");
        }
        else if (day1.equalsIgnoreCase("Saturday")) {
            System.out.println("6");
        }
        else if (day1.equalsIgnoreCase("Sunday")) {
            System.out.println("7");
        }
        else {
            System.out.println("Wrong day");
        }

        byte time =18;

        if (time >= 9 && time <= 17) {
            System.out.println("Work hours");
        }
        else if (time >= 7 && time <= 9 || time >=18 && time <= 19) {
            System.out.println("Commute hours");
        }
        else if (time >= 6 && time <= 8) {
            System.out.println("Breakfast time");
        }
        else if (time >=12 && time <= 13) {
            System.out.println("Lunch time");
        }
        else if (time >= 20 && time <= 22) {
            System.out.println("Dinner time");
        }
        else if (time >= 0 && time <= 6) {
            System.out.println("Sleep time");
        }
        else if (time >= 22 && time <= 24) {
            System.out.println("Late time");
        }
        else {
            System.out.println("Wrong hours");
        }
    }
}

package homework;

public class IfElseHomework {
    public static void main(String[] args) {

        int a = 40;

        if (a > 0) {
            System.out.println("The number is positive");
        }
        else if (a < 0) {
            System.out.println("The number is negative");
        }
        else {
            System.out.println("The number is zero");
        }

        int year = 2019;

        if (year % 4 == 0) {
            System.out.println("Year is leap");
        }
        else if (year % 400 == 0) {
            System.out.println("Year is leap");
        }
        else {
            System.out.println("Year is not leap");
        }

        int num1 = 3;
        int num2 = 123;

        if (num1 > num2) {
            System.out.println("Number 1 is more than Number 2");
        }
        else if (num1 < num2) {
            System.out.println("Number 1 is less than Number 2");
        }

        double tempInFahrenheit = 77.3;

        if (tempInFahrenheit < 32) {
            System.out.println("Freezing");
        }
        else if (tempInFahrenheit > 212) {
            System.out.println("Boiling");
        }
        else {
            System.out.println("Normal weather");
        }

        byte month = 0;

        if (month > 0 && month <= 3) {
            System.out.println("It's winter");
        }
        else if (3 < month && month >= 6) {
            System.out.println("It's Spring");
        }
        else if (6 < month && month <= 9) {
            System.out.println("It's summer");
        }
        else if (9 < month && month <= 12) {
            System.out.println("It's fall");
        }
        else {
            System.out.println("Learn month");
        }
    }
}

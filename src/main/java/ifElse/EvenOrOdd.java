package ifElse;

public class EvenOrOdd {
    public static void main(String[] args) {

        int number = 9;
        if (number % 2 == 0) {
            System.out.println("The number is Even");
        }
        else {
            System.out.println("The number is Odd");
        }
        int num1 = 10;
        int num2 = 15;

        if (num1 > num2) {
            System.out.println("num1 greater than num2");
        }
        else if (num1 < num2) {
            System.out.println("num1 is less than num2");
        }
        else if (num1 == num2) {
            System.out.println("num1 is equal to num2");
        }
        else {
            System.out.println("nothing is working");
        }

        int digit = 40;

        if (digit > 0) {
            System.out.println("digit is positive");
        }
        else if (digit < 0){
            System.out.println("digit is negative");
        }
        else {
            System.out.println("digit is zero");
        }

    }
}

package arithmeticOperators;

public class OperatorsHomework2 {
    public static void main(String[] args) {
        int a = 7;
        int b = 12;
        int c;
        int ab = a + b;
        System.out.println("The sum of 7 and 12 is " + ab);

        a = 15;
        b = 8;
        ab = a - b;
        System.out.println("The difference between 15 and 8 is " + ab);

        a = 3;
        b = 5;
        c = 7;
        ab = a * b * c;
        System.out.println("The product of 3, 5 and 7 is " + ab);

        a = 20;
        b = 5;
        ab = a / b;
        System.out.println("The division of 20 by 5 is " + ab);

        a = 27;
        b = 4;
        ab = a % b;
        System.out.println("The remainder of 27 divided by 4 is " + ab);

        a = 2;
        b = 5;
        ab = a * a * a * a * a;
        System.out.println("2 raised to a power of 5 is " + ab);

        a = 10;
        b = 15;
        c = 20;
        ab = (a + b + c) / 3;
        System.out.println("The average of 10, 15 and 20 is " + ab);

        a = 5;
        b = 8;
        ab = a * b;
        System.out.println("The area of a rectangle with length 5 and width 8 is " + ab);

        a = 6;
        ab = 4 * a;
        System.out.println("The perimeter of a square with side 6 is " + ab);
    }
}

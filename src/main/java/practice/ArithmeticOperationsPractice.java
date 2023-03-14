package practice;

public class ArithmeticOperationsPractice {
    public static void main(String[] args) {

        int a = 100;
        int b = 20;
        System.out.println("Here is the sum of two integers: " + (a + b));
        System.out.println("Here is the difference of two integers: " + (a - b));
        System.out.println("Here is the multiplication of two integers: " + (a * b));
        System.out.println("Here is the division of a by b: " + (a / b));

        System.out.println("Here is the square of a: " + (a * a));
        System.out.println("Here is the square of b: " + (b * b));

        System.out.println("Here is 7 in power of 4: " + Math.pow(7, 4));

        a = 132;
        int hundreds = a / 100;
        int tens = (a % 100) / 10;
        int ones = a % 10;
        System.out.println("This is the hundreds: " + hundreds);
        System.out.println("This is the tens: " + tens);
        System.out.println("This is the ones: " + ones);

        System.out.println("Here is the sum of numbers in 132: " + (hundreds + tens + ones));

        System.out.println("Here is reversed number 132: " + ones + tens + hundreds);
   }
}

package arithmeticOperators;

public class IntroToModulus {
    public static void main (String [] args){
        /*
        % - modulus returns the remainder
            after division
         */

        int a = 12;
        int b = 5;
        int c = a % b; //2
        System.out.println(c);

        System.out.println(100 % 30); //10
        System.out.println(100 % 20); //0

        System.out.println(25 % 5); //0

        System.out.println(25 % 10); //5

        System.out.println(90 % 40); //10
        System.out.println(90 % 20); //10
        System.out.println(5 % 4); //1

        /*
        Even numbers are numbers that can be divided by 2
        Odd numbers are numbers that cannot be divided by 2
         */

        System.out.println(7 % 2); //1
        System.out.println(8 % 2); //0

        System.out.println(342 % 5); //342 cannot be divided by 5






    }
}

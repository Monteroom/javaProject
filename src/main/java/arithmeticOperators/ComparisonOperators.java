package arithmeticOperators;

public class ComparisonOperators {
    public static void main(String[] args) {
        /*
        Comparison operators are used to compare 2 values:

        > more than
        < less than
        >= more or equal
        <= less or equal
        == equal
        != not equal

         */

        byte potato = 5;
        byte fries = 10;

        System.out.println(potato > fries); //false
        System.out.println(potato < fries); //true
        System.out.println(potato >= fries); //false
        System.out.println(potato <= fries); //true
        System.out.println(potato == fries); //false
        System.out.println(potato != fries); //true

        /*
        1. create 2 bytes, 2 shorts, 2 ints, 2 longs
        2. assign different values
        3. compare bytes with shorts and ints
        (first just print, second comparison store in boolean and print)
        4. compare longs with bytes and ints
        (first just print, second comparison store in boolean and print)

         */

        int one = 5;
        int two = 4;
        System.out.println(one < two);

        boolean b = one < two;
        System.out.println(b);

        /*
             CONCATENATION works with Strings "  "
         */

        System.out.println(1 + 2); //3

        System.out.println(1 + 2 + " hello"); //3 hello

        System.out.println("hello" + 1 + 2); //hello12
        System.out.println("hello" + (1 + 2)); //hello3

        System.out.println("hello" + 3 + true); //hello3true
        System.out.println("hello" + 3 + false); //hello3false

        System.out.println((1 + 2 == 3) + " hello" + 4 * 5); //truehello20

        System.out.println(4 * 4 - 20 + " HI " + ( 4 == 5) + true);//-4 HI falsetrue




    }
}

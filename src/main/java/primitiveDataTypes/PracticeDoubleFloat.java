package primitiveDataTypes;

public class PracticeDoubleFloat {
    public static void main (String [] args){
        /*
        float and double are variables that store decimal numbers
        both float and double can store both number (fractional and whole)
        double is larger that float
        double is the most precise variable
        double can store 16 digits before dot
        float can store 6-7 digits before dot
        Java thinks that all decimal numbers are double
        to make sure float is float put F/f in the end
         */

        double priceOfBread = 4.99;
        double priceOfApples = 3.9955512431442459999999;
        System.out.println(priceOfApples);
        priceOfBread = 33.12;
        System.out.println(priceOfBread);
        priceOfBread = 99.99;
        System.out.println(priceOfBread);

        byte byte1 = 2;
        short short1 = 5;
        int int1 = 7;
        long long1 = 345;
        float float1 = 3454.64F;
        double double1 = 2343;

        float1 = (float)double1;
        double1 = float1;
        float1 = int1;
        float1 = long1;
        double1 = 4.99;
        long1 = (long)double1;
        System.out.println(long1);

        /*
            4.88 -
         */

       float myFloat1 = 99.99F;
       double myDouble1 = 33.99;
       myFloat1 = (float)myDouble1;
       System.out.println(myFloat1);

       float myFloat2 = 1.99F;
       double myDouble2 = 44.23;
       myFloat2 = (float)myDouble2;
       System.out.println(myFloat2);

       float myFloat3 = 2.34F;
       double myDouble3 = 54.93;
       myDouble3 = myFloat3;
       System.out.println(myDouble3);

       float myFloat4 = 3.89F;
       double myDouble4 = 234.11;
       myDouble4 = myFloat4;
       System.out.println(myDouble4);

       float myFloat5 = 4.78F;
       double myDouble5 = 74.12;
       myFloat5 = (float)myDouble5;
       System.out.println(myFloat5);

       float myFloat6 = 5.92F;
       double myDouble6 = 778.99;
       myFloat6 = (float)myDouble6;
       System.out.println(myFloat6);

       float myFloat7 = 8.73F;
       double myDouble7 = 2123.12;
       myDouble7 = myFloat7;
       System.out.println(myDouble7);

       float myFloat8 = 10.99F;
       double myDouble8 = 123.55;
       myFloat8 = (float)myDouble8;
       System.out.println(myFloat8);

       float myFloat9 = 11.44F;
       double myDouble9 = 123.1343;
       myDouble9 = myFloat9;
       System.out.println(myDouble9);

       float myFloat10 = 14.98F;
       double myDouble10 = 847.84774;
       myFloat10 = (float)myDouble10;
       System.out.println(myFloat10);








    }
}

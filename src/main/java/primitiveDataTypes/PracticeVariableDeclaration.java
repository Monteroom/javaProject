package primitiveDataTypes;

public class PracticeVariableDeclaration {
    public static void main (String [] args){
        byte myByte; //declared variable from -128 to 127
        byte _another_byte;

        myByte = 5;
        myByte = 10;
        System.out.println(myByte);
        myByte = 20;
        System.out.println(myByte);
        _another_byte = 100;
        System.out.println(_another_byte);


        /*
        //single line comment
        multiply line comment
        1. Declare variable (means create container)
        2. Assign value to variable (put value inside variable)
        3. Reassign value to variable (put new value to the same variable)
         */

        short max1;
        max1 = -32768;
        System.out.println(max1);
        max1 = 32767;
        System.out.println(max1);

        short max2;
        max2 = 30;
        System.out.println(max2);
        max2 = 40;
        System.out.println(max2);

        short max3;
        max3 = 11;
        System.out.println(max3);
        max3 = 22;
        System.out.println(max3);

        short max4;
        max4 = 33;
        System.out.println(max4);
        max4 = 44;
        System.out.println(max4);

        short max5;
        max5 = 12;
        System.out.println(max5);
        max5 = 23;
        System.out.println(max5);

        int m1;
        m1 = -2147483648;
        System.out.println(m1);
        m1 = 2147483647;
        System.out.println(m1);

        int m2;
        m2 = 3;
        System.out.println(m2);
        m2 = 4;
        System.out.println(m2);

        int m3;
        m3 = 111;
        System.out.println(m3);
        m3 = 222;
        System.out.println(m3);

        int m4;
        m4 = 223;
        System.out.println(m4);
        m4 = 332;
        System.out.println(m4);

        int m5;
        m5 = 444;
        System.out.println(m5);
        m5 = 555;
        System.out.println(m5);

        m4 = m5;
        System.out.println(m5);
        System.out.println(m4);

        long myLong;
        myLong = 2000000000;
        System.out.println(myLong);
        myLong = -2000000000;

        long myLong2;
        myLong2 = 2147483648L;
        System.out.println(myLong2);
        myLong2 = -2147483649L;
        System.out.println(myLong2);

        myLong2 = m3;

        byte numberByte = 127;
        short numberShort = 32767;
        int numberInt = 2147483647;
        long numberLong = 2147483648L;

        //numberShort = numberByte;
        //numberByte = numberShort;  not working

        //CASTING - is used to store larger variable values into smaller variable values
        numberByte = (byte)numberShort;
        numberShort = (byte)numberLong;
        numberInt = (int) numberLong;
        System.out.println(numberInt);


        byte byteNumber = 0;
        short shortNumber = 0;
        int intNumber = 0;
        long longNumber = 2147483000;

        intNumber = (int)longNumber;
        System.out.println(intNumber);

        intNumber = 200;
        byteNumber = (byte)intNumber;
        System.out.println(byteNumber);

        byteNumber = 30;
        shortNumber = byteNumber;









    }
}

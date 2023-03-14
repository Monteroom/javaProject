package primitiveDataTypes;

public class IntroToPrimitive {
    public static void main(String [] args){
        int age = 27;
        int number = 100;
        System.out.println(age);
        System.out.println(number);

        age = 28;

        byte myByte1 = 36;//declaring or creating a variable
        byte myByte2 = -117;
        byte myByte3 = 127;
        byte myByte4 = -128;
        myByte1 = 100;//reassigning value
        System.out.println(myByte1);
        myByte2 = 126;
        System.out.println(myByte2);
        myByte3 = -123;
        System.out.println(myByte3);
        myByte4 = -99;
        System.out.println(myByte4);

        myByte1 = 111;
        System.out.println(myByte1);
        myByte2 = 112;
        System.out.println(myByte2);
        myByte3 = -111;
        System.out.println(myByte3);
        myByte4 = -100;
        System.out.println(myByte4);
        short iceCreamPerDay = 5000;
        short iceCreamPerWeek = 25000;
        //short iceCreamPerMonth = 100000; more than 32768
        System.out.println(iceCreamPerDay);
        System.out.println(iceCreamPerWeek);
        int followers = 1300;
        followers = 300000;
        followers = 2140000000;
        long creditCard1 = 1111222233334444L;
        long creditCard2 = 12341234L;
    }
}

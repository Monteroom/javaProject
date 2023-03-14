package primitiveDataTypes;

public class HomeworkPracticeCasting {
    public static void main(String[] args) {
        byte byte1 = 10;
        short short1 = 100;
        int int1 = 1000;
        long long1 = 10000;
        float float1 = 100.11f;
        double double1 = 10.1101;

        short1 = byte1;
        int1 = byte1;
        long1 = byte1;
        float1 = byte1;
        double1 = byte1;
        //------
        byte1 = (byte)short1;
        int1 = short1;
        long1 = short1;
        float1 = short1;
        double1 = short1;
        //-----
        byte1 = (byte)int1;
        short1 = (short)int1;
        long1 = int1;
        float1 = int1;
        double1 = int1;
        //-----
        byte1 = (byte)long1;
        short1 = (short)long1;
        int1 = (int)long1;
        float1 = long1;
        double1 = long1;
        //----
        byte1 = (byte)float1;
        short1 = (short)float1;
        int1 = (int)float1;
        long1 = (long)float1;
        double1 = float1;
        //----
        byte1 = (byte)double1;
        short1 = (short)double1;
        int1 = (int)double1;
        long1 = (long)double1;
        float1 = (float)double1;

        System.out.println(byte1);
        System.out.println(short1);
        System.out.println(int1);
        System.out.println(long1);
        System.out.println(float1);
        System.out.println(double1);

    }
}

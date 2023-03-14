package arithmeticOperators;

public class OperatorsHomework {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        a += b;
        System.out.println(a);
        /*

         */
        int q = 5;
        int w = 9;
        int e = 10;
        q += w + e;
        System.out.println(q);
        /*

         */
        byte z = 1;
        byte y = 2;
        byte x = 7;
        int zy =(byte)z + y;
        System.out.println(z + " + " + y + " = " + zy);

        int zx =(byte)zy- z;
        System.out.println(zy + " - " + z + " = " + zx);

        int yy =(byte)y * y;
        System.out.println(y + " * " + y + " = " + yy);

        System.out.println(yy + " / " + y + " = " + y);

        int yyy =(byte)y * y * y;
        int yya =(byte)y + yyy;
        System.out.println(y + " + " + yyy + " = " + yya);

        int zw =(byte)yya % x;
        System.out.println(yya + " % " + x + " = " + zw);
        /*

         */
        byte length = 9;
        byte width = 15;
        int area =(byte)length * width;
        int perimeter =(byte)2 * (length + width);
        System.out.println("The area of a rectangle is " + area);
        System.out.println("The perimeter of a rectangle is " + perimeter);
        /*

         */
        int zyx = 2345;
        int gg = (((zyx + 8) / 3) % 5) * 5;
        System.out.println(gg);
        /*

         */
        int xyz = 2345;
        xyz += 8;
        xyz /= 3;
        xyz %= 5;
        xyz *= 5;
        System.out.println(xyz);
        /*

         */
        int d = 23;
        int g = 45;
        System.out.println(d==g);

        int h = 10;
        int j = -10;
        System.out.println(h!=j);









    }
}

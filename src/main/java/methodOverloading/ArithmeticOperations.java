package methodOverloading;

public class ArithmeticOperations {

    public int task1 (int num1, int num2) {
        return num1 + num2;
    }
    public int task1 (int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public int task2 (int num1, int num2, int num3, int num4) {
        return (num1 + num2 + num3 + num4) / 4;
    }
    public int task2 (int num1, int num2, int num3, int num4, int num5, int num6) {
        return (num1 + num2 + num3 + num4 + num5 + num6) / 4;
    }
    public double getAreaOfTriangle (int base, int height) {
        return (base * height) / 2;
    }
    public double getAreaOfTriangle (int a, int b, int c) {
        double semiperimeter = (a + b + c) / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
    }
}

package practice;

public class FibanachiSequence2 {
    public static void main(String[] args) {

        long amountOfDigits = 50;
        long a = 0;
        long b = 1;

        System.out.print(a + " ");
        System.out.print(b + " ");

        for (long c = 2; c < amountOfDigits; c++) {
            long next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}

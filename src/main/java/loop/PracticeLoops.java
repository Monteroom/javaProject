package loop;

public class PracticeLoops {
    public static void main(String[] args) {

        for (int a = 10; a >= 1; a--) {
            System.out.println("The value of x is: " + a);
        }
        for (int b = 10; b >= 0; b -= 2) {
            System.out.println("The value of y is: " + b);
        }
        for (int c = 1; c <= 15; c += 2) {
            System.out.println("The value of num is: " + c);
        }
        int sum = 0;
        for (int d = 1; d <= 10; d++) {
            System.out.println("The value of num is: " + d);
            sum = sum + d;

        }

        System.out.println("The sum is: " + sum);

        sum = 0;

        for (int g = 0; g <= 100; g+=2) {
            System.out.println("The value of num is: " + g);
            sum = sum + g;
        }
        System.out.println("the sum is: " + sum);
    }
}

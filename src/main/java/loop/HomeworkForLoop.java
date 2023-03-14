package loop;

public class HomeworkForLoop {
    public static void main(String[] args) {

        for (int num = 1; num <= 50; num++) {
            if (num % 5 == 0) {
                System.out.println(num);
            }
        }

        for (int num = 2; num <= 20; num+=2) {
            System.out.println(num);
        }

        for (int num = 10; num > 0; num--) {
            System.out.println(num);
        }

        for (int num = 1; num <= 10; num++) {
            System.out.println("5" + " * " + num + " = " + (5 * num));
        }

        for (int num = 1; num <= 5; num++) {
            for (int num1 = 1; num1 <= 5; num1++) {
                System.out.print((num * num1) + "\t");
            }
            System.out.println();
        }
        for (int num = 1; num <= 40; num++) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        int num1 = 0;
        for (int num = 1; num <= 100; num++) {
            if (num % 2 == 0) {
                System.out.println(num);
                num1 = num1 + num;
            }
        }
        System.out.println("The sum is: " + num1);

        int num = 1234;
        int sum = 0;
        for (int i = num; i > 0; i /= 10) {
            sum += i % 10;
        }

        System.out.println("The sum of the digits of " + num + " is " + sum);

        for (int a = 6; a >= 1; a-- ) {
            for (int n = 1; n <= a; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int a = 0; a <= 4; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}

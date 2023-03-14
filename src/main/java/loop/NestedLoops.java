package loop;

public class NestedLoops {
    public static void main(String[] args) {
        /*
        nested loops = loop inside loop
        nested switch = switch inside switch
        nested if = if inside if
         */

        for (int a = 1; a <= 15; a++) {
            for (int c = 1; c <= 15; c++) {
                System.out.print((a * c) + "\t");
            }
            System.out.println();
        }


        //========================

        for (int row = 1; row <= 6; row++ ) {
            for (int numberOfStar = 1; numberOfStar <= row; numberOfStar++) {
            System.out.print("* ");
        }
            System.out.println();
        }

            int row1 = 5;
        for (int k = 1; k <= row1; k++ ) {
            for (int i = row1 - k; i>= 1; i--) {
                System.out.print(" ");

            }
           for (int l = 1; l <= k; l++) {
                System.out.print(" *");
            }

            System.out.println();
        }

        int height = 6;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= height - 2; i++) {
            System.out.print(" ");
        }
        System.out.println("***");

        }
}

package loop;

import javax.swing.text.html.StyleSheet;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticeContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a negative number");
        int neg = sc.nextInt();
        System.out.println("Enter a positive number");
        int pos = sc.nextInt();

        for (int a = neg; a <= pos; a++) {
            if (a <= 0 && a % 2 == 0) {
                continue;
            }
            else if (a > 0 && a % 2 != 0) {
                continue;

            }System.out.println(a);
        }


    }
}

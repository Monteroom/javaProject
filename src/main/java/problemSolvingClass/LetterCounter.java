package problemSolvingClass;

import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = sc.nextLine();


        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            for (int a = 0; a < str.length(); a++) {
            if (str.charAt(i) == str.charAt(a)) {
                counter++;

            }
            }
            System.out.println(str.charAt(i) + " " + counter);
        }

    }
}

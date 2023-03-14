package loop;

import java.util.Scanner;

public class CountTheVowels2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter;
        do {
            System.out.println("Enter a string with 10 vowels:");
            String word = scanner.nextLine();
            counter = 0;

            for (int i = 0; i < word.length(); i++){

                word = word.toLowerCase();

                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'o'
                        || word.charAt(i) == 'i' || word.charAt(i) == 'u'){
                    counter++;
                }
            }

            System.out.println("The entered word's vowel count: " + counter);

        }while (counter != 10);
    }
}

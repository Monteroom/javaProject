package switchStatement;

public class Weekdays  {
    public static void main(String[] args) {

        int day = 6;

        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.println("Weekday");
                break;
            case 6, 7:
                System.out.println("Weekends");
                break;
            default:
                System.out.println("Invalid number");
        }
        char letter = 'a';
        switch (Character.toUpperCase(letter)) {
            case 'A' , 'E', 'I', 'O', 'U':
                System.out.println("Vowels");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}

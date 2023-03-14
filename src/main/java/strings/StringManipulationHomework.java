package strings;

import java.sql.SQLOutput;

public class StringManipulationHomework {
    public static void main(String[] args) {

        String message = "Hello everyone, Let's do Java String exercises";
        String y = "Max";
        System.out.println("The character at position 10 is " + y);

        System.out.println("The length of message is " + message.length());

        System.out.println("Here is message in uppercase: " + message.toUpperCase());

        System.out.println("Here is message in lowercase: " + message.toLowerCase());

        char a = message.charAt(5);
        System.out.println("Here is letter 5 from the message: " + a);

        System.out.println(message.length());
        System.out.println("Here is last letter from the message: " + message.charAt(45));

        System.out.println("Here is the first letter in lowercase: " + message.toLowerCase().charAt(0));

        System.out.println("Here is the last letter in uppercase: " + message.toUpperCase().charAt(45));
    }
}

package strings;

import java.sql.SQLOutput;

public class StringManipulationHW2 {
    public static void main(String[] args) {
        String quote = "Automation testers do not just find bugs," +
                " they prevent them from happening in the first place. - Anonymous";

        System.out.println("Here I'm checking if my String ends with 'Codewiser': " + quote.endsWith("Codewise"));

        System.out.println(quote.indexOf("they"));
        System.out.println(quote.indexOf("."));
        System.out.println("Here is my substring " + quote.substring(42, 94));

        System.out.println("Here is replaced substring " + quote.replace("testers", "Uber Driver"));

        System.out.println(quote.indexOf("Ano"));
        System.out.println("Here is retried substring from String " + quote.substring(97));

        System.out.println(quote.length());
        System.out.println("Here is the index of the last character in String " + quote.indexOf("s", 100));

        System.out.println("Here I'm checking if my String starts with 'Auto' " + quote.startsWith("Auto"));

        System.out.println(quote.indexOf("bugs"));
        System.out.println("Here is index of 's' in 'bugs': " + quote.indexOf("s", 36));

        System.out.println("Here is String with removed whitespace " + quote.trim().replace(' ', '1'));

        System.out.println("Here is String converted to uppercase " + quote.toUpperCase());



    }
}

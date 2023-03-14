package practice;

public class StringManipulationAssignment {
    public static void main(String[] args) {

        String str = "This is a random string for testing purposes";

        System.out.println("This is the length of the string: " + str.length());

        System.out.println("This is the second character of string: " + str.charAt(1));

        System.out.println("This is the last character of string: " + str.charAt(43));

        System.out.println("This string with replaced 'o': " + str.replace('o', 'i'));

        System.out.println("This is string with removed spaces: " + str.replace(" ", ""));

        System.out.println(str.indexOf("r"));
        System.out.println(str.indexOf(" string"));
        System.out.println("Here is substring removed from string: " + str.substring(10,16));

        str = str.substring(10, 16).toUpperCase();
        System.out.println("Here is reversed: " + str.charAt(16) + str.charAt(15) + str.charAt(14) + str.charAt(13)
                + str.charAt(12) + str.charAt(11) + str.charAt(10));
    }

 }

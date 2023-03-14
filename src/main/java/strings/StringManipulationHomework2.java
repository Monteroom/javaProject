package strings;

public class StringManipulationHomework2 {
    public static void main(String[] args) {

        String a = "Hello world";
        int index =a.indexOf("world");
        System.out.println("Index of 'world' in 'Hello world' is " + index);

        a = "Hello";
        System.out.println("Here is the first letter of 'Hello': " + a.charAt(0));

        a = "HELLO";
        System.out.println("Here is 'HELLO' in lowercase: " + a.toLowerCase());

        a = "hello";
        System.out.println("Here is 'hello' in uppercase: " + a.toUpperCase());

        String a1 = "hello";
        String a2 = "Hello";
        System.out.println(a1.equals(a2));

        a = "the quick brown fox";
        String b = "" + a.toUpperCase().charAt(0) + a.substring(1,4) + a.toUpperCase().charAt(4) + a.substring(5, 10) +
                a.toUpperCase().charAt(10) + a.substring(11, 16) + a.toUpperCase().charAt(16) + a.substring(17);
        System.out.println(b);


        a = "Hello";
        a1 = new StringBuilder(a).reverse().toString();
        System.out.println(a1);
        System.out.println("" + a.charAt(4) + a.charAt(3) + a.charAt(2) + a.charAt(1) + a.charAt(0));

        a = "Hello World";
        char vowel1 = a.charAt(1);
        char vowel2 = a.charAt(4);
        char vowel3 = a.charAt(7);
        System.out.println("Here are all vowels in 'Hello World': " + vowel1 + vowel2 + vowel3);


        a1 = "Hello";
        a2 = "World";
        String space = " ";
        System.out.println(a1.concat(space).concat(a2));

        a1 = "hello";
        a2 = "HELLO";
        System.out.println(a1.equalsIgnoreCase(a2));

        a = "Hello World";
        System.out.println("The length of 'Hello World' is " + a.length());

        a = "Hello";
        System.out.println("The third character in 'Hello' is " + a.charAt(2));

        a = "Hello World";
        index = a.indexOf('l');
        System.out.println("The first occurrence of letter 'l' is " + index);

        a1 = "hello";
        a2 = "hello";
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));

        a1 = "HELLO";
        a2 = "hello";
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));

        a = "HELLO WORLD";
        System.out.println("Here is 'HELLO WORLD' in lowercase: " + a.toLowerCase());

        a = "hello world";
        System.out.println("Here is 'hello world' in uppercase: " + a.toUpperCase());

        a = "Hello World";
        System.out.println("Here is replaced 'l' with 'r' in 'Hello World': " + a.replace('l', 'r'));

        a = "the quick brown fox";
        b = "" + a.toUpperCase().charAt(0) + a.substring(1,4) + a.toUpperCase().charAt(4) + a.substring(5, 10) +
                a.toUpperCase().charAt(10) + a.substring(11, 16) + a.toUpperCase().charAt(16) + a.substring(17);
        System.out.println(b);













    }
}

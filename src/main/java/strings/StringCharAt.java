package strings;

public class StringCharAt {
    public static void main(String[] args) {
        String welcomeSign = "Hello everyone! Welcome to Chicago";
        char c = welcomeSign.charAt(14); // Index means position of char in String, and it starts with 0
        System.out.println(c);

        char cc = welcomeSign.charAt(2);
        System.out.println(cc);

        /*
        print the last letter using charAt and length methods
         */

        System.out.println(welcomeSign.charAt(-2));







    }
}

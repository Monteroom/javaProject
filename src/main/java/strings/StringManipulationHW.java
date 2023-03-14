package strings;

public class StringManipulationHW {
    public static void main(String[] args) {
        //1
        String str1 = "Hello, Universe!";
        char ch = 'o';
        System.out.println("The answer for does the 'str1' have 'o' is " + str1.contains("o"));

        //2
        String str2 = "Hello, World!";
        int start = 7;
        int end = 12;
        System.out.println("The substring from 'str2' is " + str2.substring(7));

        //3
        String str3 = "Good morning World";
        int a = str3.indexOf("W");
        System.out.println(a);
        System.out.println("Here is extracted 'W': " + str3.charAt(13));

        //4
        String str4 = "          I love coding       ";
        System.out.println("Here is trimmed 'str4': " + str4.trim());

        //5
        String str5 = "Learn as if you will live forever, live like you will die tomorrow";
        System.out.println("Here is 'str5' with removed 'o': " + str5.replace('o', ' '));


    }
}

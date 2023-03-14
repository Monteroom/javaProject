package strings;

import java.sql.SQLOutput;

public class PracticeSubstring {
    public static void main(String[] args) {
        String first_name = "Jacob";
        String last_name = "Coffee";

        String name1 = first_name.substring(0, 1) + last_name.substring(4);
        System.out.println(name1);

        String name2 = last_name.substring(0, 1) + last_name.substring(4);
        System.out.println(name2);

        String name3 = first_name.substring(0, 3) + last_name.substring(4);
        System.out.println(name3);

        String name4 = last_name.substring(0, 1) + first_name.substring(3);
        System.out.println(name4);

        String f = "" + last_name.toUpperCase().charAt(2);
        String name5 = f + last_name.substring(4) + first_name.substring(2, 4);
        System.out.println(name5);


        String name6 = "" + last_name.toUpperCase().charAt(1) + last_name.charAt(2) +
                first_name.toLowerCase().charAt(0) + first_name.charAt(1);
        System.out.println(name6);

        /*

         */


    }
}

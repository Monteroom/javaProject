package ifElse;

public class IntroToIfElse {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("I will compare a and b below");

        if (a > b){                                         // true gonna print a is less than b
            System.out.println("a is less than b");
        }
        else {
            System.out.println("a is less than b");
        }
        System.out.println("I've already compared a and b");


        int number1 = 100;
        int number2 = 50;
        if(number1 / number2 == 2){
            System.out.println("YES, two!");
        }
        else {
            System.out.println("Not two!");
        }

        String elon = "Tesla SpaceX Paypal Twitter";
        if (elon.contains("Paypal")) {
            System.out.println("Elon owned Paypal");
        }
        else {
            System.out.println("Elon did not own Paypal");
        }

        //=====================

        if (2345 >= 2345) {
            System.out.println("Yes, it's True");
        }
        else {
            System.out.println("No, it's false");
        }

        if (2222 != 2222) {
            System.out.println("Yes, it's True");
        }
        else {
            System.out.println("No, it's false");
        }

        String str1 = "Automation testers do not just find bugs," +
                            " they prevent them from happening in the first place. - Anonymous";
        if (str1.contains("Anonymous")) {
            System.out.println("Anonymous");
        }
        else {
            System.out.println("Mamamia");
        }
        if (str1.length() >= 100) {
            System.out.println("'str1' has more than 100 characters");
        }
        else {
            System.out.println("'str1' has less than 100 characters");
        }
        if (str1.toLowerCase().equals(str1)) {
            System.out.println("'str1' is the same as lowercase 'str1'");
        }
        else {
            System.out.println("'str1' not the same as lowercase 'str1'");
        }
    }
}

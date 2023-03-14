package switchStatement;

public class IntroToSwitch {
    public static void main(String[] args) {

        int number = 2;

        switch (number) {                                   // int must be equal to numbers in case
            case 1:                                         // String must be equal to string in case
                System.out.println("one");                  // with break execute only one statement
                break;                                      // without break execute every case after finding true one
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
        //=================================================

        String digits = "six" ;
            switch (digits) {
                case "one":
                    System.out.println(1);
                    break;
                case "two":
                    System.out.println(2);
                    break;
                case "three":
                    System.out.println(3);
                    break;
                case "four":
                    System.out.println(4);
                    break;
                case "five":
                    System.out.println(5);
                    break;
                default:
                    System.out.println("Invalid data");
        }
        if (digits.equalsIgnoreCase("one")) {
            System.out.println(1);
        }
            else if (digits.equalsIgnoreCase("two")) {
                System.out.println(2);
        }
            else if (digits.equalsIgnoreCase("three")) {
            System.out.println(3);
        }
            else if (digits.equalsIgnoreCase("four")) {
            System.out.println(4);
        }
            else if (digits.equalsIgnoreCase("five")) {
            System.out.println(5);
        }
            else {
            System.out.println("Invalid number");
        }
    }
}

package ifElse;

public class IfElseIf {
    public static void main(String[] args) {

        if (2 < 5) {                                    // java prints first true condition
            System.out.println("2 is less than 5");
        }
        else if (2 > 5) {                               // can put as many ELSE IF as I want
            System.out.println("2 is more than 5");
        }                                               // {} called block of code
        else {
            System.out.println("2 is equal to 5");
        }
        String actualPassword = "abc123";
        String enteredPassword = "Abc123";
        if (actualPassword.equals(enteredPassword)) {
            System.out.println("Successfully logged in");
        }
        else {
            System.out.println("You entered a wrong password");
        }
    }
}

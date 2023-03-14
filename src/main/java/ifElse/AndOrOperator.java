package ifElse;

public class AndOrOperator {
    public static void main(String[] args) {

        if (2 < 3) {
            System.out.println("hello");
        }
        if (5 < 10) {
            System.out.println("hello");
        }
        //=======
        if (2 < 3 && 5 < 10) {
            System.out.println("bye bye");

        }
        //=====================

        String username = "sunshine123";
        String password = "moonlight456!true";
        String email = "sunshine123@gmail.com";

        String username1 = "sunshine123";
        String password2 = "moonlight456!true";
        String email1 = "sunshine123@gmail.com";

        if (username1.equals(username) && password2.equals(password) && email1.equals(email)) {
            System.out.println("Logged in");
        }
        if (username1.equals(username) && !password2.equals(password)) {
            System.out.println("Incorrect password, try again");
        }
        if (!username1.equals(username) & password2.equals(password)) {
            System.out.println("Username does not exist");
        }
        if (!username1.equals(username) && email1.equals(email) && password2.equals(password)) {
            System.out.println("Recover username");
        }
        if (username1.equals(username) && email1.equals(email) && !password2.equals(password)) {
            System.out.println("Recover password");
        }
        if (username1.equals(username) && !email1.equals(email) && password2.equals(password)) {
            System.out.println("Recover email");
        }

        int int1 = 234;
        int int2 = 235;
        if (int1 % 2 == 0 && int2 % 2 == 0) {
            System.out.println("Both numbers are even");
        } else if (int1 % 2 != 0 && int2 % 2 != 0) {
            System.out.println("Both numbers are odd");
        } else if (int1 % 2 != 0 && int2 % 2 == 0 || int1 % 2 == 0 && int2 % 2 != 0) {
            System.out.println("One number is Even, one number is Odd");
        } else {
            System.out.println("Fucked up");
        }
        int1 = 20;
        int2 = 500;
        int int3 = 1000;

        if (int1 % int2 == 0 && int1 % int3 == 0) {
            System.out.println(int1);
        } else if (int2 % int1 == 0 && int2 % int3 == 0) {
            System.out.println(int2);
        } else if (int3 % int1 == 0 && int3 % int2 == 0) {
            System.out.println(int3);
        } else {
            System.out.println("There is no such number that can be divided by other two numbers");
        }

        int1 = 10;
        int2 = 5;
        int3 = 0;

        if (int1 != 0 & int2 != 0 & int3 != 0) {
        }
        else if (int1 + int2 <= int3 || int1 + int3 <= int2 || int2 + int3 <= int1) {
            System.out.println("Invalid triangle");
        }
        else if (int1 == int2 && int1 == int3 && int2 == int3) {
            System.out.println("The triangle is equilateral");
        }
        else if (int1 == int2 & int1 != int3 || int1 == int3 & int1 != int2 || int2 == int3 & int2 != int1) {
            System.out.println("The triangle is isosceles");
        }
        else {
            System.out.println("The triangle is scalene");
        }

        int age = 40;
        char gender = 'M';

        if (gender == 'M' && age >=65) {
            System.out.println("They are eligible for retirement");
        }
        else if (gender == 'F' && age >=60) {
            System.out.println("They are eligible for retirement");
        }
        else {
            System.out.println("They are not eligible for retirement");
        }
    }
}
package scannerClass;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("Enter your grade");
        int grade = user.nextInt();

        if (grade >= 0 && grade <= 20) {
            System.out.println("Bad, study everything again");
        } else if (grade > 20 && grade <= 40) {
            System.out.println("ok, study more");
        } else if (grade > 40 && grade <= 60) {
            System.out.println("good, keep up");
        } else if (grade > 60 && grade <= 80) {
            System.out.println("very good, keep up");
        } else if (grade > 80 && grade <= 95) {
            System.out.println("perfect, good job");
        } else if (grade > 95 && grade <= 100) {
            System.out.println("exceptional, proud of you");
        } else {
            System.out.println("invalid grade");
        }
    }
}
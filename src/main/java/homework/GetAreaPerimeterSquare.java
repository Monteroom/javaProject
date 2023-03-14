package homework;

import java.util.Scanner;

public class GetAreaPerimeterSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a width of square");
        int width = sc.nextInt();

        System.out.println("What do you want: perimeter, area or both");
        String str = sc.next().toLowerCase();
        int per = 4 * width;
        int area = width * width;
        switch (str) {
            case "perimeter":
                System.out.println("The perimeter of a square is: " + per);
                break;
            case "area":
                System.out.println("The area of a square is: " + area);
                break;
            case "both":
                System.out.println("The perimeter is: " + per + "   " + "The area is: " + area);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}

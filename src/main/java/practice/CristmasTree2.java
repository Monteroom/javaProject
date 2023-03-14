package practice;

public class CristmasTree2 {
    public static void main(String[] args) {

        int height = 5;

        for(int a = 1; a <= height; a++) {
            for(int b = 1; b <= height - a; b++){
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * a - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = 1; a <= height -2; a++) {
            System.out.print(" ");
        }
        System.out.println("***");
    }
}

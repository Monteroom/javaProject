package ifElse;

public class PracticeOrOperator {
    public static void main(String[] args) {

        /*
        true || true ==> true
        true || false ==> true
        false || true ==> true
        false || false ==> false
        OR operator is used with booleans, and produces true in case if at least one true is found
         */

        String menu = "pizza lagman tea bread cake coffee water";

        if (menu.contains("pizza") && menu.contains("soda")) {
            System.out.println("Order pizza and soda");
        }
        if (menu.contains("tea") && menu.contains("cake")) {
            System.out.println("Order dessert");
        }
        if (menu.contains("lagman") && menu.contains("tea")) {
            System.out.println("Order lagman and tea, asian is here");
        }
        if (menu.contains("coffee") || menu.contains("smoothie")) {
            System.out.println("breakfast time");
        }
        if (menu.contains("pizza") || menu.contains("pasta")) {
            System.out.println("italian day");
        }
        if (menu.contains("tea") && menu.contains("coffee") && menu.contains("water") && menu.contains("soda")) {
            System.out.println("Order only drink");
        }
        if (menu.contains("lagman") && !menu.contains("plov")) {
            System.out.println("Not uzbek restaurant");
        }
    }
}

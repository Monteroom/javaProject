package ifElse;

public class IfIf {
    public static void main(String[] args) {

        String weather = "warm and rainy";
        if (weather.equals("cold")) {
            System.out.println("cold, stay home");
        }
        else if (weather.equals("hot")) {
            System.out.println("hot, stay home!");
        }
        else if (weather.equals("warm")) {
            System.out.println("warm, go out");
        }
        else if (weather.equals("rainy")) {
            System.out.println("rainy, stay home");
        }
        else {
            System.out.println("party hard");
        }
        if (weather.contains("cold")) {
            System.out.println("cold, stay home");
        }
        else if (weather.contains("hot")) {
            System.out.println("hot, stay home!");
        }
        else if (weather.contains("warm")) {
            System.out.println("warm, go out");
        }
        else if (weather.contains("rainy")) {
            System.out.println("rainy, stay home");
        }
        else {
            System.out.println("party hard");
        }

        System.out.println("IF IF IF IF IF IF");
        if (1 < 2) {
            System.out.println("one is less than two");
        }
        if (1 < 3) {
            System.out.println("one is less than 3");
        }
        if (1 < 4) {
            System.out.println("one is less than 4");
        }
        if (1 < 5) {
            System.out.println("one is less than 5");
        }
    }
}

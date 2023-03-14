package homework;

public class SwitchHomework {
    public static void main(String[] args) {

        char a = '1';
        switch (a) {
            case '!':
                System.out.println("Exclamation mark");
                break;
            case '?':
                System.out.println("Question mark");
                break;
            case '%':
                System.out.println("Modulus");
                break;
            case '#':
                System.out.println("Hash");
                break;
            case '*':
                System.out.println("Star");
                break;
            case '@':
                System.out.println("At");
                break;
            case '$':
                System.out.println("Dollar sign");
                break;
            default:
                System.out.println("Invalid sign");
                break;
        }
    }
}

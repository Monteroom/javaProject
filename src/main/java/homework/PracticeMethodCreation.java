package homework;

public class PracticeMethodCreation {

    public static int task1(int a, int b) {
        return a * b;
    }

    public String task2(String str) {
        return str.toLowerCase();
    }

    public double task3(int a, int b) {
        return a / b;
    }

    static boolean task4(String str) {
        String reverse = "";
        for (int a = str.length() - 1; a >= 0; a--) {
            reverse += str.charAt(a);
        }
        if (!str.equals(reverse)) {
            return false;
        }
        return true;
    }

    double task5(double num) {
        return num * 100;
    }

    static boolean task6(char a) {
        if (a == 'a' || a == 'e' || a == 'o' || a == 'u' || a == 'y') {
            return false;
        }
        return true;
    }
    public boolean task7 (int a, int b) {
        if (a - b == 5 || a - b == -5 || b - a == 5 || b - a == -5) {
            return true;
        }
        return false;
    }
    boolean task8 (String str) {
        if (str.contains("@") && str.contains(".")) {
            return true;
        }
        return false;
    }
    public boolean task9 (int a) {
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    static boolean task10 (int a, int b) {
        if (a % 2 == 0 && b % 2 == 0 || a % 2 == 1 && b % 2 == 1) {
            return true;
        }
        return false;
    }
}
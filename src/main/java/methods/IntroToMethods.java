package methods;

public class IntroToMethods {

    static void voidMethod() {                        // void - does not return anything
        System.out.println("Inside void method");                                // inside void method you can write any logic, anything

    }
    static int sum(int a, int b) {
       return a + b;                                    // return must be the last code inside curly brackets
    }

    public static void main(String[] args) {
        voidMethod();
        int result = sum(10, 5);
        System.out.println(result);
    }

    double getPI() {
        return 3.14;
    }

    char getLetter() {
        return 'a';
    }

    int getPerimeterOfTriangle(int a, int b, int c){            // - a, b, c - parameters
        return a + b + c;
    }
    int getLengthOfString(String str) {
        return str.length();
    }
}

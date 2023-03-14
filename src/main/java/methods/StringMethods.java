package methods;

public class StringMethods {

    static boolean compareStrings(String str2, String str1) {
        if (str1.equals(str2)) {
            return true;
        }
        return false;
    }
    static String concatenatedString(String str3, String str4){
        return (str3 + str4).toUpperCase();
    }
    static int lengthOfString(String s1, String s2){
        String str = s1 + s2;
        return str.length();
    }
   public static boolean isEvenOrFalse (int a) {
       return a % 2 == 0;
   }

    public static boolean isDivisible(int a) {
        return a % 10 == 0;
    }
    static void multitable (int a) {
        for (int b = 1; b <= 10; b++) {
            System.out.println(a + " * " + b + " = " + (a * b));
        }


        }
        public static int largestNum(int a, int b) {
        if (a > b) {
            System.out.println(a);
            return a;
        }
            System.out.println(b);
        return b;
        }
        public static int average (int a, int b, int c, int d) {
        return (a + b + c + d) / 4;
        }

        public static  int sumOfAll (int a) {
        int sum = 0;
        for (int b = 1; b <= a; b++) {
            sum = sum + b;
        }
        return sum;
        }








    public static void main(String[] args) {
        boolean isSame = compareStrings("hello", "hello");
        System.out.println(isSame);
        String conc = concatenatedString("hello", "hello");
            System.out.println(conc);
            multitable(5);
        System.out.println(sumOfAll(5));
        }
    }


package loop;

public class Continue {
    public static void main(String[] args) {

        for (int a = 1; a <= 10; a++) {
            if(a == 5) {
                continue;
            }
            System.out.println(a);
        }

        for (int a = 1; a <= 100; a++) {
            if (a % 2 == 0) {
                continue;
            }
            System.out.println(a);
        }

        for (int a = 1; a <= 100; a++) {
            if (a % 3 == 0) {
                continue;
            }
            System.out.println(a);
        }


    }
}

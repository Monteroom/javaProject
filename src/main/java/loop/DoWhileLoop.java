package loop;

public class DoWhileLoop {
    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println(i);
            i++;
        }
        while (i <= 10);

        int a = 1;
        do {
            if (a % 2 != 0) {
                System.out.println(a);

            }
            a++;
        }
        while (a <= 100);
    }
}

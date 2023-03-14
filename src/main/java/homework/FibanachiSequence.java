package homework;

public class FibanachiSequence {
    public static void main(String[] args) {

        int limit = 10;
        int prev = 0;
        int curr = 1;

        System.out.print(prev + " ");
        System.out.print(curr + " ");

        for (int i = 2; i < limit; i++) {
            int next = prev + curr;
           System.out.print(next + " ");
            prev = curr;
            curr = next;
        }
    }
}

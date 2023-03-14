package practice;

public class SumOfAllDIgits {
    public static void main(String[] args) {


        int sum = 0;

        for (int i = 12345; i > 0; i /= 10) {
            sum += i % 10;
        }
        System.out.println(sum);
    }
}

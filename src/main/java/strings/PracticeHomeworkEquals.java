package strings;

public class PracticeHomeworkEquals {
    public static void main(String[] args) {

        String hello1 = "Hello World!";
        String hello2 = "Hello world!";
        String hello3 = new String("HelloWorld!");

        System.out.println(hello1.equalsIgnoreCase(hello2));

        System.out.println(hello1 == hello3);

        System.out.println(hello1 == hello2);

        hello1 = hello1.toLowerCase();
        hello2 = hello2.toLowerCase();
        System.out.println(hello1.equals(hello2));

        hello1 = hello1.toUpperCase();
        hello3 = hello3.toUpperCase();
        System.out.println(hello1.equals(hello3));
    }
}

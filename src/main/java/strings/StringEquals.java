package strings;

public class StringEquals {
    public static void main(String[] args) {
        String country1 = "USA";
        String country2 = "USA";
        String country3 = new String("USA");

        System.out.println(country1 == country2); // object are the same >>true
        System.out.println(country1 == country3); // same value different object >> false
        System.out.println(country1.equals(country2));
        System.out.println(country1.equals(country3)); // check just the value >> true

        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 == s2 is:" + s1 == s2);

        String s = "Java"+1+2+"Quiz"+""+(3+4);
        System.out.println(s);

        String b1 = new String("java");
        String b2 = new String("JAVA");
        b2 = b2.toLowerCase();
        System.out.println(b1 = b2);

    }
}

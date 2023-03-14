package strings;

public class PracticeString {
    public static void main(String[] args) {
        String singerName = "Michael Jackson";
        System.out.println(singerName.length()); // returns numbers of chars
        System.out.println(singerName.endsWith("on")); // returns in boolean the end of String // true
        System.out.println(singerName.startsWith("Misha")); // returns in boolean the beginning of String //false
        System.out.println(!singerName.isEmpty()); // checks if the Strings are empty or not // can use !
        System.out.println(singerName.toLowerCase()); // changing to lowercase
        System.out.println(singerName.toUpperCase());; // changing to uppercase
        System.out.println(singerName);
        System.out.println(singerName.charAt(0));
        System.out.println("" + singerName.charAt(0) + singerName.charAt(3));  // Mh
        System.out.println(singerName.indexOf("c"));
        System.out.println(singerName.indexOf("c", 3));
        System.out.println(singerName.indexOf("m")); // -1

        String singerName2 = "Justin Bieber";
        boolean areTheySame = singerName2.equals(singerName); // false
        System.out.println(areTheySame);
        System.out.println(!singerName.equals(singerName2)); // false
        singerName = singerName2;
        System.out.println(singerName.equals(singerName2)); // true

    }
}

package strings;

public class StringIndexOf {
    public static void main(String[] args) {
        String ad = "Buy two, get one for free!";
        int index = ad.indexOf('g'); //9
        System.out.println(index);
        index = ad.indexOf('t');
        System.out.println(index);

        index = ad.indexOf('o', 7);
        System.out.println(index);
        index = ad.indexOf('o', 10);
        System.out.println(index);






    }
}

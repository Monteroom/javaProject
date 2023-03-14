package strings;

public class StringSubstring {
    public static void main(String[] args) {

        String message = "Hello Chicago, why are you cold and windy?";

        String city = message.substring(6, 13);
        System.out.println(city);
        String question = message.substring(15);
        System.out.println(question);

        String welcomeSign = "Welcome to USA, our population is 140 million people, " +
                "the average salary is 90k dollars, and our president is Joe Biden";

        int a = welcomeSign.indexOf("U");
        System.out.println(a);
        String country = welcomeSign.substring(11, 14);
        System.out.println("Country is " + country);

        a = welcomeSign.indexOf("1");
        System.out.println(a);
        a = welcomeSign.indexOf("n", 35);
        System.out.println(a);
        String population = welcomeSign.substring(34, 45);
        System.out.println("The population is " + population);

        a = welcomeSign.indexOf("9");
        System.out.println(a);
        a = welcomeSign.indexOf("s", 87);
        System.out.println(a);
        String salary = welcomeSign.substring(76, 87);
        System.out.println("This is our average salary: " + salary);

        a = welcomeSign.indexOf("J");
        System.out.println(a);
        String president = welcomeSign.substring(110);
        System.out.println("Our president is " + president);

        String phrase = "Just one positive thought in the morning can change your whole day";

        String thought = phrase.substring(0, 5);
        System.out.println(thought);
        int a1 = phrase.indexOf("tho");
        System.out.println(a1);
        String thought1 = phrase.substring(18, 25);
        System.out.println(thought + "a " + thought1);

        String positive = phrase.substring(9, 17);
        String morning = phrase.substring(33, 40);
        System.out.println(positive + " " + morning);

        int beginIndex = phrase.indexOf("p");
        int endIndex = phrase.indexOf(" th");
        System.out.println(phrase.substring(beginIndex, endIndex));

        String whole = phrase.substring(57, 62);
        System.out.println(whole + " " + morning);

        String change = phrase.substring(45, 51);
        String one = phrase.substring(5, 9);
        String day = phrase.substring(63, 66);
        System.out.println(change + " " + one + " " + day);

        String your = phrase.substring(52, 56);
        System.out.println(change + " " + your + " " + day);

        //=====================

        String str1 = "hi";
        String str2 = "bye";
        System.out.println(str1 + str2 + str2 + str1);

        System.out.println(str1 + " " + str2 + " " + str1.toUpperCase() + " " + str1.toUpperCase() + " "
                + str2.toUpperCase() + " " + str2.toUpperCase() + " " + str2 + " " + str1);

        System.out.println(str2.substring(0, 1) + str1.substring(1));
        System.out.println(str1.replace('h', 'b'));
        System.out.println(str2.charAt(0) + "" + str1.charAt(1));

        String see = "see";
        String hear = "hear";
        System.out.println(hear.replace('h', 's'));
        System.out.println((see.substring(0, 1) + hear.substring(1)));
        System.out.println(see.charAt(0) + hear.substring(1));
        System.out.println(see.charAt(0) + "" + see.charAt(1) + hear.charAt(2) + hear.charAt(3));




    }
}

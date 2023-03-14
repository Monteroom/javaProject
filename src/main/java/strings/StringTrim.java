package strings;

public class StringTrim {
    public static void main(String[] args) {
        /*
        trim() method removes empty spaces from both ends of the String
         */
        String batch = "      Batch 2 is cool";
        batch = batch.trim();
        System.out.println(batch);

        System.out.println(batch.contains("cool")); // check if the String have the character
        System.out.println(batch.contains("lazy"));
        System.out.println(batch.contains("2"));

        String batch1 = "Bena";
        System.out.println(batch.concat(batch1));
    }
}

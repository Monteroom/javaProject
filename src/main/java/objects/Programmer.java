package objects;

public class Programmer {

    int age; //instance int
    String name;
    String gender;

    public static String profession; //null

    public static void staticCode(){
        String lastNAme = "Dsgds";

        System.out.println(profession);

        Programmer pr1 = new Programmer();
        System.out.println(pr1.name);
    }

    public void instanceCode(){
        System.out.println(profession);
        System.out.println(name);
    }



    static {
        System.out.println("hello, this is block of code");
    }








}

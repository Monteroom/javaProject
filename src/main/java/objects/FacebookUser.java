package objects;

public class FacebookUser {

    String username;
    String password;
    String firstName;
    String lastName;

    public void login(String username, String password){
        System.out.println(username + " logged in to the application");
        if (10 == 100){
            System.out.println("warm");
        }
        else if (10 < 100){
            System.out.println("cold");
        }
        else if (10 > 100){
            System.out.println("hot");
        }else{
            System.out.println("humid");
        }

    }



    public static void main(String[] args) {
        FacebookUser user = new FacebookUser();
        user.login("abc", "abc123");
        user.username = "tokyo";
        user.password = "abc123";

        FacebookUser user2 = new FacebookUser();
        user2.username = "bena";
        user2.password = "2023";
        user2.login(user2.username, user2.password);


        Student student1 = new Student();
        student1.name = "Leo";
        student1.phone = "123456789";
        student1.email = "leo@gmail.com";
        student1.age = 18;
        student1.major = "Law";

        /*
        create one more student2
         */
        Student student2 = new Student();
        student2.name = "Potato";
        student2.phone = "235262672";
        student2.email = "potato@gmail.com";
        student2.age = 17;
        student2.major = "Accounting";


        student1.read();
        student2.read();

        student1.attendClass();
        student2.attendClass();

        student1.printInfo();
        student2.printInfo();
    }








}

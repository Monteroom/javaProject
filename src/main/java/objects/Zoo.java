package objects;

public class Zoo {
    public static void main(String[] args) {
        Animal alex = new Animal();
        alex.type = "lion";
        alex.age = 3;
        alex.isCarnivore = true;
        alex.isMammal = true;


        Animal martin = new Animal();
        martin.type = "zebra";
        martin.age = 3;
        martin.isMammal = true;
        martin.isCarnivore = false;

        Animal melman = new Animal();
        melman.type = "giraffe";
        melman.age = martin.age;
        melman.isCarnivore = martin.isCarnivore;
        melman.isMammal = true;

        Animal gloria = new Animal();
        gloria.type = "hippo";
        gloria.age = 2;
        gloria.isMammal = true;
        gloria.isCarnivore = true;


        alex.eat();
        melman.sleep();
        martin.play();
        gloria.eat();



    }
}

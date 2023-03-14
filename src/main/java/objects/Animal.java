package objects;

public class Animal {
    /*
    create variables and methods that belongs to animals

    type
    boolean isMammal
    boolean isCarnivore
    age
    habitat

    eat()
    sleep()
    play()


    Create class Zoo
    in this class create Main method
    create 4 objects from Animal class
    and call methods
     */

    String type;
    boolean isMammal;
    boolean isCarnivore;
    int age;
    static String habitat = "New York Zoo";


    public void eat(){
        System.out.println(type + " is carnovore: " + isCarnivore + " is eating");
    }

    public void sleep(){
        System.out.println(type + " is sleeping in " + habitat);
    }

    public void play(){
        System.out.println(type + " is " + age + " years old and playing in " + habitat);
    }
}

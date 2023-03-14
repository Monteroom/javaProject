package methods;

public class Cat {
    static boolean isCarnivore = true;
    static boolean isMammal = true;
    String type;
    double weight;
    byte age;
    public void eat() {
        System.out.println(type + "is eating");
    }
    public void sleep(int hours) {
        System.out.println(type + " slept for " + hours);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Chicago Zoo! Enter employee ID");

        Cat lion = new Cat();
        Cat tiger = new Cat();
        Cat cheetah = new Cat();
        Cat leopard = new Cat();

        lion.age = 2;
        cheetah.age = 5;
        cheetah.sleep(5);
    }

}

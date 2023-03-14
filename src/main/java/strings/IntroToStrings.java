package strings;

public class IntroToStrings {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName);
        System.out.println((lastName));
        firstName = "Mike";
        lastName = "Gold";
        System.out.println(lastName);
        System.out.println(firstName);

        /*
        String concatenation
        when you take 2 or more Strings and put them together in one
         */
        char space = ' ';
        String myName = "Max";
        System.out.println("My name is" + space + myName);
        String myLastName = "Kovynev";
        System.out.println("My lastname is" + space + myLastName);
        byte age = 27;
        System.out.println("I am" + space + age);
        String address = "128 W King George Ct";
        System.out.println("My address is" + space + address);
        String city = "Palatine";
        System.out.println("City" + space + city);
        int zip = 60067;
        System.out.println("Zipcode" + space + zip);
        long mobile = 4074910742L;
        System.out.println("My phone number is" + space + mobile);
        String friendName = "Igor Isa Seiil";
        System.out.println("My friends are" + space + friendName);

        System.out.println("My name is" + space + myName + space + myLastName);
        System.out.println("I am"+ space + age);
        /*
        Declare variable
        String name = "value";
        String name = new String("value")
        String is immutable (
         */

        System.out.println(city.length()); // the number of symbols that have in variable
        System.out.println(friendName.length());
        System.out.println("The length of Kovynev is " + lastName.length());


        /*
            equals() method compares values of 2 Strings
         */

        String fruit1 = "apple";
        String fruit2 = "apple";
        String fruit3 = "Apple";

        boolean isSame = fruit1.equals(fruit2);
        System.out.println(isSame);

        isSame = fruit1.equals(fruit3); // refered to a container isSame
        System.out.println(isSame);

        fruit1 = "banana";
        fruit2 = "orange";
        System.out.println("Is banana same as orange" + fruit1.equals(fruit2));  // does not have any reference to a container

        boolean isSame2 = !fruit1.equals(fruit2); // ! - should be at the beginning (means if they are not equal)


        String state1 = "California";
        String state2 = "Illinois";
        String state3 = "Florida";
        String state4 = "ILlinois";
        String state5 = "florida";

        boolean isTrue1 = !state1.equals(state2); // does not ignore CAP letters
        System.out.println(isTrue1);
        boolean isTrue2 = state2.equalsIgnoreCase(state4); // ignore CAP letters
        System.out.println(isTrue2);
        boolean isTrue3 = state3.equals(state5);
        System.out.println(isTrue3);
        boolean isTru4 = state5.equals(state1);
        System.out.println(isTru4);
        boolean isTrue5 = !state4.equals(state3);
        System.out.println(isTrue5);


        ////////////

        int cucumber = 5;
        int tomato = 10;
        int empty;
        empty = cucumber;
        cucumber = tomato;
        tomato = empty;


        System.out.println("cucumber: " + cucumber);
        System.out.println("tomato : " + tomato);


    }
}

package animal;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog(3, "Mr. Slen");
        dog1.age +=1 ;
        dog1.bark();

        Dog dog2 = new Dog();
//        dog2 = new animal.Dog();
        dog2.age = 10;
        dog2.name = "frog";
        dog2.bark();
        dog2.friend = dog1;
        dog1.friend = dog2;
        dog1.friend.age += 1;
        dog1.friend.getOlder();
        System.out.println(dog2.getAge());

        Animal animal = new Dog();

        animal.age = 60;
        animal.name = "SIUUUUU";

        animal = new Cat();

        animal.age = 67;
        animal.name = "goat";

    }
}
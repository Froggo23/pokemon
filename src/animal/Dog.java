package animal;

public class Dog extends Animal implements Food, Friends{

    Dog friend;

    Dog(){

    }

    Dog(int age, String name){
        this.age = age;
        this.name = name;
        System.out.println("created dog!!!");
    }

    void bark(){
        System.out.println("woof woof");
    }

    void introduce(){
        System.out.println("hi my name is " + this.name);
    }

    void eat() {
        System.out.println("ggg");
    }

    public void getFried() {
        System.out.println("babaeerllll");
    }

    public void exploitation() {
        System.out.println("야 우리 친구잖아 ㅋㅋㅋㅋㅋㅋ");
    }
}

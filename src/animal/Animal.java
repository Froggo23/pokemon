package animal;

public abstract class Animal {
    int age;


    String name;

    int getAge() {
        return this.age;
    }

    void getOlder(){
        this.age += 1;
    }

    abstract void eat();
}

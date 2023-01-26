package animal;

import java.util.Random;

public class Cat extends Animal implements Food, Friends{


    String race;

    String[] kinds = {"white", "nigga", "gang"};

    Cat friend;

    Dog enemy;

    Cat(){

    }

    Cat(int age, String name, String race, Dog enemy){
        this.age = age;
        this.name = name;
        this.race = race;
        this.enemy = enemy;
    }

    void changeTeams(){
        Random random = new Random();
        int index = random.nextInt() % 3;
        this.race = this.kinds[index];
    }

    void eat(){
        System.out.println("crunch");
    }


    public void getFried() {
        System.out.println("KALSA");
    }

    public void exploitation() {
        System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋ 씨발 꼽냐?");
    }
}

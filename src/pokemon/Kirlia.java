package pokemon;

public class Kirlia extends Ralts{

    Kirlia(){
        this.hp = 50;
        this.cry();
    }

    @Override
    public void cry() {
        System.out.println("Kirl~~~~~");
    }

    @Override
    void attack3(Pokemon opponent) {
        psychic(opponent);
    }


    public void psychic(Pokemon opponent){
        System.out.println("!$!@O#%$U!@(#$%!");
        opponent.hp -= 30;
    }
}

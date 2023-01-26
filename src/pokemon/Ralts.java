package pokemon;

public class Ralts extends Pokemon{
    Ralts() {
        this.hp = 25;
        this.cry();
    }

    public void cry(){
        System.out.println("Ralts Ralts!");
    }

    @Override
    void attack1(Pokemon op) {
        tackle(op);
    }

    @Override
    void attack2(Pokemon opponent) {
        scratch(opponent);
    }

    @Override
    void attack3(Pokemon opponent) {

    }

    @Override
    void attack4(Pokemon opponent) {

    }

    public void tackle(Pokemon opponent){
        System.out.println("tackle~~");
        opponent.hp -= 15;
    }
    public void scratch(Pokemon opponent){
        System.out.println("scratch!!!!");
        opponent.hp -= 10;
    }

}

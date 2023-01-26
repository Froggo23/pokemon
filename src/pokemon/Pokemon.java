package pokemon;

public abstract class Pokemon {
    int hp;
    abstract void cry();

    abstract void attack1(Pokemon opponent);
    abstract void attack2(Pokemon opponent);
    abstract void attack3(Pokemon opponent);
    abstract void attack4(Pokemon opponent);


}

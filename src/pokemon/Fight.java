package pokemon;

public class Fight {
    public static void main(String[] args) {
        Pokemon home = new Kirlia();
        Pokemon away = new Ralts();

        home.attack3(away);
        away.attack2(home);
        home.attack2(away);
        away.attack4(home);

    }
}

package additional.objects.game;

public class Main {
    public static void main(String[] args) {

        Group fightingClub = new Group();
        IEnemy goblin = new Goblin();

        System.out.println(fightingClub.battle(goblin));
    }
}

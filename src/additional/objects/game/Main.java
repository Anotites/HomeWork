package additional.objects.game;

public class Main {
    public static void main(String[] args) {

        Group fightingClub = new Group();
        IEnemy goblin = new Goblin();
        IEnemy wolf = new Wolf();

        System.out.println(fightingClub.battle(goblin));
        System.out.println(fightingClub.battle(wolf));

    }
}

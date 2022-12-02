package home_work_4.additional.objects;

import additional.objects.game.Goblin;
import additional.objects.game.Group;
import additional.objects.game.IEnemy;
import additional.objects.game.Wolf;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GroupTest {
    Group group = new Group();
    IEnemy goblin = new Goblin();
    IEnemy wolf = new Wolf();

    @Test
    public void battleWithGoblin() {
        Assertions.assertEquals("The enemy is defeated.", group.battle(goblin));
    }

    @Test
    public void battleWithWolf() {
        Assertions.assertEquals("YOU DIED. The enemy has won.", group.battle(wolf));
    }
}

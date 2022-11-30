package additional.objects.game;

public class Goblin implements IEnemy {

    private int enemyDefense = 5;
    private int enemyLife = 2;
    private int enemyDamage = 4;

    @Override
    public int getEnemyDefense() {
        return enemyDefense;
    }

    @Override
    public void setEnemyDefense(int enemyDefense) {
        this.enemyDefense = enemyDefense;
    }

    public int getEnemyLife() {
        return enemyLife;
    }

    public void setEnemyLife(int enemyLife) {
        this.enemyLife = enemyLife;
    }

    public int getEnemyDamage() {
        return enemyDamage;
    }

    public void setEnemyDamage(int enemyDamage) {
        this.enemyDamage = enemyDamage;
    }
}


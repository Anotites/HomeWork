package additional.objects.game;

public class Wolf implements IEnemy {

    private int enemyDefense = 17;
    private int enemyLife = 1;
    private int enemyDamage = 1;

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

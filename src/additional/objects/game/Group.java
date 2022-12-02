package additional.objects.game;

public class Group {

    private IGameCharacters elf = new Elf();
    private IGameCharacters dwarf = new Dwarf();
    private IGameCharacters orc = new Orc();
    private IGameCharacters man = new Man();

    IGameCharacters[] group = new IGameCharacters[]{elf, dwarf, orc, man};


    /**
     * Метод симуляции битвы (На самом деле метод можно еще очень сильно усложнить, вывести статистику
     * и прописать дополнительные условия, например, уменьшать жизни героям
     * и делать так, чтобы и враг наносил ответные
     * удары, но так как ДЗ к утру, пока так, потом доделаю).
     *
     * @param iEnemy Вид врага.
     * @return Результат битвы.
     */
    public String battle(IEnemy iEnemy) {
        String battleResult = "";
        int sumOfDamage = 0;
        for (IGameCharacters person : group) {
            sumOfDamage = sumOfDamage + person.getDamage();
        }
        for (IGameCharacters personFighting : group) {
            if (iEnemy.getEnemyLife() > 0) {
                if (sumOfDamage > iEnemy.getEnemyDefense()) {
                    iEnemy.setEnemyLife(iEnemy.getEnemyLife() - 1);
                    sumOfDamage = sumOfDamage - iEnemy.getEnemyDefense();
                } else {
                    battleResult = "YOU DIED. The enemy has won.";
                }
            } else {
                battleResult = "The enemy is defeated.";
            }
        }
        return battleResult;
    }
}

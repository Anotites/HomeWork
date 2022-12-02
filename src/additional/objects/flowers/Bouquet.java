package additional.objects.flowers;

public class Bouquet {

    private IFlowers tulip = new Tulip();
    private IFlowers chrysanthemum = new Chrysanthemum();
    private IFlowers rose = new Rose();

    IFlowers[] bouquet = new IFlowers[]{tulip, chrysanthemum, rose};

    /**
     * Метод, определяющий по сроку годности и сроку среза цветов завяли ли они.
     *
     * @return Вывод, если ли завядшие цветы.
     */
    public String spoiled() {
        String spoiled = "not spoiled";

        for (IFlowers flower : bouquet) {
            if (flower.getBestBeforeDate() < flower.getDate()) {
                spoiled = "spoiled";
            }
        }
        return spoiled;
    }
}

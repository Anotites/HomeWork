package additional.objects.flowers;

public class Tulip implements IFlowers {

    final int bestBeforeDate = 4;
    private int date = 1;

    @Override
    public int getBestBeforeDate() {
        return bestBeforeDate;
    }

    @Override
    public int getDate() {
        return date;
    }

    @Override
    public int setDate(int date) {
        return this.date = date;
    }
}

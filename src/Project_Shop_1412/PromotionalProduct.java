package Project_Shop_1412;

public class PromotionalProduct extends CommonProduct {
    public String name;
    public double priceWithoutDiscount;
    public int percentDiscount;

    public PromotionalProduct(String name, double priceWithoutDiscount, int percentDiscount) {
        super(name, priceWithoutDiscount * (100 - percentDiscount) / 100);
        this.name = name;
        this.priceWithoutDiscount = priceWithoutDiscount;
        this.percentDiscount = percentDiscount;
    }

    @Override
    public String toString() {
        return super.toString() + ", скидка - " + percentDiscount + "%";
    }
}

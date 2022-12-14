package Project_Shop_1412;

public class DiscountedProduct extends PromotionalProduct {
    public String name;
    public double priceWithoutDiscount;
    public int percentDiscount;
    private String descriptionOfTheReasonForTheDiscount;

    public DiscountedProduct(String name, double priceWithoutDiscount, int percentDiscount, String descriptionOfTheReasonForTheDiscount) {
        super(name, priceWithoutDiscount, percentDiscount);
        this.name = name;
        this.priceWithoutDiscount = priceWithoutDiscount;
        this.percentDiscount = percentDiscount;
        this.descriptionOfTheReasonForTheDiscount = descriptionOfTheReasonForTheDiscount;
    }

    @Override
    public String toString() {
        return super.toString() + ", уценка - " + descriptionOfTheReasonForTheDiscount;
    }
}

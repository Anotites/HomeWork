package additional.project_Shop_1412;

public class Invoice {
    String shoppingCart;
    double sum;

    public Invoice(String shoppingCart, double sum) {
        this.shoppingCart = shoppingCart;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return shoppingCart + "\n" + "Итого надо заплатить: " + sum;
    }

}

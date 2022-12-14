package additional.project_Shop_1412;

public class CommonProduct extends Product {
    public CommonProduct(String name, double price) {
        super.name = name;
        super.price = price;
    }

    @Override
    public String toString() {
        return name + ", цена - " + price;
    }
}

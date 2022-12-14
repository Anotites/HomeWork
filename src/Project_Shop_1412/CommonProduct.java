package task2;

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

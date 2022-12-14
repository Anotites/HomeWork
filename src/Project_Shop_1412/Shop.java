package Project_Shop_1412;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Shop implements Iterable {
    ArrayList<Product> listOfProduct;

    public Shop(ArrayList<Product> listOfProduct) {
        this.listOfProduct = listOfProduct;
    }

    public void addProduct(Product product) {
        this.listOfProduct.add(product);
    }

    public ArrayList<Product> returnListOfProduct() {
        return this.listOfProduct;
    }

    public ShoppingCart returnShoppingCart() {
        return new ShoppingCart(new ArrayList<>());
    }

    public Invoice returnInvoice(ShoppingCart newShoppingCart) {
        double sum = 0;
        for (ProductInShoppingCart i : newShoppingCart.shoppingCart) {
            sum = sum + i.product.price * i.quantity;
        }
        StringBuilder result = new StringBuilder();

        for (ProductInShoppingCart i : newShoppingCart.shoppingCart) {
            result.append(i.product.toString()).append(", Количество - ").append(i.quantity).append(", Сумма - ").append(i.product.price * i.quantity).append("\n");
        }
        return new Invoice(result.toString(), sum);
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }
}
package Project_Shop_1412;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Shop implements Iterable{
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
        return new ShoppingCart(new ArrayList<ProductInShoppingCart>());
    }

    public Invoice returnInvoice(ShoppingCart newShoppingCart) {
        double sum = 0;
        for (ProductInShoppingCart i : newShoppingCart.shoppingCart) {
            sum=sum+i.product.price * i.quantity;
        }
        String result="";

        for (ProductInShoppingCart i : newShoppingCart.shoppingCart) {
            result=result+i.product.toString()+", Количество - "+i.quantity+", Сумма - "+i.product.price * i.quantity+"\n";
        }
        return new Invoice(result, sum);
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
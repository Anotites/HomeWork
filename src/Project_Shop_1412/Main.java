package task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product milk = new CommonProduct("Молоко", 5.0);
        System.out.println(milk);
        Product egg = new PromotionalProduct("Яйцо",6.0,10);
        System.out.println(egg);
        Product bread = new DiscountedProduct("Хлеб",12.0,10,"мятый");
        System.out.println(bread);

        ArrayList<Product> listOfProduct = new  ArrayList<>();
        ArrayList<ProductInShoppingCart> newShoppingCart = new  ArrayList<>();

        Shop shop = new Shop(listOfProduct);
        shop.addProduct(milk);
        shop.addProduct(egg);
        shop.addProduct(bread);

        System.out.println(shop.returnListOfProduct());

        ShoppingCart shoppingCart = new ShoppingCart(newShoppingCart);
        shoppingCart.add(milk,2);
        shoppingCart.add(egg,3);
        shoppingCart.add(bread,4);

        System.out.println(shop.returnInvoice(shoppingCart));

    }
}

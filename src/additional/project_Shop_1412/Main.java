package additional.project_Shop_1412;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product milk = new CommonProduct("Молоко", 2.35);
        System.out.println(milk);
        Product egg = new PromotionalProduct("Яйцо", 8563, 31);
        System.out.println(egg);
        Product bread = new DiscountedProduct("Хлеб", 10, 50, "мятый");
        System.out.println(bread);

        ArrayList<Product> listOfProduct = new ArrayList<>();
        ArrayList<ProductInShoppingCart> newShoppingCart = new ArrayList<>();

        Shop shop = new Shop(listOfProduct);
        shop.addProduct(milk);
        shop.addProduct(egg);
        shop.addProduct(bread);

        System.out.println(shop.returnListOfProduct());

        ShoppingCart shoppingCart = new ShoppingCart(newShoppingCart);
        shoppingCart.add(milk, 4);
        shoppingCart.add(egg, 1);
        shoppingCart.add(bread, 15);

        System.out.println(shop.returnInvoice(shoppingCart));

    }
}

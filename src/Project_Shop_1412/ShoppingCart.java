package Project_Shop_1412;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<ProductInShoppingCart> shoppingCart;

    public ShoppingCart(ArrayList<ProductInShoppingCart> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void add(Product product, int quantity) {
        ProductInShoppingCart productInShoppingCart = new ProductInShoppingCart(product, quantity);
        this.shoppingCart.add(productInShoppingCart);
    }

    public ArrayList<ProductInShoppingCart> getShoppingCart() {
        return this.shoppingCart;
    }

}


package dsa.algos.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart
{
    public static void main(String[] args) {
        List<String> cart=new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        cart.remove("Mouse");//removes the item
        cart.set(1,"Mechanical Keyboard");//update
        System.out.println("Cart items: "+cart);
        System.out.println("Total items: "+cart.size());
    }
}

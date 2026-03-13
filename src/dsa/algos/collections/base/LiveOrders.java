package dsa.algos.collections.base;

import java.util.ArrayList;
import java.util.Collection;

public class LiveOrders
{
    public static void main(String[] args) {
        Collection<String> liveOrders=new ArrayList<>();
        //new orders added
        liveOrders.add("ORD101");
        liveOrders.add("ORD102");
        liveOrders.add("ORD103");
        //check order
        //liveOrders.remove("ORD102");
        System.out.println("Live orders: "+liveOrders);
        liveOrders.clear();
        System.out.println("Orders after closing: "+liveOrders);
        //liveOrders.remove("ORD102");
    }
}


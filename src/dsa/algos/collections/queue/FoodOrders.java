package dsa.algos.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FoodOrders
{
    public static void main(String[] args)
    {
        Queue<String> orders=new LinkedList<>();
        //for adding - add()[fail][Strict],offer()[not fail][Not Strict]
        orders.add("Order101");//Strict capacity based
        orders.offer("Order102");//flexible
        System.out.println("Orders: "+orders);
        //for removal:remove() -> Strict[Fail] poll() Not Strict[Notfail]
        System.out.println("Serving: "+orders.poll());
        System.out.println("Pending order: "+orders);
    }
}

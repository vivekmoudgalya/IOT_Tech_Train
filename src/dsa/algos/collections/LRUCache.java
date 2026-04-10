package dsa.algos.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V>extends LinkedHashMap<K, V>
{
    private final int capacity;
    public LRUCache(int capacity)
    {
        //the 'true' at the end is the magic
        //it tells the map to order items by access time,
        //not intersection time
        super(capacity,0.75f,true);
        this.capacity=capacity;

    }
    //this is a built-in method in LinkedHashMap
    //we override it to tell java exactly when to start
    //kicking old items out
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        //if the size gets bigger than our capacity, return true
        //(kick the oldest out)
        return size()>capacity;
    }
    public static void main(String[] args) {
        //let's build our 3-oair shoe rack
        LRUCache<String,String>shoeRack=new LRUCache<>(3);
        shoeRack.put("Monday","Sneakers");
        shoeRack.put("Tuesday","Boots");
        shoeRack.put("Wednesday","Roots");
        System.out.println("Rack Contents: "+shoeRack);


        shoeRack.get("Monday");
        System.out.println("Racks contents: "+shoeRack);

        shoeRack.put("Thursday","Loafers");
        System.out.println("Rack after adding loafers: "+shoeRack);

    }
}

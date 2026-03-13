package dsa.algos.collections.maps;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo
{
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(106, "abc");
        ht.put(117, "def");
        ht.put(128, "ghi");
        ht.put(100, "jkl");
        ht.put(99, "mno");
        ht.put(101, "pqr");
        for(Map.Entry<Integer,String>entry:ht.entrySet())
        {
            System.out.println(entry.getKey()+", "+entry.getValue());
        }
        System.out.println(ht);
    }
}
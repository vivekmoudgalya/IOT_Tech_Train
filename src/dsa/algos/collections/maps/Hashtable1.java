package dsa.algos.collections.maps;

import java.util.Hashtable;

public class Hashtable1
{
    public static void main(String[] args) {
        Hashtable<Integer,String>ht=new Hashtable<>();
        ht.put(106, "abc");
        ht.put(117, "def");
        ht.put(128, "ghi");
        ht.put(100, "jkl");
        ht.put(99, "mno");
        ht.put(101, "pqr");
        System.out.println(ht.getOrDefault(101,"NotFound"));
        System.out.println(ht.getOrDefault(200,"NotFound"));
        ht.putIfAbsent(104,"stu");
        System.out.println("UpdatedTable: "+ht);//this will be added
        ht.putIfAbsent(99,"vwx");
        System.out.println("Updated Table: "+ht);//this wpnt be added
    }
}

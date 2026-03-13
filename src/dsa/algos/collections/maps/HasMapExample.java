package dsa.algos.collections.maps;

import com.sun.jdi.VoidValue;

import java.util.HashMap;
import java.util.Map;

public class HasMapExample
{
    public static void main(String[] args) {
        //the values can be duplicate,but keys have to be unique
        Map<String,String> hashmap=new HashMap<>();
        hashmap.put("01","aaa");
        hashmap.put("03","bbb");
        hashmap.put("04","xxx");
        hashmap.put("02","zzz");
        for(Map.Entry<String,String>entry:hashmap.entrySet())
        {
            System.out.println(entry.getKey()+ ", "+entry.getValue());
        }
        Map<String,String> hashmap1=new HashMap<>();
        hashmap1.put("01","aaa");
        hashmap1.put("03","bbb");
        hashmap1.put("04","xxx");
        hashmap1.put("02","zzz");
        for(Map.Entry<String,String>entry:hashmap1.entrySet())
        {
            System.out.println(entry.getKey()+ ", "+entry.getValue());
        }
    }
}

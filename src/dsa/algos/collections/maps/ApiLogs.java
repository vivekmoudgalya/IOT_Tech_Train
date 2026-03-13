package dsa.algos.collections.maps;

//maintain the insertion order
import java.util.LinkedHashMap;
import java.util.Map;

public class ApiLogs
{
    public static void main(String[] args) {
        Map<String,String> logs=new LinkedHashMap<>();
        logs.put("2","Signup");
        logs.put("1","Login");
        logs.put("4","Browse Videos");
        logs.put("3","Scroll up or scroll down");
        logs.put("5","Logout");
        System.out.println("API Logs: "+logs);

    }
}

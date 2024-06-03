package map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Ashis",1);
        ht.put("Rajesh",2);
        ht.put("Tapan",3);

        Enumeration<String> keys = ht.keys();

        while(keys.hasMoreElements()){
            String key = keys.nextElement();
            Integer value = ht.get(key);
            System.out.println("Key "+key+" Value "+value);
        }
    }
}

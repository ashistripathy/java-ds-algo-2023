package map;

import java.util.HashMap;

public class MergeHashMap {
    public static void main(String [] args){
        HashMap<Integer,String> firstMap = new HashMap<>();
        firstMap.put(1,"A");
        firstMap.put(2,"B");
        firstMap.put(3,"C");
        firstMap.put(4,"E");
        HashMap<Integer,String> secondMap = new HashMap<>();
        secondMap.put(4,"D");
        secondMap.put(5,"E");

        firstMap.putAll(secondMap);
        System.out.println(firstMap);
    }
}

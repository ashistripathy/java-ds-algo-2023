package map;

import java.util.*;

public class SortedHashMapByValues {
    public static void main(String [] args){
        //step 1 : create a hash map
        HashMap<String,Integer> map = new HashMap<>();
        map.put("abc",30);
        map.put("abc",20);
        map.put("bcd",50);

        //step 2 : create a list of map entries
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

        //step 3 : sort the list based on values
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        //step 4 : create a LinkedHashMap to preserve the order of the sorted entries
        LinkedHashMap<String,Integer> sortedMap = new LinkedHashMap<>();

        //step 6 : store entries in LinkedHashMap
        for(Map.Entry<String,Integer> entry : list){
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        //step 7 : print the HashMap
        System.out.println(sortedMap);
    }
}

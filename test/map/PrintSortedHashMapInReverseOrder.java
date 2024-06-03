package map;

import java.util.*;

public class PrintSortedHashMapInReverseOrder {
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

        //step 5 :using list iterator to print the sortedMap in reverse order
        ListIterator<Map.Entry<String,Integer>> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
            Map.Entry<String,Integer> entry = iterator.previous();
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        //step 6 : print the HashMap
        System.out.println(sortedMap);
    }
}

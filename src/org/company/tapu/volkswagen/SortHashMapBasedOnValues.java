package org.company.tapu.volkswagen;

import java.util.*;

public class SortHashMapBasedOnValues {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("Ashis",55000);
        map.put("Rajesh",50000);
        map.put("Tapan",65000);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        LinkedHashMap<String,Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<String,Integer> entry : list){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Sorted Hash Map by values "+sortedMap);
    }
}

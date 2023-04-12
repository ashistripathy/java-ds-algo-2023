package org.company.tapu.infy;

import java.util.*;
import java.util.stream.Collectors;

public class MaxCountInIntegerArray {
    public static void main(String [] args){
        List<Integer> list = new Random().ints(10,1,11)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        int maxCount =0;
        Map<Integer,Integer> countMap = new HashMap<>();

        for(Integer num : list){
            if(countMap.containsKey(num)){
                int count = countMap.get(num)+1;
                countMap.put(num,count);
                if(count > maxCount){
                    maxCount = count;
                }
            }else{
                countMap.put(num,1);
            }
        }
        System.out.println("Highest count of duplicate is " + maxCount);
    }
}

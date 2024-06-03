package org.company.tapu.accolite;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesInSortedArray {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1,2,3,4,4,5,5,6);

        //input : 1,2,3,4,4,5,5,6
        //output : 4,5
        Set items = new HashSet<>();

        list.stream().filter(x -> !items.add(x) ).collect(Collectors.toList()).forEach(System.out::println);



    }
}

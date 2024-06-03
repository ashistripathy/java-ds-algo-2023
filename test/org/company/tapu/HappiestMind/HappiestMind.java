package org.company.tapu.HappiestMind;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HappiestMind<T> {
    T obj;

    HappiestMind(T obj){
        this.obj = obj;
        System.out.println(this.obj);
    }
    public static void main(String[] args) {
        int [] arr = {8,7,5,3,2,1};
        List<Integer> list = Arrays.asList(8,7,5,3,2,1);

        int [] printArray = Arrays.stream(arr).map(n->n*n).toArray();
        System.out.println(Arrays.toString(printArray));
        list.stream().map(x->x*x).collect(Collectors.toList()).forEach(System.out::println);



        HappiestMind hm = new HappiestMind("Happiest Mind");
    }
}

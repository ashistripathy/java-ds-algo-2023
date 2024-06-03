package org.company.tapu.sapiens;

import java.util.Arrays;
import java.util.List;

public class FirstDuplicate {
    public static void main(String ... args){
        List<Integer> list = Arrays.asList(2,3,2,1,3);

        Integer firstDuplicate = list.stream()
                .filter(n -> n.equals(n))
                .findFirst().orElse(0);
        System.out.println(firstDuplicate);
    }
}

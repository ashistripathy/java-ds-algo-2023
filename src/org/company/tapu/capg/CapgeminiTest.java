package org.company.tapu.capg;

import java.util.Arrays;

public class CapgeminiTest {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5};

        Integer secondHighestElement = Arrays.stream(arr).map(x -> x * x)
                .sorted()
                .distinct()
                .skip(arr.length - 2)
                .findFirst().orElse(0);
        System.out.println(secondHighestElement);
    }
}

package org.company.tapu.capg;

import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String ... args){
        Stream.iterate(new int[] {0,1},n  ->  new int [] {n[1],n[0]+n[1]})
                .map(n -> n[0])
                .limit(11)
                .forEach(System.out::println);
    }
}

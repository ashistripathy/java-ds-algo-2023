package org.company.tapu.globallogic;

import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfCharacter {
    public static void main(String[] args) {
        String str = "sureshbalasubramanian";
        str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((key,value)->{
                    System.out.println("Character : "+key+" Repeat Count : "+value);
                });
    }
}

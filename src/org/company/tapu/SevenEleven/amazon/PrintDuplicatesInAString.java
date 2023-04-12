package org.company.tapu.SevenEleven.amazon;

import java.util.stream.Collectors;

public class PrintDuplicatesInAString {
    public static void main(String [] args){
        String str = "aaaabbbbbbcccccdeffffghiiiijklllllmnnno";
        str.chars().mapToObj(c->(char)c).collect(Collectors.toList());
    }
}

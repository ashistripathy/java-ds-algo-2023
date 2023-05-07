package adi.walmart;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacterInString {
    public static void main(String[] args) {
        String str = "sureshbalasubramanian";

        Map<Character,Integer> map = new HashMap<>();
        System.out.println("** FIRST APPROACH USING TRADITIONAL HASH MAP **");

        for(char c : str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " appears "+entry.getValue() + " times. ");
            }
        }
        System.out.println("** SECOND APPROACH USING STREAM API **");

        Map<Character, Long> charFreq = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charFreq.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " appears "+entry.getValue()+" times."));
    }
}

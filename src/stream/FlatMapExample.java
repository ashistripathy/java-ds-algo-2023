package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String [] args){
        List<String> strings = Arrays.asList("Ashis","Tripathy");

        strings.stream()
                .flatMap(str -> str.chars().mapToObj(c->(char)c))
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}

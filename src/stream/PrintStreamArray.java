package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class PrintStreamArray {
    public static void main(String ... args){
        List<String> names = Arrays.asList("Alice","Bob","Charlie","David","Bob");

        names.stream()
                .filter(name -> name.length() > 4)
                .map(name->name.toUpperCase(Locale.ROOT))
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

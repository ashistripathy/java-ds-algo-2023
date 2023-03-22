package accolite;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintDuplicateUsingStream {
    public static void main(String ... args){
        Stream<Integer> stream = Stream.of(5,13,4,21,32,21,32,33,45,55,66,55);
        System.out.println(findDuplicates(stream));
    }
    public static <T>Set<T> findDuplicates(Stream<T> stream){
        Set<T> items = new HashSet<>();
        return stream.filter(n->!items.add(n)).collect(Collectors.toSet());
    }
}

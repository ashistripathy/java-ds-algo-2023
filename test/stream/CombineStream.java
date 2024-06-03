package test.stream;

import java.util.stream.Stream;

public class CombineStream {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("one","two");
        Stream<String> stream2 = Stream.of("three","four");

        Stream<String> flatResult = Stream.of(stream1,stream2).flatMap(stream -> stream).filter(str -> !str.equals("three"));
        flatResult.forEach(System.out::println);
    }
}
